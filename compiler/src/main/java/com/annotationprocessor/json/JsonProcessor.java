package com.annotationprocessor.json;

import com.api.Jsonify;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;

import static java.util.Collections.singleton;
import static javax.lang.model.SourceVersion.latestSupported;
import static com.squareup.javapoet.JavaFile.builder;

@AutoService(Processor.class)
public class JsonProcessor extends AbstractProcessor{

    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
    }

    @Override
    public Set getSupportedAnnotationTypes() {
        return singleton(Jsonify.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return latestSupported();
    }

    @Override
    public boolean process(Set annotations, RoundEnvironment roundEnv) {

        for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(Jsonify.class)) {

            if(!validateAnnotatedElement(annotatedElement)){
                return true;
            }

            Jsonify jsonify = annotatedElement.getAnnotation(Jsonify.class);
            VariableElement element = (VariableElement)annotatedElement;

            generateClass(element);
        }

        return true;
    }

    private void generateClass(VariableElement element) {
        try {
            String packageName = getPackageName(processingEnv.getElementUtils(), element);
            List<TypeSpec> models = ModelCreator.createObjectModel(packageName, element.getSimpleName().toString(), (String) element.getConstantValue());

            for(TypeSpec model : models) {
                JavaFile javaFile = builder(packageName, model).build();
                javaFile.writeTo(processingEnv.getFiler());
            }
        } catch (Exception e){
            error(element, "Failed to write java class for model %s", element.getSimpleName().toString());
        }
    }

    static String getPackageName(Elements elementUtils, VariableElement type) {
        PackageElement pkg = elementUtils.getPackageOf(type);
        if (pkg.isUnnamed()) {
            throw new IllegalArgumentException(type.toString());
        }
        return pkg.getQualifiedName().toString();
    }

    private boolean validateAnnotatedElement(Element annotatedElement){
        if(annotatedElement.getKind() != ElementKind.FIELD){
            error(annotatedElement, "Only fields can be annotated with @%s", Jsonify.class.getSimpleName());
            return false;
        }

        VariableElement element = (VariableElement)annotatedElement;

        if(!element.asType().toString().equals(String.class.getCanonicalName())){
            error(annotatedElement, "Only String class can be annotated with @%s. Was type %s", Jsonify.class.getSimpleName(), element.asType());
            return false;
        }

        if(!annotatedElement.getModifiers().contains(Modifier.FINAL)){
            error(annotatedElement, "String must be marked as final to be annotated with @%s.", Jsonify.class.getSimpleName());
            return false;
        }

        return true;
    }



    private void error(Element e, String msg, Object... args) {
        messager.printMessage(
                Diagnostic.Kind.ERROR,
                String.format(msg, args),
                e);
    }

    private void info(Element e, String msg, Object... args) {
        messager.printMessage(
                Diagnostic.Kind.NOTE,
                String.format(msg, args),
                e);
    }
}

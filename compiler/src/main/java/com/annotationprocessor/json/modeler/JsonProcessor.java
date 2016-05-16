package com.annotationprocessor.json.modeler;

import com.annotationprocessor.json.utils.PackageUtils;
import com.mycardboarddreams.api.Jsonify;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.JavaFile;

import org.json.JSONObject;

import java.util.Arrays;
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
import javax.lang.model.element.VariableElement;
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
    public Set<String> getSupportedAnnotationTypes() {
        return singleton(Jsonify.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return latestSupported();
    }

    @Override
    public boolean process(Set annotations, RoundEnvironment roundEnv) {

        if(roundEnv.getElementsAnnotatedWith(Jsonify.class).size() > 0 && !ModelCreator.processedClasses.isEmpty()){
            messager.printMessage(Diagnostic.Kind.ERROR, "Did Json parsing in more than one round...");
            return true;
        }

        for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(Jsonify.class)) {

            try {
                if (!validateAnnotatedElement(annotatedElement)) {
                    error(annotatedElement, "Failed to process annotation for %s. Is not a valid target.", annotatedElement.getSimpleName().toString());
                    return true;
                }

                Jsonify jsonify = annotatedElement.getAnnotation(Jsonify.class);
                String[] ignore = jsonify.ignoreBeginsWith();
                VariableElement element = (VariableElement) annotatedElement;

                String packageName = PackageUtils.getPackageName(processingEnv.getElementUtils(), element) + ".models";

                ModelCreator modelCreator = new ModelCreator(Arrays.asList(ignore), packageName);
                modelCreator.createObjectModel(
                        element.getSimpleName().toString(),
                        new JSONObject((String) element.getConstantValue()));

            } catch (Exception e){
                error(annotatedElement, "Failed to generate annotated class for model %s. \n%s", annotatedElement.getSimpleName().toString(), e.getMessage());
                return true;
            }
        }

        generateClasses();

        return true;
    }

    private void generateClasses() {
        if(ModelCreator.processedClasses.size() == 0)
            return;

        StringBuilder sb = new StringBuilder("Writing Java Classes: [");
        try {
            for(AnnotatedClass model : ModelCreator.processedClasses) {
                sb.append(model.getClassName()).append(", ");
                JavaFile javaFile = builder(model.getPackageName(), model.getSpec()).build();
                javaFile.writeTo(processingEnv.getFiler());
            }

            sb.append("]");
            System.out.println(sb.toString());
        } catch (Exception e){
            messager.printMessage(Diagnostic.Kind.ERROR, String.format("Failed to write java class.\n %s", e.getMessage()));
        } finally {
            ModelCreator.processedClasses.clear();
        }
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

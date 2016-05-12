package com.annotationprocessor.json.viewports;

import com.annotationprocessor.json.utils.PackageUtils;
import com.annotationprocessor.json.utils.StringUtils;
import com.google.auto.service.AutoService;
import com.mycardboarddreams.api.LayoutXml;
import com.mycardboarddreams.api.Viewport;
import com.mycardboarddreams.api.base.Presenter;
import com.mycardboarddreams.api.base.PresenterActivity;
import com.mycardboarddreams.api.generated.Consumes;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic;

import rx.Observable;

import static com.squareup.javapoet.JavaFile.builder;
import static com.squareup.javapoet.TypeSpec.classBuilder;
import static java.util.Collections.singleton;
import static javax.lang.model.SourceVersion.latestSupported;
import static javax.lang.model.element.Modifier.PROTECTED;
import static javax.lang.model.element.Modifier.PUBLIC;

/**
 * Created on 16-05-05.
 */
@AutoService(Processor.class)
public class ViewportProcessor extends AbstractProcessor{

    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return singleton(Viewport.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return latestSupported();
    }

    @Override
    public boolean process(Set annotations, RoundEnvironment roundEnv) {

        for (Element annotatedElement : roundEnv.getElementsAnnotatedWith(Viewport.class)) {
            Viewport annotation = annotatedElement.getAnnotation(Viewport.class);

            try {
                switch (annotation.type()) {
                    case Activity:
                        createActivity(annotation, annotatedElement);
                        break;
                    case Fragment:
                        break;
                    case CustomView:
                        break;
                }
            } catch (IOException e){
                return true;
            }
        }
        return true;
    }

    private void createActivity(Viewport annotation, Element annotatedElement) throws IOException {
        String name = StringUtils.capitalize(annotation.consumes()) + "Activity";

        messager.printMessage(Diagnostic.Kind.NOTE, "Creating class: " + name);
        VariableElement element = (VariableElement) annotatedElement;

        String packageName = PackageUtils.getPackageName(processingEnv.getElementUtils(), element) + ".activities";

        int layoutId = (int) element.getConstantValue();

        AnnotationSpec consumes = AnnotationSpec.builder(Consumes.class).addMember("value", "\"" + annotation.consumes() + "\"").build();
        AnnotationSpec layout = AnnotationSpec.builder(LayoutXml.class).addMember("value", String.valueOf(layoutId)).build();

        TypeName typeClass = ClassName.get("com.mycardboarddreams.autogenerator.json.models", "CollectionListing");

        TypeSpec.Builder activityBuilder = classBuilder(name)
                .addModifiers(PUBLIC)
                .addAnnotation(consumes)
                .addAnnotation(layout)
                .superclass(ParameterizedTypeName.get(ClassName.get(PresenterActivity.class), typeClass));


        activityBuilder.addMethod(MethodSpec.methodBuilder("getProvider")
                .addAnnotation(AnnotationSpec.builder(Override.class).build())
                .addStatement("$T consumes = getClass().getAnnotation($T.class)", Consumes.class, Consumes.class)
                .addStatement("return new $T().getObservable(consumes.value())", ClassName.get("com.mycardboarddreams.autogenerator.json", "FullRetrofitProvider"))
                .addModifiers(PROTECTED)
                .returns(ParameterizedTypeName.get(ClassName.get(Observable.class), typeClass))
                .build());

//        Class clazz = Presenter.class;
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method  method : methods){
//
//            MethodSpec.Builder spec = MethodSpec.methodBuilder(method.getName())
//                    .addAnnotation(AnnotationSpec.builder(Override.class).build())
//                    .addModifiers(PUBLIC);
//
//            Class<?>[] pType  = method.getParameterTypes();
//            Type[] gpType = method.getGenericParameterTypes();
//            Parameter[] parameters = method.getParameters();
//            for (int i = 0; i < pType.length; i++) {
//                if(pType[i].equals(gpType[i])) {
//                    spec.addParameter(ParameterSpec.builder(pType[i], parameters[i].getName()).build());
//                } else {
//                    spec.addParameter(ParameterSpec.builder(typeClass, parameters[i].getName()).build());
//                }
//            }
//
//            activityBuilder.addMethod(spec.build());
//        }


        JavaFile stringJavaFile = builder(packageName, activityBuilder.build()).build();
        stringJavaFile.writeTo(processingEnv.getFiler());
    }
}

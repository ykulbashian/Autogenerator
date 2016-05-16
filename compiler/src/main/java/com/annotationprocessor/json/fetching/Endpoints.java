package com.annotationprocessor.json.fetching;

import com.annotationprocessor.json.ReferenceCatalogue;
import com.mycardboarddreams.api.base.RetrofitProvider;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.Diagnostic;

import static com.squareup.javapoet.JavaFile.builder;
import static com.squareup.javapoet.TypeSpec.classBuilder;
import static com.squareup.javapoet.TypeSpec.interfaceBuilder;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PROTECTED;
import static javax.lang.model.element.Modifier.PUBLIC;

/**
 * Created by ykulbashian on 16-05-11.
 */
public class Endpoints extends ArrayList<Endpoint> {

    private final String modelPackageName;
    private final String endpointPackage;

    public Endpoints(String modelPackage, String endpointPackage){
        this.modelPackageName = modelPackage;
        this.endpointPackage = endpointPackage;
    }

    public void publish(Messager messager, ProcessingEnvironment processingEnv){

        TypeSpec.Builder jsonStringBuilder = classBuilder("EndpointJsonStrings")
                .addModifiers(PUBLIC, FINAL);

        TypeSpec.Builder serviceBuilder = interfaceBuilder("EndpointService")
                .addModifiers(PUBLIC);

        for(Endpoint endpoint : this){
            try {
                if (endpoint.isComplete()) {
                    jsonStringBuilder.addField(endpoint.getFieldSpec().build());
                    serviceBuilder.addMethod(endpoint.getServiceMethod(modelPackageName).build());
                } else {
                    messager.printMessage(Diagnostic.Kind.NOTE, String.format("Unable to complete url %s", endpoint.getBaseUrl()));
                }
            } catch (MissingKeyException e) {
                messager.printMessage(Diagnostic.Kind.NOTE, String.format("Unable to complete url %s\n%s", endpoint.getBaseUrl(), e.getMessage()));
            } catch (Exception e){
                messager.printMessage(Diagnostic.Kind.ERROR, String.format("Failed to fetch Json for annotation %s.\n%s ", endpoint.getEndpoint(), e.getMessage()));
                return;
            }
        }


        try {
            JavaFile stringJavaFile = builder(endpointPackage, jsonStringBuilder.build()).build();
            stringJavaFile.writeTo(processingEnv.getFiler());

            TypeSpec serviceClass = serviceBuilder.build();
            JavaFile serviceJavaFile = builder(endpointPackage, serviceClass).build();
            serviceJavaFile.writeTo(processingEnv.getFiler());

            createRetrofitProvider(serviceClass, processingEnv);

        } catch (IOException e){
            messager.printMessage(Diagnostic.Kind.ERROR, "Failed to write java file. " + e.getMessage());
        } catch (MissingKeyException e) {
            messager.printMessage(Diagnostic.Kind.ERROR, "Failed to write java file. " + e.getMessage());
        }
    }

    private void createRetrofitProvider(TypeSpec serviceClass, ProcessingEnvironment processingEnv) throws IOException, MissingKeyException {

        TypeSpec.Builder retrofitBuilder = classBuilder("FullRetrofitProvider")
                .addModifiers(PUBLIC)
                .superclass(ParameterizedTypeName.get(ClassName.get(RetrofitProvider.class), ClassName.get(endpointPackage, serviceClass.name)))
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(PUBLIC)
                        .addStatement("super()")
                        .build())
                .addMethod(MethodSpec.methodBuilder("getInterfaces")
                        .addStatement("return " + serviceClass.name + ".class")
                        .addAnnotation(AnnotationSpec.builder(Override.class).build())
                        .returns(ParameterizedTypeName.get(ClassName.get(Class.class), ClassName.get(endpointPackage, serviceClass.name)))
                        .addModifiers(PROTECTED)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getHost")
                        .addStatement("return \"https://" + ReferenceCatalogue.getBlockFor("host").deliver().toString() +"/\"")
                        .returns(String.class)
                        .addModifiers(PROTECTED)
                        .build());

        for(Endpoint endpoint : this){
            retrofitBuilder.addMethod(endpoint.getRetrofitAdapterMethod(modelPackageName));
        }

        TypeSpec retrofitClass = retrofitBuilder.build();
        JavaFile retrofitJavaFile = builder(endpointPackage, retrofitClass).build();
        retrofitJavaFile.writeTo(processingEnv.getFiler());
    }

}

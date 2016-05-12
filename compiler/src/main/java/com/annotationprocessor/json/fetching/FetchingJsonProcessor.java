package com.annotationprocessor.json.fetching;

import com.google.auto.service.AutoService;
import com.mycardboarddreams.api.FetchJson;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.VariableElement;

import static com.annotationprocessor.json.ReferenceCatalogue.getEndpointPackage;
import static com.annotationprocessor.json.ReferenceCatalogue.getModelPackage;
import static java.util.Collections.singleton;
import static javax.lang.model.SourceVersion.latestSupported;

/**
 * Created on 16-04-21.
 */
@AutoService(Processor.class)
public class FetchingJsonProcessor extends AbstractProcessor {

    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
    }

    @Override
    public Set getSupportedAnnotationTypes() {
        return singleton(FetchJson.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return latestSupported();
    }

    @Override
    public boolean process(Set annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> elementsAnnotatedWith = roundEnv.getElementsAnnotatedWith(FetchJson.class);
        if(elementsAnnotatedWith.size() == 0)
            return true;

        String packageName = getEndpointPackage(processingEnv, elementsAnnotatedWith);
        String modelPackageName = getModelPackage(processingEnv, elementsAnnotatedWith);

        Endpoints endpoints = new Endpoints(modelPackageName, packageName);

        for (Element annotatedElement : elementsAnnotatedWith) {

            if(annotatedElement.getKind() == ElementKind.FIELD){
                VariableElement element = ((VariableElement) annotatedElement);

                Endpoint endpoint = new Endpoint(element);
                endpoints.add(endpoint);

            }
        }

        endpoints.publish(messager, processingEnv);

        return true;
    }

}

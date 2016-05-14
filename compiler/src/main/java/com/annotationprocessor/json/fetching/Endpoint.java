package com.annotationprocessor.json.fetching;

import android.text.TextUtils;

import com.annotationprocessor.json.ReferenceCatalogue;
import com.annotationprocessor.json.blocks.Block;
import com.annotationprocessor.json.mocks.MockResponseInterceptor;
import com.annotationprocessor.json.utils.StringUtils;
import com.mycardboarddreams.api.FetchJson;
import com.mycardboarddreams.api.Jsonify;
import com.mycardboarddreams.api.generated.Produces;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.lang.model.element.VariableElement;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rx.Observable;

import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

/**
 * Created on 16-04-24.
 */
public class Endpoint implements Block<String> {

    private final List<String> replacements = new ArrayList<>();
    private String json = null;

    private final FetchJson annotation;
    private final VariableElement annotatedElement;

    public Endpoint(VariableElement annotatedElement){
        this.annotatedElement = annotatedElement;
        this.annotation = annotatedElement.getAnnotation(FetchJson.class);

        parseString();
    }

    private void parseString() {
        String baseUrl = annotation.value();

        Pattern p = Pattern.compile("\\{(\\w+)\\}");
        Matcher m = p.matcher(baseUrl);

        while (m.find()) {
            int count = m.groupCount();

            for (int i = 1; i <= count; i++) {
                String contents = m.group(i);
                replacements.add(contents);
            }
        }

    }

    public String getBaseUrl() {
        return annotation.value();
    }

    public String getEndpoint() {
        return annotatedElement.getSimpleName().toString();
    }

    public List<String> getParameters(){
        return new ArrayList<>(replacements);
    }

    public String getMethodName(){
        return "get" + StringUtils.capitalize(getEndpoint());
    }

    public FieldSpec.Builder getFieldSpec() throws IOException, MissingKeyException {
        if(json == null){
            json = fetchJson();
        }

        AnnotationSpec annotationSpec = AnnotationSpec.builder(Jsonify.class).build();
        return FieldSpec.builder(String.class, getEndpoint())
                .initializer("$S", json)
                .addAnnotation(annotationSpec)
                .addModifiers(PUBLIC, FINAL, STATIC);

    }

    public MethodSpec.Builder getServiceMethod(String packageName) throws MissingKeyException {
        MethodSpec.Builder builder = getProducerMethod(packageName).addModifiers(ABSTRACT);
        AnnotationSpec retrofitAnnotation = AnnotationSpec.builder(GET.class)
                .addMember("value", "\"" + getBaseUrl() + "\"")
                .build();

        AnnotationSpec headerAnnotation = AnnotationSpec.builder(Headers.class)
                .addMember("value", "{\"Authorization: " + ReferenceCatalogue.getBlockFor("authorization").deliver().toString() + "\"}")
                .build();

        builder.addAnnotation(retrofitAnnotation);
        builder.addAnnotation(headerAnnotation);

        return builder;
    }

    public MethodSpec.Builder getProducerMethod(String packageName) throws MissingKeyException {

        AnnotationSpec serviceAnnotation = AnnotationSpec.builder(Produces.class).addMember("value", "\"" + getEndpoint() + "\"").build();
        MethodSpec.Builder methodSpec = MethodSpec.methodBuilder(getMethodName())
                .addAnnotation(serviceAnnotation)
                .addModifiers(PUBLIC);

        for(String key : replacements){
            AnnotationSpec annotationSpec = AnnotationSpec.builder(Path.class).addMember("value", "\"" + key + "\"").build();
            ParameterSpec parameterSpec = ParameterSpec.builder(String.class, key)
                    .addAnnotation(annotationSpec)
                    .build();
            methodSpec.addParameter(parameterSpec);
        }

        ParameterizedTypeName returnType = getReturnType(packageName);
        methodSpec.returns(returnType);

        return methodSpec;
    }

    public ParameterizedTypeName getReturnType(String packageName) {
        TypeName returnTypeName = ClassName.get(packageName, StringUtils.asClassName(getEndpoint()));

        return ParameterizedTypeName.get(ClassName.get(Observable.class), returnTypeName);
    }

    public String fetchJson() throws MissingKeyException, IOException {
        if(!isComplete()){
            List<String> incompleteKeys = getIncompleteKeys();
            throw new MissingKeyException(String.format("Could not find replacement for key %s", StringUtils.join(", ", incompleteKeys)));
        }

        String completedUrl = completeUrl();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new MockResponseInterceptor())
                .build();

        System.out.println(String.format("Fetching from %s", completedUrl));

        Request request = new Request.Builder()
                .url(completedUrl)
                .header("Authorization", ReferenceCatalogue.getBlockFor("authorization").deliver().toString())
                .header("X-Shopify-Customer-Access-Token", ReferenceCatalogue.getBlockFor("customertoken").deliver().toString())
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);

        return response.body().string();
    }

    public boolean isComplete(){
        for(String id : replacements){
            if(!ReferenceCatalogue.hasBlockFor(id))
                return false;
        }
        return true;
    }

    private List<String> getIncompleteKeys(){
        List<String> incompleteKeys = new ArrayList<>();

        for(String id : replacements){
            if(!ReferenceCatalogue.hasBlockFor(id))
                incompleteKeys.add(id);
        }

        return incompleteKeys;
    }

    private String completeUrl() throws MissingKeyException {
        String output = annotation.value();
        for(String key : replacements){
            if(ReferenceCatalogue.hasBlockFor(key)) {
                output = output.replace("{" + key + "}", ReferenceCatalogue.getBlockFor(key).deliver().toString());
            } else {
                List<String> incompleteKeys = getIncompleteKeys();
                throw new MissingKeyException(String.format("Could not find replacement for key %s", StringUtils.join(", ", incompleteKeys)));
            }
        }

        return output;
    }

    public MethodSpec getRetrofitAdapterMethod(String modelPackage){

        List<String> parameters = getParameters();
        List<String> args = new ArrayList<>();
        for(String param : parameters){
            args.add("\"" + ReferenceCatalogue.getBlockFor(param).deliver() + "\"");
        }

        MethodSpec.Builder builder = MethodSpec.methodBuilder(getMethodName())
                .addStatement(String.format("return proxy." + getMethodName() + "(%s)", TextUtils.join(", ", args)))
                .addModifiers(PUBLIC)
                .returns(getReturnType(modelPackage));

        return builder.build();
    }

    @Override
    public String getKey() {
        return getEndpoint();
    }

    @Override
    public String deliver() {
        return null;
    }

    @Override
    public void publish() {
        //TODO needs to be filled
    }

    @Override
    public String[] requiredKeys() {
        return replacements.toArray(new String[replacements.size()]);
    }
}

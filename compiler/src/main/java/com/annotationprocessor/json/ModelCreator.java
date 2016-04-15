package com.annotationprocessor.json;

import com.annotationprocessor.json.utils.StringUtils;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.squareup.javapoet.TypeSpec.classBuilder;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PUBLIC;
import static com.annotationprocessor.json.utils.StringUtils.capitalize;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class ModelCreator {

    public static List<TypeSpec> createObjectModel(String packageName, String rootClassname, String jsonContents) throws JSONException {

        JSONObject json = new JSONObject(jsonContents);

        return createObjectModel(packageName, rootClassname, json);
    }

    private static List<TypeSpec> createObjectModel(String packageName, String rootClassname, JSONObject json) {
        List<TypeSpec> allContainedElements = new ArrayList<>();

        TypeSpec.Builder builder = classBuilder(capitalize(rootClassname))
                .addModifiers(PUBLIC, FINAL);

        Iterator<String> keys = json.keys();

        while(keys.hasNext()){
            String fieldName = keys.next();
            Object value = json.get(fieldName);

            if(value instanceof Integer){
                builder.addField(TypeName.INT, fieldName, PUBLIC);
            } else if(value instanceof String){
                builder.addField(String.class, fieldName, PUBLIC);
            } else if(value instanceof Double) {
                builder.addField(TypeName.DOUBLE, fieldName, PUBLIC);
            } else {
                if(value instanceof JSONObject){
                    List<TypeSpec> models = createObjectModel(packageName, fieldName, (JSONObject) value);
                    allContainedElements.addAll(models);

                    ClassName fieldType = ClassName.get(packageName, capitalize(fieldName));
                    builder.addField(fieldType, fieldName, PUBLIC);
                } else if(value instanceof JSONArray){
                    List<TypeSpec> models = createArrayModel(packageName, fieldName, (JSONArray) value);
                    allContainedElements.addAll(models);

                    ClassName fieldType = ClassName.get(packageName, capitalize(fieldName));
                    builder.addField(ArrayTypeName.of(fieldType), fieldName, PUBLIC);
                }
            }

        }

        allContainedElements.add(builder.build());

        return allContainedElements;
    }

    private static List<TypeSpec> createArrayModel(String packageName, String rootClassname, JSONArray json){
        List<TypeSpec> allContainedElements = new ArrayList<>();

        String capitalize = removePluralization(capitalize(rootClassname));

        if(json.length() > 0){
            Object firstEntry = json.get(0);
            if(firstEntry instanceof JSONObject){
                allContainedElements.addAll(createObjectModel(packageName, capitalize, (JSONObject)firstEntry));
            } else {
                throw new JSONException("Can't have nested arrays!");
            }
        }

        return allContainedElements;
    }

    private static String removePluralization(String fieldName){
        if(fieldName.toLowerCase().endsWith("s") && fieldName.length() > 1)
            return fieldName.substring(0, fieldName.length()-1);

        return fieldName;
    }
}

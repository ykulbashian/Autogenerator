package com.annotationprocessor.json.modeler;

import com.annotationprocessor.json.utils.StringUtils;
import com.mycardboarddreams.api.ApiModel;
import com.squareup.javapoet.AnnotationSpec;
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

import static com.annotationprocessor.json.utils.StringUtils.sanitizeName;
import static com.squareup.javapoet.TypeSpec.classBuilder;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PUBLIC;
import static com.annotationprocessor.json.utils.StringUtils.capitalize;
import static com.annotationprocessor.json.utils.StringUtils.removePluralization;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class ModelCreator {

    public static final List<AnnotatedClass> processedClasses = new ArrayList<>();
    private final String basePackageName;
    private final List<String> ignoreBeginsWith;

    private boolean shouldIgnoreClass(String className){
        return StringUtils.containsBeginsWith(ignoreBeginsWith, className);
    }

    public ModelCreator(List<String> ignoreBeginsWith, String basePackageName){
        this.ignoreBeginsWith = ignoreBeginsWith;
        this.basePackageName = basePackageName;
    }

    public List<AnnotatedClass> createObjectModel(String rootPackageName, String jsonContents) throws JSONException {

        JSONObject json = new JSONObject(jsonContents);
        List<AnnotatedClass> allContainedElements = new ArrayList<>();

        Iterator<String> keys = json.keys();

        while(keys.hasNext()) {
            String fieldName = keys.next();
            Object value = json.get(fieldName);

            generateFieldType(rootPackageName, fieldName, value);
        }

        return allContainedElements;
    }

    private AnnotatedClass createObjectModel(String rootPackagename, String rootClassname, JSONObject json) throws JSONException {

        String capitalizedClassname = removePluralization(capitalize(rootClassname));

        String nestedPackageName = getPackageName(rootPackagename, capitalizedClassname);

        ClassName serializer = ClassName.get(ApiModel.class);
        AnnotationSpec annotationSpec =  AnnotationSpec.builder(serializer).addMember("value", "\"" + generateIdPath(rootPackagename, rootClassname) + "\"").build();

        TypeSpec.Builder builder = classBuilder(capitalizedClassname)
                .addModifiers(PUBLIC, FINAL)
                .addAnnotation(annotationSpec);

        Iterator<String> keys = json.keys();

        AnnotatedClass objectModel = new AnnotatedClass(rootPackagename, capitalizedClassname, builder);

        while(keys.hasNext()){
            String fieldName = keys.next();
            Object value = json.get(fieldName);

            TypeName fullTypeName = generateFieldType(nestedPackageName, fieldName, value);

            if(!fullTypeName.equals(TypeName.OBJECT) && !fullTypeName.equals(ArrayTypeName.of(TypeName.OBJECT))) {
                objectModel.addField(fieldName, fullTypeName);
            }
        }

        return resolveMergeConflictsAndSave(objectModel);
    }

    private TypeName generateFieldType(String nestedPackageName, String fieldName, Object value) throws JSONException {

        String className = removePluralization(capitalize(fieldName));

        if(value instanceof JSONObject){
            if(((JSONObject) value).length() == 0)
                return TypeName.OBJECT;

            AnnotatedClass objectModel = createObjectModel(nestedPackageName, fieldName, (JSONObject) value);

            return ClassName.get(objectModel.getPackageName(), objectModel.getClassName());
        } else if(value instanceof Integer){
            return TypeName.LONG;
        } else if(value instanceof String){
            return TypeName.get(String.class);
        } else if(value instanceof Double) {
            return TypeName.DOUBLE;
        } else if(value instanceof Long) {
            return TypeName.LONG;
        } else if(value instanceof Boolean) {
            return TypeName.BOOLEAN;
        } else if(value == JSONObject.NULL) {
            return TypeName.OBJECT;
        } else if(value instanceof JSONArray){

            JSONArray jsonArray = (JSONArray) value;

            if(jsonArray.length() > 0){
                try {
                    Object firstEntry = jsonArray.get(0);

                    if(firstEntry instanceof JSONArray)
                        throw new JSONException(String.format("Can't have nested arrays! Found at: %s", fieldName));

                    TypeName typeName = generateFieldType(nestedPackageName, fieldName, firstEntry);
                    return ArrayTypeName.of(typeName);
                } catch (Exception e){
                    throw new JSONException(String.format("Unable to get first item for array %s. \nError: %s", fieldName, e.getMessage()));
                }
            } else {
                return TypeName.OBJECT;
            }
        } else {
            throw new JSONException(String.format("Unknown array item type! Found at: %s, value %s", className, value.getClass()));
        }

    }

    private String getPackageName(String packageName, String className){
        if (!shouldIgnoreClass(className) || existsWithSameCanonicalPath(packageName + "." + className))
            return packageName + "." + removePluralization(sanitizeName(className)).toLowerCase();
        else
            return packageName;
    }

    private AnnotatedClass resolveMergeConflictsAndSave(AnnotatedClass candidate){

        if(processedClasses.contains(candidate)){
            int startFromIndex = 0;
            int index = processedClasses.indexOf(candidate);
            while(index >= startFromIndex) {
                AnnotatedClass existing = processedClasses.get(index);
                //TODO what if they have the same path but are different objects
                if (existing.hasSameCanonicalPath(candidate) || existing.doFieldsOverlap(candidate)) {
                    existing.copyFields(candidate);
                    return existing;
                }

                startFromIndex = index + 1;
                index = processedClasses.subList(startFromIndex, processedClasses.size()).indexOf(candidate) + startFromIndex;
            }

        }

        if(!shouldIgnoreClass(candidate.getClassName())) {
            processedClasses.add(candidate);
        }

        return candidate;
    }

    private boolean existsWithSameCanonicalPath(String canonicalPath){
        for(AnnotatedClass check : processedClasses){
            if(check.getCanonicalPath().equals(canonicalPath))
                return true;
        }
        return false;
    }

    private String generateIdPath(String nestedPackage, String className){
        String nestedPath = nestedPackage.replace(basePackageName, "");
        return nestedPath + "." + className;
    }
}

package com.annotationprocessor.json.modeler;

import com.annotationprocessor.json.utils.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Modifier;

/**
 * Created by ykulbashian on 16-04-16.
 */
public class AnnotatedClass {

    final List<TypePairing> fields = new ArrayList<>();
    private final String packageName;
    private final String className;
    private final TypeSpec.Builder specBuilder;

    public AnnotatedClass(String packageName, String className, TypeSpec.Builder builder){
        this.packageName = packageName;
        this.className = className;
        this.specBuilder = builder;
    }

    public void addField(String fieldName, TypeName typeName){
        fields.add(new TypePairing(fieldName, typeName));

        ClassName serializer = ClassName.get(SerializedName.class);
        AnnotationSpec annotationSpec =  AnnotationSpec.builder(serializer).addMember("value", "\"" + fieldName + "\"").build();
        FieldSpec newField = FieldSpec.builder(typeName, StringUtils.sanitizeName(fieldName))
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(annotationSpec)
                .build();

        specBuilder.addField(newField);
    }

    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public TypeSpec getSpec() {
        return specBuilder.build();
    }

    public void copyFields(AnnotatedClass otherClass){
        for(TypePairing pairing : otherClass.fields){
            if(!fields.contains(pairing))
                addField(pairing.fieldName, pairing.typeName);
        }
    }

    public String getCanonicalPath(){
        return packageName + "." + className;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof AnnotatedClass))
            return false;

        AnnotatedClass other = (AnnotatedClass)obj;

        return other.getIdentifier().equals(getIdentifier());

    }

    public String getIdentifier(){
        return getClassName();
    }

    public boolean hasSameCanonicalPath(AnnotatedClass other){
        return other.getCanonicalPath().equals(getCanonicalPath());
    }

    public boolean doFieldsOverlap(AnnotatedClass other){
        if(other.fields.size() > fields.size())
            return other.fields.containsAll(fields);
        else
            return fields.containsAll(other.fields);
    }

    @Override
    public int hashCode() {
        return getIdentifier().hashCode();
    }

    public static class TypePairing {

        private final String fieldName;
        private final TypeName typeName;

        public TypePairing(String fieldName, TypeName typeName){
            this.fieldName = fieldName;
            this.typeName = typeName;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null || !(obj instanceof TypePairing))
                return false;

            TypePairing other = (TypePairing)obj;

            return fieldName.equals(other.fieldName) && typeName.equals(other.typeName);
        }

        @Override
        public int hashCode() {
            return 11 * fieldName.hashCode() + typeName.hashCode();
        }
    }

    @Override
    public String toString() {
        return String.format("%s: [%s]", getClassName(), getPackageName());
    }
}

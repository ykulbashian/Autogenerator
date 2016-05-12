package com.annotationprocessor.json.utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class StringUtils {

    private static final List<String> disallowedNames = Arrays.asList( "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" );

    public static String asClassName(String original){
        return removePluralization(capitalize(original));
    }

    public static String capitalize(String input){
        input = sanitizeName(input);

        if(input == null || input.length() == 0)
            return "";
        else
            return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static String removePluralization(String fieldName){
        if(fieldName.toLowerCase().endsWith("ss")) {
            return fieldName;
        }
        if(fieldName.toLowerCase().endsWith("ies")){
            return fieldName.substring(0, fieldName.length()-3) + "y";
        }
        if(fieldName.toLowerCase().endsWith("s") && fieldName.length() > 1) {
            return fieldName.substring(0, fieldName.length() - 1);
        }

        return fieldName;
    }

    public static String sanitizeName(String name){

        while(name.contains("_")){
            int index = name.indexOf('_');
            if(index == name.length() - 1)
                name = name.substring(0, index);
            else
                name = name.substring(0, index) + name.substring(index+1, index+2).toUpperCase() + name.substring(index+2);
        }

        if(disallowedNames.contains(name)) {
            name = "_" + name;
        }

        return name;
    }

    public static boolean containsBeginsWith(List<String> lookIn, String beginsWith){
        for(String check : lookIn){
            if(beginsWith.toLowerCase().startsWith(check.toLowerCase()))
                return true;
        }
        return false;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static String join(CharSequence delimiter, Iterable tokens) {
        StringBuilder sb = new StringBuilder();
        boolean firstTime = true;
        for (Object token: tokens) {
            if (firstTime) {
                firstTime = false;
            } else {
                sb.append(delimiter);
            }
            sb.append(token);
        }
        return sb.toString();
    }

}

package com.annotationprocessor.json.utils;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class StringUtils {

    public static String capitalize(String input){
        if(input == null || input.length() == 0)
            return "";
        else
            return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}

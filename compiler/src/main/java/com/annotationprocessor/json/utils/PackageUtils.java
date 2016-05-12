package com.annotationprocessor.json.utils;

import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;

/**
 * Created on 16-04-24.
 */
public class PackageUtils {


    public static String getPackageName(Elements elementUtils, Element type) {
        PackageElement pkg = elementUtils.getPackageOf(type);
        if (pkg.isUnnamed()) {
            throw new IllegalArgumentException(type.toString());
        }
        return pkg.getQualifiedName().toString();
    }
}

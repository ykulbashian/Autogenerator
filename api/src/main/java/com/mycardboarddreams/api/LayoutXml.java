package com.mycardboarddreams.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created on 16-05-05.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LayoutXml {
    int value();
}

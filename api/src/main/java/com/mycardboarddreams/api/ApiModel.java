package com.mycardboarddreams.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created on 16-04-21.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModel {
    String value();
}

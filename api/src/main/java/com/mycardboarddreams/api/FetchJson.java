package com.mycardboarddreams.api;

/**
 * Created on 16-04-21.
 */
public @interface FetchJson {
    String value();
    String[] authorization() default {};
}

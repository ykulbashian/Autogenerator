package com.mycardboarddreams.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

@Retention(RetentionPolicy.CLASS)
@Target(value = ElementType.FIELD)
public @interface Jsonify {
    String[] ignore() default {};
    String[] ignoreBeginsWith() default {};
    String[] include() default {};
}

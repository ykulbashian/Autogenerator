package com.mycardboarddreams.api;

/**
 * Created on 16-05-05.
 */
public @interface Viewport {

    String consumes();
    ViewType type();


    enum ViewType{
        Activity,
        Fragment,
        CustomView
    }
}

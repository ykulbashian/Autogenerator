package com.mycardboarddreams.autogenerator;

import com.api.Jsonify;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class TestProcessor {

    @Jsonify
    public static final String root = "{" +
            "\"first\":{\"nested\":4}," +
            "\"second\":\"hi\"," +
            "\"array\":[{\"arrField\":1}]" +
            "}";
}

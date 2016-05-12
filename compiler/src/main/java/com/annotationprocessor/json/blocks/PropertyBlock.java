package com.annotationprocessor.json.blocks;

/**
 * Created by ykulbashian on 16-05-11.
 */
public class PropertyBlock implements Block<String> {

    private final String key;
    private final String value;

    public PropertyBlock(String key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String deliver() {
        return value;
    }

    @Override
    public void publish() {

    }

    @Override
    public String[] requiredKeys() {
        return new String[0];
    }
}

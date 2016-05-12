package com.annotationprocessor.json.blocks;

/**
 * Created by ykulbashian on 16-05-11.
 */
public interface Block<T> {
    String getKey();
    T deliver();
    void publish();
    String[] requiredKeys();
}

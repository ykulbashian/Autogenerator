package com.mycardboarddreams.api.base;

import rx.Subscriber;

/**
 * Created by ykulbashian on 16-05-09.
 */
public interface Presenter<T> {
    void onResponse(T response);
    void onError(Throwable error);
}

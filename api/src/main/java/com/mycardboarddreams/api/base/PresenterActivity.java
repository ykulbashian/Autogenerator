package com.mycardboarddreams.api.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.mycardboarddreams.api.LayoutXml;
import com.mycardboarddreams.api.generated.Consumes;

import rx.Observable;
import rx.Subscriber;

/**
 * Created on 16-05-05.
 */
public abstract class PresenterActivity<T> extends Activity implements Presenter<T> {

    private Observable<T> currentObservable;

    private Subscriber<T> subscriber = new Subscriber<T>() {
        @Override
        public void onCompleted() {
            currentObservable = null;
        }

        @Override
        public void onError(Throwable e) {
            PresenterActivity.this.onError(e);
        }

        @Override
        public void onNext(T t) {
            PresenterActivity.this.onResponse(t);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutXml annotation = getClass().getAnnotation(LayoutXml.class);
        int layoutId = annotation.value();

        setContentView(layoutId);

        currentObservable = getProvider();
        Log.e("TAG", "Got provider: " + currentObservable.toString());
    }

    protected abstract Observable<T> getProvider();

    @Override
    protected void onResume() {
        super.onResume();
        if(currentObservable != null)
            currentObservable.subscribe(subscriber);
    }

    @Override
    protected void onPause() {
        super.onPause();

        if(!subscriber.isUnsubscribed())
            subscriber.unsubscribe();
    }

    @Override
    public void onError(Throwable error) {
        Log.e("TAG", "Error: " + error.getMessage());
    }

    @Override
    public void onResponse(T response) {
        Log.e("TAG", "Response: " + response.toString());
    }
}

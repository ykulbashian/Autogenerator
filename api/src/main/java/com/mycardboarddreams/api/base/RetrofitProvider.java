package com.mycardboarddreams.api.base;

import android.text.TextUtils;
import android.util.Log;

import com.mycardboarddreams.api.generated.Produces;
import com.mycardboarddreams.api.mock.MockResponseInterceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by ykulbashian on 16-05-10.
 */
public abstract class RetrofitProvider<I> {

    private final static Map<String, Method> producerMethods = new HashMap<>();
    protected final I proxy;

    public <T> Observable<T> getObservable(String key) {

        try {
            if(producerMethods.containsKey(key)){
                Method proxyMethod = producerMethods.get(key);
                Method call = getClass().getDeclaredMethod(proxyMethod.getName());
                return (Observable<T>) call.invoke(this);
            } else {
                throw new IllegalArgumentException(String.format("Attempted to fetch an @Produces for key %s. There are no such producers.", key));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    protected RetrofitProvider(){
        Class<I> parsableInterface = getInterfaces();

        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        final OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(new MockResponseInterceptor())
                .addInterceptor(logging);

        Retrofit adapter = new Retrofit.Builder()
            .baseUrl(getHost())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
            .client(builder.build())
            .build();
        proxy = adapter.create(parsableInterface);

        if(parsableInterface.isInterface()){
            Method[] methods = parsableInterface.getMethods();
            for(Method method : methods){
                if(method.getReturnType().equals(Observable.class)) {
                    Produces produces = method.getAnnotation(Produces.class);
                    if (produces != null && !TextUtils.isEmpty(produces.value())) {
                        producerMethods.put(produces.value(), method);
                    }
                }
            }

        }
    }

    protected abstract String getHost();

    protected abstract Class<I> getInterfaces();
}

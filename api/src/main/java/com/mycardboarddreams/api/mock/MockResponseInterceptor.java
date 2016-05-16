package com.mycardboarddreams.api.mock;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by ykulbashian on 16-05-14.
 */
public class MockResponseInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        String mockString = getStringForRequest(request);
        JsonObject data = (JsonObject) new JsonParser().parse(mockString);

        return new Response.Builder()
                .message(data.get("message").getAsString())
                .body(ResponseBody.create(MediaType.parse("application/json"), data.get("body").getAsJsonObject().toString()))
                .code(data.get("code").getAsInt())
                .request(request)
                .protocol(Protocol.HTTP_2)
                .build();
        }

    private String getStringForRequest(Request request) {
        if(request.url().encodedPath().contains("collection_listings"))
            return ShopifyMockResponses.shopify103;
        if(request.url().encodedPath().contains("product_listings"))
            return ShopifyMockResponses.shopify0;
        if(request.url().encodedPath().contains("customers"))
            return ShopifyMockResponses.shopify112;

        return null;
    }
}

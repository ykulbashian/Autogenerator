package com.mycardboarddreams.autogenerator;

import com.mycardboarddreams.api.FetchJson;

/**
 * Created on 16-04-21.
 */
public class ShopifyEndpoints {

    @FetchJson("https://{host}/api/apps/{appId}/collection_listings.json")
    public static String collectionListing;

    @FetchJson("https://{host}/api/apps/{appId}/product_listings.json?product_ids={product_ids}")
    public static final String productListing = "productListing";

    @FetchJson("https://{host}/api/customers/{customer_id}.json")
    public static String customer;
}

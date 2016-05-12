package com.mycardboarddreams.autogenerator;

import com.mycardboarddreams.api.FetchJson;

/**
 * Created on 16-04-21.
 */
public class ShopifyEndpoints {

    @FetchJson("https://{host}/api/apps/{appId}/collection_listings.json")
    String collectionListing;


    @FetchJson("https://{host}/api/apps/{appId}/product_listings.json?product_ids={product_id}")
    String productListing;

    @FetchJson("https://{host}/api/customers/{customer_id}.json")
    String customers;
}

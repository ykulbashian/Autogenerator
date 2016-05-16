package com.mycardboarddreams.autogenerator;

import com.mycardboarddreams.api.Viewport;

/**
 * Created on 16-05-05.
 */
public class ViewportConfig {

    @Viewport(consumes = ShopifyEndpoints.productListing, type = Viewport.ViewType.Activity)
    public static final int productActivity = R.layout.activity_product_listing;
}

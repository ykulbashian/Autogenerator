package com.mycardboarddreams.autogenerator;

import com.mycardboarddreams.api.Viewport;

/**
 * Created on 16-05-05.
 */
public class ViewportConfig {

    @Viewport(consumes = "collectionListing", type = Viewport.ViewType.Activity)
    public static final int collectionActivity = R.layout.activity_collection_listing;
}

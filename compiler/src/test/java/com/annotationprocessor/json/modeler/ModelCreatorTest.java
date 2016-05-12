package com.annotationprocessor.json.modeler;

import com.annotationprocessor.json.ShopifyResponses;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ykulbashian on 16-04-17.
 */
public class ModelCreatorTest {

    @Test
    public void processJson() throws IllegalAccessException {
        Field[] fields = ShopifyResponses.class.getFields();
        for(Field field : fields){
            String value = (String)field.get(null);
            new ModelCreator(Arrays.asList("Test", "Shopify", "Body"), "com.packagename").
                    createObjectModel("shopify", value);
        }

        List<AnnotatedClass> allModels = ModelCreator.processedClasses;
    }
}

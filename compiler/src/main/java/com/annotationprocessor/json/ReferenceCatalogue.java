package com.annotationprocessor.json;

import com.annotationprocessor.json.blocks.Block;
import com.annotationprocessor.json.blocks.PropertyBlock;
import com.annotationprocessor.json.utils.PackageUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;

/**
 * Created by ykulbashian on 16-04-27.
 */
public class ReferenceCatalogue {

    private static final List<Block> capturedBlocks = new ArrayList<>();

    static {
        capturedBlocks.add(new PropertyBlock("appId", "123"));
        capturedBlocks.add(new PropertyBlock("host", "fake.myshopify.com"));
        capturedBlocks.add(new PropertyBlock("product_ids", "1234567"));
        capturedBlocks.add(new PropertyBlock("customer_id", "8910111213"));
        capturedBlocks.add(new PropertyBlock("authorization", "fakeauthorization123"));
        capturedBlocks.add(new PropertyBlock("customertoken", "fakecustomer123"));
    }

    public static boolean hasBlockFor(String key){
        for(Block block : capturedBlocks){
            if(block.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public static Block getBlockFor(String key){
        for(Block block : capturedBlocks){
            if(block.getKey().equals(key)){
                return block;
            }
        }
        throw new RuntimeException("Could not find block for key: " + key);
    }

    public static boolean isComplete(Block check){
        String[] dependents = check.requiredKeys();
        for(String req : dependents){
            if(!hasBlockFor(req))
                return false;
        }
        return true;
    }

    public static String getModelPackage(ProcessingEnvironment env, Element element){
        return getEndpointPackage(env, element) + ".models";
    }
    public static String getModelPackage(ProcessingEnvironment env, Collection<? extends Element> elements){
        return getEndpointPackage(env, new ArrayList<>(elements).get(0)) + ".models";
    }

    public static String getEndpointPackage(ProcessingEnvironment env, Element element){
        return PackageUtils.getPackageName(env.getElementUtils(), element) + ".json";
    }
    public static String getEndpointPackage(ProcessingEnvironment env, Collection<? extends Element> elements){
        return PackageUtils.getPackageName(env.getElementUtils(), new ArrayList<>(elements).get(0)) + ".json";
    }

}

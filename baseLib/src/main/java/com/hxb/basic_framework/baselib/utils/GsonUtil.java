package com.hxb.basic_framework.baselib.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author
 */
public class GsonUtil {

    public static Gson get(){
        return new GsonBuilder().create();
    }
}

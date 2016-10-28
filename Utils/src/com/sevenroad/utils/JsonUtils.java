package com.sevenroad.utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2016/10/22.
 */
public class JsonUtils {
    public static Gson gjson= new Gson();
    public static String toJson(Object obj){
      return  gjson.toJson(obj);
    }
}

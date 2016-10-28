package com.sevenroad.model;

/**
 * Created by Administrator on 2016/10/22.
 */
public class httpResultFactory{
    //未授权
    protected static int Unauthorized = 401;
    public static httpResult createUnauthorizedresult(String msg){
        return new httpResult(httpResultFactory.Unauthorized,msg);
    }
}

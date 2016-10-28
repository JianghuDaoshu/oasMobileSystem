package com.sevenroad.utils.data;

/**
 * Created by linlin.zhang on 2016/10/28.
 */
public class CustomeParam {
    private String paramName;
    private int paramType;
    private Object paramValue;
    public String getParamName(){
        return paramName;
    }
    public int getParamType(){
        return paramType;
    }
    public String getStringValue(){
        return (String)paramValue;
    }
    public int getIntValue(){
        return (int)paramValue;
    }
    public boolean getBoolValue(){
        return (boolean)paramValue;
    }
    public double getDoubleValue(){
        return (double)paramValue;
    }
}

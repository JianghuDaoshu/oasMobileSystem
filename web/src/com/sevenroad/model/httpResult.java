package com.sevenroad.model;

/**
 * Created by Administrator on 2016/10/22.
 */
public class httpResult {
    private int stateCode;
    private String msg;
    public int getStateCode(){
        return stateCode;
    }
    public String getMsg(){
        return msg;
    }
    public httpResult(int stateCode ,String msg){
        this.stateCode = stateCode;
        this.msg = msg;
    }
}

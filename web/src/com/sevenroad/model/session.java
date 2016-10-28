package com.sevenroad.model;

import com.sevenroad.perm.model.*;

import java.util.Calendar;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/22.
 */
public class session {
    private String accessToken;
    private String userName;
    private Calendar createTime;
    private LinkedList<oasGame> perms;

    public session(String accessToken,String userName,LinkedList<oasGame> perms) {
        this.accessToken = accessToken;
        this.userName = userName;
        this.createTime = Calendar.getInstance();
        this.perms = perms;
    }

    public String getAccessToken(){
        return accessToken;
    }
    public String getUserName(){
        return userName;
    }
    public LinkedList<oasGame> getPerms(){
        return perms;
    }

}

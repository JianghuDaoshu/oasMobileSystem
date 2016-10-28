package com.sevenroad.model;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/10/22.
 */
public class SessionManage {
    private static ConcurrentHashMap<String,session> Sessions;
    public static session getSession(String access_token){
        if(Sessions == null) Sessions = new ConcurrentHashMap<String,session>();
        if(Sessions.containsKey(access_token)) return Sessions.get(access_token);
        else return null;
    }
    public static void addUser(String access_token,session session){
        if(!Sessions.containsKey(access_token)) {
            Sessions.put(access_token, session);
        }
        else Sessions.replace(access_token,session);
    }
    public static void removeUser(String access_token){
        Sessions.remove(access_token);
    }
}

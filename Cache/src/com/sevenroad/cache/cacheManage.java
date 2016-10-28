package com.sevenroad.cache;

import com.danga.MemCached.*;
import redis.clients.jedis.Jedis;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
/**
 * Created by Administrator on 2016/10/22.
 */
public abstract class cacheManage {
    protected static String url;
    protected static Hashtable<String, Object> cacheContain = new Hashtable<String, Object>();

    protected Hashtable<String, Object> getInstance() {
        if (cacheContain == null)
            cacheContain = new Hashtable<String, Object>();
        return cacheContain;
    }
}

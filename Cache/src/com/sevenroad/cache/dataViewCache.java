package com.sevenroad.cache;

import com.sevenroad.utils.data.DataView;
import redis.clients.jedis.Jedis;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by linlin.zhang on 2016/10/28.
 */
public class dataViewCache extends cacheManage {
    public DataView getDataView(String dataview){
       Hashtable<String,Object> cache = getInstance();
        if(cache.containsKey(dataview))
            return (DataView)cache.get(dataview);
        else{

            return (DataView)cache.get(dataview);
        }
    }
}

package com.sevenroad.cache;

import com.sevenroad.utils.data.DataTable;
import com.sevenroad.utils.data.CustomeParam;

import java.util.Hashtable;

/**
 * Created by linlin.zhang on 2016/10/28.
 */
public class queryResultCache extends cacheManage {
    public String  createQueryResultKey(String dataview, CustomeParam[] params){
        String paramString = "";
        for(int i = 0;i<params.length;i++){
            paramString+=params[i].getStringValue();
        }
        return dataview+paramString;
    }
    public DataTable getQueryResult(String dataview, CustomeParam[] params){
        Hashtable<String,Object> cache = getInstance();
        String key = createQueryResultKey(dataview,params);
        if(cache.containsKey(key))
            return (DataTable) cache.get(key);
        else {

            return
        }
    }
}

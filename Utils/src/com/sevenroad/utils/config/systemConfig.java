package com.sevenroad.utils.config;

/**
 * Created by linlin.zhang on 2016/10/18.
 */
public class systemConfig {
    private dataBaseConfig dbConfig;
    public dataBaseConfig getDBConfig(String filePath) {
        if(dbConfig == null) dbConfig = new dataBaseConfig();
        if (dbConfig.isloaded()) {
            return dbConfig;
        } else{
            dbConfig.load(filePath);
        }
        return dbConfig;
    }
}

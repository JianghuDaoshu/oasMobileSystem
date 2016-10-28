package com.sevenroad.singleton;
import com.sevenroad.utils.config.*;
/**
 * Created by linlin.zhang on 2016/10/27.
 */
public class systemConfigSingleton {
    private static systemConfig config = new systemConfig();
    public static systemConfig getInstance() {
        String config_path = systemConfigSingleton.class.getClassLoader().getResource("").getPath()+"resources/config.properties";
        config.getDBConfig(config_path);
        return config;
    }
}

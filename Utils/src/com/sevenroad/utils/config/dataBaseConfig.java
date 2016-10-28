package com.sevenroad.utils.config;

import sun.plugin2.message.helper.URLHelper;
import sun.plugin2.util.SystemUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by linlin.zhang on 2016/10/18.
 */
public class dataBaseConfig  implements  configHandle {
    private boolean isloaded = false;
    private String url;
    private String username;
    private String password;
    public boolean isloaded(){
        return isloaded;
    }

    public String getUrl(){
        return url;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public void load(String filePath) {

        Properties pros = new Properties();
        try {
            InputStream is = new FileInputStream(filePath);
            pros.load(is);
            this.url = pros.getProperty("DBServer");
            this.username = pros.getProperty("DBUser");
            this.password = pros.getProperty("DBPassword");
            isloaded = true;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

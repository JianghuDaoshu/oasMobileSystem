package com.sevenroad.utils.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2016/10/22.
 */
public class memcachedConfig implements configHandle {
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
            this.url = pros.getProperty("");
            isloaded = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

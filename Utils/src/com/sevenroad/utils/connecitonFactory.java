package com.sevenroad.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * Created by linlin.zhang on 2016/10/25.
 */
public class connecitonFactory {
    private static ComboPooledDataSource systemDB = new ComboPooledDataSource();
    private static HashMap<String,ComboPooledDataSource> PGDS = new HashMap<String,ComboPooledDataSource>();
    private static HashMap<String,ComboPooledDataSource> MSSQLDS = new HashMap<String,ComboPooledDataSource>();
    private static HashMap<String,ComboPooledDataSource> MySQLDS = new HashMap<String,ComboPooledDataSource>();
    public static void initail(String url,String userName,String password){
        try {
            systemDB.setDriverClass("org.postgresql.Driver");
            systemDB.setJdbcUrl(url);
            systemDB.setUser(userName);
            systemDB.setPassword(password);
        }
        catch (Exception ex){
            System.out.println("初始化系统库失败："+ex.getMessage());
        }
    }
    public static void initailGameDS(String getsql){
        try {
            Connection conn = systemDB.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(getsql);
            while (rs.next()) {
                ComboPooledDataSource ds = new ComboPooledDataSource();
                ds.setJdbcUrl(rs.getString("server_name"));
                ds.setUser(rs.getString("user_name"));
                ds.setUser(rs.getString("password"));
                String connctionId = String.valueOf(rs.getInt("id"));
                switch (rs.getInt("type")) {
                    case 1:
                        ds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        MSSQLDS.put(connctionId,ds);
                        break;
                    case 2:
                        ds.setDriverClass("org.postgresql.Driver");
                        PGDS.put(connctionId,ds);
                        break;
                    case 3:
                        ds.setDriverClass("com.mysql.jdbc.Driver");
                        MySQLDS.put(connctionId,ds);
                        break;
                }

            }
            rs.close();
            st.close();
        }
        catch (Exception ex){
            System.out.println("初始化游戏失败："+ex.getMessage());
        }
    }
    public static Connection getMySQLConnection(int connectionId){
        try {
            String strConnection = String.valueOf(connectionId);
            if (MySQLDS.containsKey(strConnection))
                return MySQLDS.get(strConnection).getConnection();
            return null;
        }
        catch (SQLException ex){
            System.out.println("获取连接"+connectionId+"失败");
            return null;
        }
    }
    public static Connection getPgConnection(int connectionId){
        try {
            String strConnection = String.valueOf(connectionId);
            if (PGDS.containsKey(strConnection))
                return MSSQLDS.get(strConnection).getConnection();
            return null;
        }
        catch (SQLException ex){
            System.out.println("获取连接"+connectionId+"失败");
            return null;
        }
    }
    public static Connection getMSSQLConnection(int connectionId){
        try {
            String strConnection = String.valueOf(connectionId);
            if (MSSQLDS.containsKey(strConnection))
                return MSSQLDS.get(strConnection).getConnection();
            return null;
        }
        catch (SQLException ex){
            System.out.println("获取连接"+connectionId+"失败");
            return null;
        }
    }
}

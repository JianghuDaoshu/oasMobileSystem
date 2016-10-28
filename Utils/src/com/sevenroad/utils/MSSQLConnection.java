package com.sevenroad.utils;

import com.sevenroad.utils.data.DataTable;

import java.sql.*;
import java.util.LinkedList;

/**
 * Created by linlin.zhang on 2016/10/25.
 */
public class MSSQLConnection implements DBInterface {

    @Override
    public DataTable getQueryResult(String sql,int connctionId) {
        DataTable dt = new DataTable();
        try {
            Connection conn = connecitonFactory.getPgConnection(connctionId);
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            //获取列名
            String[] columnName = new String[columnCount];
            int[] columnType = new int[columnCount];
            LinkedList<String[]> rows = new LinkedList<String[]>();
            for(int i = 0;i<columnCount;i++){
                columnName[i] = rsmd.getColumnName(i);
                columnType[i] = rsmd.getColumnType(i);
            }
            while(rs.next()){
                String[] row = new String[columnCount];
                for(int i = 0;i<columnName.length;i++){
                   row[i] = rs.getString(i);
                }
                rows.add(row);
            }
            dt.setColumNames(columnName);
            dt.setColumnTypes(columnType);
            dt.setRows(rows);
            rs.close();
            state.close();
            conn.close();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return dt;
    }
}

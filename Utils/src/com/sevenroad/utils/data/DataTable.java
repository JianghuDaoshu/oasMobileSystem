package com.sevenroad.utils.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by linlin.zhang on 2016/10/25.
 */
public class DataTable {
    String[] columnNames;
    int[] columnTypes;
    LinkedList<String[]> rows;
    public String[] getColumnNames(){
        return columnNames;
    }
    public void setColumNames(String[] columNames){
      this.columnNames = columNames;
    }
    public int[] getColumnTypes(){
        return columnTypes;
    }
    public void setColumnTypes(int[] columnTypes){
        this.columnTypes = columnTypes;
    }
    public LinkedList<String[]> getRows(){
        return rows;
    }
    public void setRows(LinkedList<String[]> rows){
        this.rows = rows;
    }
}

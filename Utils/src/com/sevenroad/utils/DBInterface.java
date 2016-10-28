package com.sevenroad.utils;

import com.sevenroad.utils.data.DataTable;

import java.sql.Connection;

/**
 * Created by linlin.zhang on 2016/10/18.
 */
public interface DBInterface {
    DataTable getQueryResult(String sql,int connctionId);
}

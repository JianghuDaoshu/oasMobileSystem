package com.sevenroad.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/10/22.
 */
public interface httpFilter {
    void handle(HttpServletRequest request);
    String getMessage();
    boolean getResult();
}

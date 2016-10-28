package com.sevenroad.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sevenroad.model.*;

/**
 * Created by Administrator on 2016/10/22.
 */
public class userPermFilter implements httpFilter {

    private boolean result;
    private String message;
    @Override
    public void handle(HttpServletRequest request) {
        request.getParameter("access_token");
    }
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean getResult() {
        return result;
    }
}

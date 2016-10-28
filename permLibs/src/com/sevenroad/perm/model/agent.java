package com.sevenroad.perm.model;

import com.sevenroad.*;
/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class agent extends com.sevenroad.perm.permNode implements getNodeInfo {
    private int agent_id;
    private String agent_name;
    private int level;
    public agent(int agent_id,String agent_name){
        this.agent_id = agent_id;
        this.agent_name = agent_name;
        this.level = level;
    }
    @Override
    public int getId() {
        return agent_id;
    }

    @Override
    public String getName() {
        return agent_name;
    }

    @Override
    public int getLevel() {
        return level;
    }
}

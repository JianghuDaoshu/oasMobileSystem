package com.sevenroad.perm.model;

/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class channel extends com.sevenroad.perm.permNode implements getNodeInfo {
    private int channel_id;
    private String channel_name;
    private int level;
    public channel(int agent_id,String agent_name){
        this.channel_id = channel_id;
        this.channel_name = channel_name;
        this.level = level;
    }
    @Override
    public int getId() {
        return channel_id;
    }

    @Override
    public String getName() {
        return channel_name;
    }

    @Override
    public int getLevel() {
        return level;
    }
}

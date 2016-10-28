package com.sevenroad.perm.model;

/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class menu extends com.sevenroad.perm.permNode implements getNodeInfo{
    private int menu_id;
    private String menu_name;
    private int level;
    public menu(int agent_id,String agent_name){
        this.menu_id = menu_id;
        this.menu_name = menu_name;
        this.level = level;
    }
    @Override
    public int getId() {
        return menu_id;
    }

    @Override
    public String getName() {
        return menu_name;
    }

    @Override
    public int getLevel() {
        return level;
    }
}

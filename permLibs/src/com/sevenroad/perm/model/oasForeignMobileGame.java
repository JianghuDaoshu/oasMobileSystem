package com.sevenroad.perm.model;

import java.util.LinkedList;

/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class oasForeignMobileGame extends game {
    private LinkedList<agent> agents;
    private LinkedList<menu> menus;
    private LinkedList<channel> reg_channels;
    private LinkedList<channel> pay_channels;
    public oasForeignMobileGame(int game_id,String game_name){
        super(game_id,game_name);
    }
}

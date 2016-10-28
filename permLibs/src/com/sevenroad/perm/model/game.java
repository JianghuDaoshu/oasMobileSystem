package com.sevenroad.perm.model;

/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class game implements getNodeInfo{
    private int game_id;
    private String game_name;
    private int level;
    public int getId() {
        return game_id;
    }
    public game(int game_id,String game_name){
        this.game_id = game_id;
        this.game_name = game_name;
        this.level = 0;
    }
    @Override
    public String getName() {
        return game_name;
    }
    @Override
    public int getLevel() {
        return level;
    }
}

package com.sevenroad.perm;

import java.util.LinkedList;

/**
 * Created by linlin.zhang on 2016/10/17.
 */
public class permNode{
    private permNode parent;
    private LinkedList<permNode> children;
    public permNode getParent(){
        return this.parent;
    }
    public void setParent(permNode node){
        parent = node;
    }
    public LinkedList<permNode> getChildren(){
        return children;
    }
    public void addChildren(permNode node){
        if(children != null) {
            node.parent = this;
            children.add(node);
        }
    }
}

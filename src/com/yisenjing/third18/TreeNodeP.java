package com.yisenjing.third18;

/**
 * Created by Yisen on 4/13/16.
 */
public class TreeNodeP {

    public int key;
    public TreeNodeP left;
    public TreeNodeP right;
    public TreeNodeP parent;

    public TreeNodeP(int key, TreeNodeP parent) {
        this.key = key;
        this.parent = parent;
    }


}

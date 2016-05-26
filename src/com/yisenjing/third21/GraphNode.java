package com.yisenjing.third21;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/14/16.
 */
public class GraphNode {

    public int key;
    public List<GraphNode> neighbors;
    public GraphNode(int key) {
        this.key = key;
        this.neighbors = new ArrayList<GraphNode>();
    }
}

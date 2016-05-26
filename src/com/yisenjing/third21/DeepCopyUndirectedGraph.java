package com.yisenjing.third21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Yisen on 4/14/16.
 */
public class DeepCopyUndirectedGraph {


    public List<GraphNode> copy(List<GraphNode> graph) {

        HashMap<GraphNode, GraphNode> visited = new HashMap<GraphNode, GraphNode>();
        for (GraphNode node : graph) {
            if (!visited.containsKey(node)) {
                visited.put(node, new GraphNode(node.key));
                DFS(visited, node);
            }
        }
        return new ArrayList<>(visited.values());
    }

    private void DFS(HashMap<GraphNode, GraphNode> visited, GraphNode theNode) {
        GraphNode copied = visited.get(theNode);
        for (GraphNode node : theNode.neighbors) {
            if (!visited.containsKey(node)) {
                visited.put(node, new GraphNode(node.key));
                DFS(visited, node);
            }
            copied.neighbors.add(new GraphNode(node.key));
        }
    }


}

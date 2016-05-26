package com.yisenjing.third5;

import java.util.*;

/**
 * Created by Yisen on 4/8/16.
 */
public class Bipartite {

    public boolean isBipartite(List<GraphNode> graph) {

        Map<GraphNode, Integer> map = new HashMap<GraphNode, Integer>();

        for (GraphNode node : graph) {
            if (!BFS(map, node)) {
                return false;
            }
        }
        return true;
    }


    private boolean BFS(Map<GraphNode, Integer> map, GraphNode node) {

        if (map.containsKey(node)) {
            return true;
        }
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.offer(node);
        map.put(node, 0);
        while (!queue.isEmpty()) {

            GraphNode cur = queue.poll();
            int curGroup = map.get(cur);
            int neiGroup = curGroup == 1 ? 0 : 1;

            for (GraphNode nei : cur.neighbors) {
                if (map.containsKey(nei)) {
                    if (map.get(nei) != neiGroup) {
                        return false;
                    }
                } else {
                    map.put(nei, neiGroup);
                    queue.offer(nei);
                }
            }
        }
        return true;
    }

    class GraphNode {
        public int key;
        public List<GraphNode> neighbors;
        public GraphNode(int key) {
            this.key = key;
            this.neighbors = new ArrayList<GraphNode>();
        }
    }


}

package com.yisenjing.third22;

import com.yisenjing.third4.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yisen on 4/15/16.
 */
public class ReconstructBinaryTreeWithLevelorderAndInorder {

    public TreeNode reconstruct(int[] in, int[] level) {

        if (in.length == 0 || level.length == 0) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
        List<Integer> levelList = new ArrayList<>();
        for (int i : level) {
            levelList.add(i);
        }
        return DFS(map, levelList);
    }

    private TreeNode DFS(Map<Integer, Integer> map, List<Integer> levelList) {

        if (levelList.isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(levelList.remove(0));
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (Integer i : levelList) {
            if (map.get(i) < map.get(root.key)) {
                left.add(i);
            } else {
                right.add(i);
            }
        }

        root.left = DFS(map, left);
        root.right = DFS(map, right);
        return root;
    }


}

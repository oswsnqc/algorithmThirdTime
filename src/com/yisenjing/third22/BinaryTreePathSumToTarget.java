package com.yisenjing.third22;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class BinaryTreePathSumToTarget {

    public boolean exist(TreeNode root, int target) {

        if (root == null) {
            return false;
        }
        return DFS(root, target, 0);
    }


    private boolean DFS(TreeNode root, int target, int sum) {
        if (root == null) {
            return false;
        }

        sum += root.key;

        if (sum == target) {
            return true;
        }

        boolean ll = DFS(root.left, target, sum);
        boolean lr = DFS(root.right, target, sum);
        return ll || lr || DFS(root.left, target, 0) || DFS(root.right, target, 0);
    }


}

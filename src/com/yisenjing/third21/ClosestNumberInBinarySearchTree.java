package com.yisenjing.third21;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class ClosestNumberInBinarySearchTree {

    public int closest(TreeNode root, int target) {
        int min = Integer.MAX_VALUE;

        while (root != null && min != target) {
            min = Math.abs(root.key - target) < Math.abs(min - target) ? root.key : min;

            if (root.key == target) {
                min = target;
            } else if (root.key < target) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return min;
    }

}

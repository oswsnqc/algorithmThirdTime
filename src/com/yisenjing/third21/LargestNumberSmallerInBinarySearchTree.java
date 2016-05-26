package com.yisenjing.third21;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class LargestNumberSmallerInBinarySearchTree {


    public int largestSmaller(TreeNode root, int target) {
        int min = Integer.MIN_VALUE;

        while (root != null && min != target) {
            if (root.key < target) {
                min = Math.abs(root.key - target) < Math.abs(min - target) ? root.key : min;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return min;
    }

}

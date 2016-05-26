package com.yisenjing.third24;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/16/16.
 */
public class ReverseBinaryTreeUpsideDown {

    public TreeNode reverse(TreeNode root) {


        if (root == null) {
            return root;
        }


        TreeNode prev = null;
        TreeNode prevRight = null;

        while (root != null) {
            TreeNode next = root.left;
            TreeNode right = root.right;
            root.left = prev;
            root.right = prevRight;
            prev = root;
            prevRight = right;
            root = next;
        }
        return prev;
    }


}

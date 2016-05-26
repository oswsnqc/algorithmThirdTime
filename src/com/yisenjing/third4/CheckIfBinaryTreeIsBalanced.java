package com.yisenjing.third4;

/**
 * Created by Yisen on 4/7/16.
 */
public class CheckIfBinaryTreeIsBalanced {

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        return height(root) != -1;

    }

    private int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }


}

package com.yisenjing.third4;

/**
 * Created by Yisen on 4/7/16.
 */
public class SymmetricBinaryTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode one, TreeNode two) {

        if (one == null && two == null) {
            return true;
        } else if (one == null || two == null) {
            return false;
        } else if (one.key != two.key) {
            return false;
        }
        return isSymmetric(one.left, two.right) && isSymmetric(one.right, two.left);
    }

}

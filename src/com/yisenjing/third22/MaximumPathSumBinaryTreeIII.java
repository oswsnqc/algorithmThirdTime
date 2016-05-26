package com.yisenjing.third22;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class MaximumPathSumBinaryTreeIII {

    public int maxPathSum(TreeNode root) {

        int[] sum = new int[]{Integer.MIN_VALUE};
        DFS(root, sum);
        return sum[0];
    }


    private int DFS(TreeNode root, int[] sum) {
        if (root == null) {
            return 0;
        }
        int left = DFS(root.left, sum);
        int right = DFS(root.right, sum);
        sum[0] = Math.max(sum[0], Math.max(root.key, root.key + Math.max(left, right)));
        return Math.max(root.key, root.key + Math.max(left, right));
    }



}

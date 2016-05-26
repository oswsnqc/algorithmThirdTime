package com.yisenjing.third22;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class ReconstructBinaryTreeWithPreorderAndInorder {


    public TreeNode reconstruct(int[] in, int[] pre) {
        if (in.length == 0 || pre.length == 0) {
            return null;
        }

        int[] preIndex = new int[]{0};
        int[] inIndex = new int[]{0};
        return helper(in, pre, inIndex, preIndex, Integer.MIN_VALUE);
    }


    private TreeNode helper(int[] in, int[] pre, int[] inIndex, int[] preIndex, int target) {
        if (inIndex[0] >= in.length || in[inIndex[0]] == target) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preIndex[0]]);
        preIndex[0]++;
        root.left = helper(in, pre, inIndex, preIndex, root.key);
        inIndex[0]++;
        root.right = helper(in, pre, inIndex, preIndex, target);
        return root;
    }

}

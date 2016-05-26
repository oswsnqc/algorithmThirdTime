package com.yisenjing.third22;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/15/16.
 */
public class ReconstructBinarySearchTreeWithPostorderTraversal {

    public TreeNode reconstruct(int[] post) {

        int[] index = new int[]{post.length - 1};
        int min = Integer.MIN_VALUE;
        return construct(index, post, min);
    }


    private TreeNode construct(int[] index, int[] post, int min) {

        if (index[0] < 0 || post[index[0]] < min) {
            return null;
        }

        TreeNode root = new TreeNode(post[index[0]--]);

        root.right = construct(index, post, root.key);
        root.left = construct(index, post, min);
        return root;
    }



}

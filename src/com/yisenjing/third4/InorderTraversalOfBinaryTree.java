package com.yisenjing.third4;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yisen on 4/7/16.
 */
public class InorderTraversalOfBinaryTree {
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }


        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.offerFirst(cur);
                cur = cur.left;
            } else {
                cur = stack.pollFirst();
                result.add(cur.key);
                cur = cur.right;
            }
        }
        return result;
    }
}

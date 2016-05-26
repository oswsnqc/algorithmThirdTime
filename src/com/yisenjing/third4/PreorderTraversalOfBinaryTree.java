package com.yisenjing.third4;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yisen on 4/7/16.
 */
public class PreorderTraversalOfBinaryTree {

    public List<Integer> preOrder(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pollFirst();

            if (cur.right != null) {
                stack.offerFirst(cur.right);
            }

            if (cur.left != null) {
                stack.offerFirst(cur.left);
            }
            result.add(cur.key);
        }
        return result;
    }

}

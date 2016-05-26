package com.yisenjing.third4;

import java.util.*;

/**
 * Created by Yisen on 4/7/16.
 */
public class PostorderTraversalOfBinaryTree {

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        stack.offerFirst(root);

        while (!stack.isEmpty()) {
            TreeNode cur = stack.pollFirst();

            if (cur.left != null) {
                stack.offerFirst(cur.left);
            }

            if (cur.right != null) {
                stack.offerFirst(cur.right);
            }

            result.add(cur.key);
        }

        Collections.reverse(result);
        return result;
    }


}

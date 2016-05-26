package com.yisenjing.third18;

import com.yisenjing.third4.TreeNode;

import java.util.*;

/**
 * Created by Yisen on 4/13/16.
 */
public class GetKeysInBinaryTreeLayerByLayerZigZagOrder {


    public List<Integer> zigZag(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        int flag = 1;
        while (!stack.isEmpty()) {
            int size = stack.size();
            if (flag % 2 == 1) {
                for (int i = 0; i < size; i++) {
                    TreeNode cur = stack.pollFirst();
                    if (cur.right != null) {
                        stack.offerLast(cur.right);
                    }

                    if (cur.left != null) {
                        stack.offerLast(cur.left);
                    }
                    result.add(cur.key);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode cur = stack.pollLast();
                    if (cur.left != null) {
                        stack.offerFirst(cur.left);
                    }

                    if (cur.right != null) {
                        stack.offerFirst(cur.right);
                    }
                    result.add(cur.key);
                }
            }
            flag++;
        }
        return result;
    }


}

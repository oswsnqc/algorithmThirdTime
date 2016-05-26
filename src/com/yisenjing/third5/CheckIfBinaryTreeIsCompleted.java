package com.yisenjing.third5;

import com.yisenjing.third4.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yisen on 4/8/16.
 */
public class CheckIfBinaryTreeIsCompleted {

    public boolean isCompleted(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        boolean flag = false;
        queue.offer(root);


        while (!queue.isEmpty()) {

            TreeNode cur = queue.poll();

            if (cur.left == null) {
                flag = true;
            } else if (flag) {
                return false;
            } else {
                queue.offer(cur.left);
            }

            if (cur.right == null) {
                flag = true;
            } else if (flag) {
                return false;
            } else {
                queue.offer(cur.right);
            }
        }
        return true;
    }
}

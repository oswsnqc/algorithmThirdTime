package com.yisenjing.third21;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/14/16.
 */
public class InsertInBinarySearchTree {

    public TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (root.key > key) {
            if (root.left == null) {
                root.left = new TreeNode(key);
            } else {
                insert(root.left, key);
            }
        }

        if (root.key < key) {
            if (root.right == null) {
                root.right = new TreeNode(key);
            } else {
                insert(root.right, key);
            }
        }
        return root;
    }


}

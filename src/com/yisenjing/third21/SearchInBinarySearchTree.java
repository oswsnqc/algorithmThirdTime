package com.yisenjing.third21;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/14/16.
 */
public class SearchInBinarySearchTree {

    public TreeNode search(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.key == key) {
            return root;
        }

        if (root.key < key) {
            return search(root.right, key);
        }

        if (root.key > key) {
            return search(root.left, key);
        }
        return root; //看看能不能取消这个
    }


}

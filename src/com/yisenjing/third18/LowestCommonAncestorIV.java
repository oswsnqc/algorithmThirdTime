package com.yisenjing.third18;

import com.yisenjing.third4.TreeNode;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Yisen on 4/13/16.
 */
public class LowestCommonAncestorIV {

    public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
        HashSet<TreeNode> sets = new HashSet<>(nodes);
        return helper(root, sets);
    }

    private TreeNode helper(TreeNode root, HashSet<TreeNode> sets) {
        if (root == null) {
            return null;
        }
        if (sets.contains(root)) {
            return root;
        }
        TreeNode ll = helper(root.left, sets);
        TreeNode lr = helper(root.right, sets);

        if (ll != null && lr != null) {
            return root;
        }
        return ll == null ? lr : ll;
    }


}

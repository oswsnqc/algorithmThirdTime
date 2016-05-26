package com.yisenjing.third10;

import com.yisenjing.third4.TreeNode;

/**
 * Created by Yisen on 4/11/16.
 */
public class LowestCommonAncestorI {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {

        if (root == null) {
            return root;
        }

        if (root == one || root == two) {
            return root;
        }

        //上面两层就把ll和lr的赋值全部截获了,

        //当分析的时候,要利用stack frame的思路来理解

        TreeNode ll = lowestCommonAncestor(root.left, one, two);
        TreeNode lr = lowestCommonAncestor(root.right, one, two);

        //两个递归函数下面没有任何与ll以及lr赋值有关的东西,
        //此时return的数值并不是return到ll和lr上,而是return给了最终整个函数返回的结果.

        if (ll != null && lr != null) {
            return root;
        }
        return ll == null ? lr : ll;
    }


}

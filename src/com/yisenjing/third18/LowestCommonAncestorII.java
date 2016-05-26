package com.yisenjing.third18;

/**
 * Created by Yisen on 4/13/16.
 */
public class LowestCommonAncestorII {

    public TreeNodeP lowestCommonAncestor(TreeNodeP one, TreeNodeP two) {
        int ll = getHeight(one);
        int lr = getHeight(two);
        if (ll > lr) {
            return merge(two, one, ll - lr);
        } else {
            return merge(one, two, lr - ll);
        }
    }
    private int getHeight(TreeNodeP node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.parent;
        }
        return height;
    }
    private TreeNodeP merge(TreeNodeP shorter, TreeNodeP longer, int diff) {
        while (diff > 0) {
            longer = longer.parent;
            diff--;
        }
        while (longer != shorter) {
            longer = longer.parent;
            shorter = shorter.parent;
        }
        return longer;
    }
}

package com.yisenjing.third4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/7/16.
 */
public class GetKeysInBinarySearchTreeInGivenRange {

    public List<Integer> getRange(TreeNode root, int min, int max) {
        List<Integer> result = new ArrayList<Integer>();
        getRange(root, min, max, result);
        return result;
    }

    private void getRange(TreeNode root, int min, int max, List<Integer> result) {

        if (root == null) {
            return;
        }

        if (root.key > min) {
            getRange(root.left, min, max, result);
        }

        if (root.key <= max && root.key >= min) {
            result.add(root.key);
        }

        if (root.key < max) {
            getRange(root.right, min, max, result);
        }
    }


}

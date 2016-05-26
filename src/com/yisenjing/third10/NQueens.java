package com.yisenjing.third10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/11/16.
 */
public class NQueens {

    public List<List<Integer>> nqueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> queenBuilder = new ArrayList<>();
        helper(result, queenBuilder, n);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> queenBuilder, int n) {
        if (queenBuilder.size() == n) {
            result.add(new ArrayList<>(queenBuilder));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (validator(queenBuilder, i)) {
                queenBuilder.add(i);
                helper(result, queenBuilder, n);
                queenBuilder.remove(queenBuilder.size() - 1);
            }
        }
    }

    private boolean validator(List<Integer> queenBuilder, int col) {
        int row = queenBuilder.size();
        for (int i = 0; i < row; i++) {
            if (queenBuilder.get(i) == col || Math.abs(col - queenBuilder.get(i)) == row - i) {
                return false;
            }
        }
        return true;
    }


}

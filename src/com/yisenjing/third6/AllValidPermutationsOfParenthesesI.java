package com.yisenjing.third6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/8/16.
 */
public class AllValidPermutationsOfParenthesesI {

    public List<String> validParentheses(int n) {
        List<String> result = new ArrayList<String>();

        char[] array = new char[2 * n];

        DFS(array, n, n, 0, result);
        return result;
    }

    private void DFS(char[] array, int left, int right, int index, List<String> result) {

        if (left == 0 && right == 0) {
            result.add(new String(array));
            return;
        }

        if (left > 0) {
            array[index] = '(';
            DFS(array, left - 1, right, index + 1, result);
        }
        if (right > left) {
            array[index] = ')';
            DFS(array, left, right - 1, index + 1, result);
        }
    }
}

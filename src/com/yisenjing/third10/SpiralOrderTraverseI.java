package com.yisenjing.third10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/10/16.
 */
public class SpiralOrderTraverseI {

    public List<Integer> spiral(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int start = 0;
        int end = matrix.length - 1;

        while (start < end) {
            for (int i = start; i <= end; i++) {
                result.add(matrix[start][i]);
            }
            for (int i = start + 1; i <= end - 1; i++) {
                result.add(matrix[i][end]);
            }
            for (int i = end; i >= start; i--) {
                result.add(matrix[end][i]);
            }
            for (int i = end - 1; i >= start + 1; i--) {
                result.add(matrix[i][start]);
            }
            start++;
            end--;
        }

        if (start == end) {
            result.add(matrix[start][end]);
        }
        return result;
    }



}

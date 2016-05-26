package com.yisenjing.third10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yisen on 4/11/16.
 */
public class SpiralOrderTraverseII {

    public List<Integer> spiral(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) {
            return result;
        }

        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;

        while (left < right && up < down) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            for (int i = up + 1; i <= down - 1; i++) {
                result.add(matrix[i][right]);
            }

            for (int i = right; i >= left; i--) {
                result.add(matrix[down][i]);
            }

            for (int i = down - 1; i >= up + 1; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            right--;
            up++;
            down--;
        }

        if (left > right || up > down) {
            return result;
        }

        if (left == right) {
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][left]);
            }
        } else {
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
        }

        return result;
    }


}

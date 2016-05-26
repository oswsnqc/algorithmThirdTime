package com.yisenjing.third10;

/**
 * Created by Yisen on 4/11/16.
 */
public class SpiralOrderGenerateII {

    public int[][] spiralGenerate(int m, int n) {

        int[][] matrix = new int[m][n];

        if (m == 0 || n == 0) {
            return matrix;
        }


        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;

        int num = 1;

        while (left < right && up < down) {
            for (int i = left; i <= right; i++) {
                matrix[up][i] = num++;
            }
            for (int i = up + 1; i <= down - 1; i++) {
                matrix[i][right] = num++;
            }
            for (int i = right; i >= left; i--) {
                matrix[down][i] = num++;
            }
            for (int i = down - 1; i >= up + 1; i--) {
                matrix[i][left] = num++;
            }
            left++;
            right--;
            up++;
            down--;
        }

        if (left > right || up > down) {
            return matrix;
        }

        if (left == right) {
            for (int i = up; i <= down; i++) {
                matrix[i][left] = num++;
            }
        } else {
            for (int i = left; i <= right; i++) {
                matrix[up][i] = num++;
            }

        }
        return matrix;
    }


}

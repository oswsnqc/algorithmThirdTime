package com.yisenjing.third15;

/**
 * Created by Yisen on 4/12/16.
 */
public class LongestCrossOf1s {

    public int largest(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;


        int[][] left = new int[m][n];
        int[][] up = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        left[i][j] = 1;
                        up[i][j] = 1;
                    } else {
                        left[i][j] = left[i][j - 1] + 1;
                        up[i][j] = up[i - 1][j] + 1;
                    }
                }
            }
        }


        int[][] right = new int[m][n];
        int[][] down = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    if (i == m - 1 || j == n - 1) {
                        right[i][j] = 1;
                        down[i][j] = 1;
                    } else {
                        right[i][j] = right[i][j + 1] + 1;
                        down[i][j] = down[i + 1][j] + 1;
                    }
                }
            }
        }
        int min = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = Math.min(Math.min(left[i][j], right[i][j]), Math.min(up[i][j], down[i][j]));
                min = Math.max(temp, min);
            }
        }
        return min;
    }


}

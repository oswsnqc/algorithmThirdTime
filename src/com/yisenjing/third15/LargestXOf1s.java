package com.yisenjing.third15;

/**
 * Created by Yisen on 4/12/16.
 */
public class LargestXOf1s {


    public int largest(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }


        int m = matrix.length;
        int n = matrix[0].length;


        int[][] leftup = new int[m][n];
        int[][] leftdown = new int[m][n];

        int[][] rightup = new int[m][n];
        int[][] rightdown = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        leftup[i][j] = 1;
                    } else {
                        leftup[i][j] = leftup[i - 1][j - 1] + 1;
                    }
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == n - 1) {
                        rightup[i][j] = 1;
                    } else {
                        rightup[i][j] = rightup[i - 1][j + 1] + 1;
                    }
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    if (i == m - 1 || j == n - 1) {
                        rightdown[i][j] = 1;
                    } else {
                        rightdown[i][j] = rightdown[i + 1][j + 1] + 1;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == m - 1 || j == 0) {
                        leftdown[i][j] = 1;
                    } else {
                        leftdown[i][j] = leftdown[i + 1][j - 1] + 1;
                    }
                }
            }
        }

        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = Math.min(Math.min(leftup[i][j], leftdown[i][j]), Math.min(rightup[i][j], rightdown[i][j]));
                max = Math.max(temp, max);
            }
        }
        return max;
    }


}

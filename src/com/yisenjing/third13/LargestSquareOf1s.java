package com.yisenjing.third13;

/**
 * Created by Yisen on 4/12/16.
 */
public class LargestSquareOf1s {

    public int largest(int[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        int n = matrix.length;


        int[][] storage = new int[n][n];

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    if (i == 0 || j == 0) {
                        storage[i][j] = 1;
                    } else {
                        storage[i][j] = Math.min(Math.min(storage[i - 1][j], storage[i][j - 1]), storage[i - 1][j - 1]) + 1;
                    }
                }
                max = Math.max(max, storage[i][j]);
            }
        }
        return max;
    }


}

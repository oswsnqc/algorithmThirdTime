package com.yisenjing.third15;

/**
 * Created by Yisen on 4/12/16.
 */
public class LargestSubMatrixSum {

    public int largest(int[][] matrix) {


        int result = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int[] sumArea = new int[matrix.length];
            for (int j = i; j < matrix[0].length; j++) {

                for (int s = 0; s < sumArea.length; s++) {
                    sumArea[s] += matrix[s][j];
                }

                int temp = sumArea[0];
                int sum = sumArea[0];
                for (int s = 1; s < sumArea.length; s++) {
                    temp = Math.max(temp + sumArea[s], sumArea[s]);
                    sum = Math.max(temp, sum);
                }

                result = Math.max(result, sum);
            }
        }
        return result;
    }


}

package com.yisenjing.third27;

/**
 * Created by Yisen on 4/25/16.
 */
public class LongestAscendingSubsequence {

    public int longest(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int[][] sum = new int[array.length][array.length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j + i < sum[0].length; j++) {

                if (i == 0) {
                    sum[j][j + i] = 1;
                } else {
                    if (sum[j][j + i - 1] == sum[j + 1][j + i]) {
                        if (array[j + i] > array[j + i - 1]) {
                            sum[j][j + i] = sum[j][j + i - 1] + 1;
                        } else {
                            sum[j][j + i] = Math.max(sum[j][j + i - 1], sum[j + 1][j + i]);
                        }
                    } else {
                        sum[j][j + i] = Math.max(sum[j][j + i - 1], sum[j + 1][j + i]);
                    }
                }

            }
        }
        return sum[0][array.length - 1];
    }


}

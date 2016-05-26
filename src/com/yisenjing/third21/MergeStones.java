package com.yisenjing.third21;

/**
 * Created by Yisen on 4/14/16.
 */
public class MergeStones {


    public int minCost(int[] stones) {

        if (stones.length == 0) {
            return 0;
        }

        int n = stones.length;

        int[][] storage = new int[n][n];
        int[][] sum = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; i + j < n; j++) {
                if (i == 0) {
                    sum[j][j + i] = stones[j];
                    storage[j][j + i] = 0;
                } else {
                    sum[j][j + i] = sum[j][j + i - 1] + stones[j + i];
                    storage[j][j + i] = Integer.MAX_VALUE;
                    for (int k = 0; k < i; k++) {
                        storage[j][j + i] = Math.min(storage[j][j + i], storage[j][j + k] + storage[j + 1 + k][j + i] + sum[j][j + i]);
                    }
                }
            }
        }
        return storage[0][n - 1];
    }


}

package com.yisenjing.third21;

import java.util.Arrays;

/**
 * Created by Yisen on 4/15/16.
 */
public class CuttingWoodI {

    public int minCost(int[] cuts, int length) {

        int n = cuts.length;
        int[] len = new int[cuts.length + 2];


        int[][] storage = new int[n + 1][n + 1];

        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j + i < storage.length; j++) {

                if (i == 0) {
                    storage[j][j + i] = 0;
                } else {
                    storage[j][j + i] = Integer.MAX_VALUE;
                    int cut = length;
                    if (j + i < cuts.length) {
                        cut = cuts[j + i];
                    }
                    int becut = 0;

                    if (j - 1 >= 0) {
                        becut = cuts[j - 1];
                    }
                    for (int k = 0; k < i; k++) {
                        storage[j][j + i] = Math.min(storage[j][j + i], storage[j][j + k] + storage[j + k + 1][j + i] + cut - becut);
                    }
                }


            }
        }

        return storage[0][n];
    }


}

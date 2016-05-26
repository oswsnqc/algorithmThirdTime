package com.yisenjing.third20;

/**
 * Created by Yisen on 4/14/16.
 */
public class MinimumCutsForPalindromes {


    public int minCuts(String input) {

        if (input.length() <= 1) {
            return 0;
        }

        int n = input.length();
        int[][] storage = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                int hori = j + i;
                int vertical = j;
                if (i == 0) {
                    storage[vertical][hori] = 0;
                } else if (i == 1) {
                    if (input.charAt(hori) != input.charAt(vertical)) {
                        storage[vertical][hori] = 1;
                    }
                } else {
                    if (input.charAt(hori) == input.charAt(vertical) && storage[vertical + 1][hori - 1] == 0) {
                        storage[vertical][hori] = 0;
                    } else {
                        storage[vertical][hori] = Integer.MAX_VALUE;
                        for (int t = 0; t < i; t++) {
                            storage[vertical][hori] = Math.min(storage[vertical][hori], storage[vertical][j + t] + storage[vertical + t + 1][hori] + 1);
                        }
                    }

                }
            }
        }
        return storage[0][n - 1];
    }


}

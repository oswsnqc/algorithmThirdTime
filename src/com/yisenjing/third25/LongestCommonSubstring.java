package com.yisenjing.third25;

/**
 * Created by Yisen on 4/20/16.
 */
public class LongestCommonSubstring {

    public String longestCommon(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[][] storage = new int[s.length()][t.length()];

        int start = 0;
        int largestLength = 0;

        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[0].length; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (i == 0 || j == 0) {
                        storage[i][j] = 1;
                    } else {
                        storage[i][j] = storage[i - 1][j - 1] + 1;
                    }

                    if (storage[i][j] > largestLength) {
                        largestLength = storage[i][j];
                        start = i - largestLength + 1;
                    }
                }
            }
        }
        return s.substring(start, start + largestLength);
    }


}

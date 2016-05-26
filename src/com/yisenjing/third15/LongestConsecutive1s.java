package com.yisenjing.third15;

/**
 * Created by Yisen on 4/12/16.
 */
public class LongestConsecutive1s {

    public int longest(int[] array) {

        if (array.length == 0) {
            return 0;
        }

        int max = 0;
        int cur = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                cur++;
            } else {
                cur = 0;
            }
            max = Math.max(max, cur);
        }
        return max;
    }


}

package com.yisenjing.third12;

/**
 * Created by Yisen on 4/11/16.
 */
public class LongestAscendingSubArray {

    public int longest(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int result = 1;
        int cur = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                cur++;
            } else {
                cur = 1;
            }
            result = Math.max(result, cur);
        }
        return result;
    }

}

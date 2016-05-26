package com.yisenjing.third15;

/**
 * Created by Yisen on 4/12/16.
 */
public class LargestSubArraySum {

    public int largestSum(int[] array) {

        if (array.length == 1) {
            return array[0];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int buffer = 0;
            for (int j = i; j < array.length; j++) {
                buffer += array[j];
                max = Math.max(buffer, max);
            }
        }
        return max;
    }


}

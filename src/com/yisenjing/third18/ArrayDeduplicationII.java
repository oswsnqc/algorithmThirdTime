package com.yisenjing.third18;

import java.util.Arrays;

/**
 * Created by Yisen on 4/13/16.
 */
public class ArrayDeduplicationII {

    public int[] dedup(int[] array) {

        if (array.length <= 2) {
            return array;
        }

        int end = 1;

        for (int i = 2; i < array.length; i++) {
            if (array[i] != array[end - 1]) {
                array[++end] = array[i];
            }
        }
        return Arrays.copyOf(array, end + 1);
    }



}

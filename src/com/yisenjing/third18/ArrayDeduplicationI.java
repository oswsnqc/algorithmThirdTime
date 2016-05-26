package com.yisenjing.third18;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yisen on 4/13/16.
 */
public class ArrayDeduplicationI {


    public int[] dedup(int[] array) {
        if (array.length == 0) {
            return array;
        }

        int end = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[end] != array[i]) {
                array[++end] = array[i];
            }
        }
        return Arrays.copyOf(array, end + 1);
    }
}

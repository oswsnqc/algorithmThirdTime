package com.yisenjing.third18;

import java.util.Arrays;

/**
 * Created by Yisen on 4/13/16.
 */
public class ArrayDeduplicationIV {

    public int[] dedup(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int end = -1;


        for (int i = 0; i < array.length; i++) {
            if (end == -1 || array[end] != array[i]) {
                array[++end] = array[i];
            } else {
                while (i + 1 < array.length && array[end] == array[i + 1]) {
                    i++;
                }
                end--;
            }
        }
        return Arrays.copyOf(array, end + 1);

    }


}

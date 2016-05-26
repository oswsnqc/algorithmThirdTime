package com.yisenjing.third18;

import java.util.Arrays;

/**
 * Created by Yisen on 4/13/16.
 */
public class ArrayDeduplicationIII {

    public int[] dedup(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int end = 0;

        boolean flag = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[end]) {
                flag = true;
            } else if (flag){
                array[end] = array[i];
                flag = false;
            } else {
                array[++end] = array[i];
            }
        }
        return Arrays.copyOf(array, flag ? end : end + 1);
    }


}

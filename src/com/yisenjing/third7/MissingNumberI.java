package com.yisenjing.third7;

import java.util.HashSet;

/**
 * Created by Yisen on 4/9/16.
 */
public class MissingNumberI {


    public int missing(int[] array) {

        if (array.length == 0) {
            return 1;
        }

        int n = array.length + 1;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        for (int i = 1; i < array.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return n;
    }



}

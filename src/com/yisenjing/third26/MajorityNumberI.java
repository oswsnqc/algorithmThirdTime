package com.yisenjing.third26;

/**
 * Created by Yisen on 4/25/16.
 */
public class MajorityNumberI {

    public int majority(int[] array) {
        int candidate = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                candidate = array[i];
                count = 1;
            } else if (array[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

    }


}

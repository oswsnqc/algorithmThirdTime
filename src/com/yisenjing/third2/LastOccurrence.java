package com.yisenjing.third2;

import java.util.LinkedList;

/**
 * Created by Yisen on 4/6/16.
 */
public class LastOccurrence {

    public int lastOccur(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;




        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }


        if (array[right] == target) {
            return right;
        } else if (array[left] == target) {
            return left;
        }
        return -1;
    }


}

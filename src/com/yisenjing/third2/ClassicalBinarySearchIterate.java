package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class ClassicalBinarySearchIterate {

    public int binarySearch(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] < target) {
                left = middle + 1;
            } else if (array[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

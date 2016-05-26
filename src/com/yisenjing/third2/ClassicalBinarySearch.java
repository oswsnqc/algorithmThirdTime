package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class ClassicalBinarySearch {


    public int binarySearch(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }
        return binarySearch(0, array.length - 1, array, target);
    }

    private int binarySearch(int left, int right, int[] array, int target) {

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] < target) {
                return binarySearch(middle + 1, right, array, target);
            } else if (array[middle] > target) {
                return binarySearch(left, middle - 1, array, target);
            } else {
                return middle;
            }
        }
        return -1;
    }


}

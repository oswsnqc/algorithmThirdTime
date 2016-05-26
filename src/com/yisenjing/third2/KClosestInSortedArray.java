package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class KClosestInSortedArray {

    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }

        if (k == 0) {
            return new int[]{};
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


        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            if (left >= 0 && right < array.length) {
                if (Math.abs(target - array[left]) <= Math.abs(array[right] - target)) {
                    result[i] = array[left--];
                } else {
                    result[i] = array[right++];
                }
            } else if (left >= 0) {
                result[i] = array[left--];
            } else if (right < array.length) {
                result[i] = array[right++];
            }
        }

        return result;
    }


}

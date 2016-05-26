package com.yisenjing.third25;

/**
 * Created by Yisen on 4/23/16.
 */
public class MaxWaterTrappedI {

    public int maxTrapped(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;
        int lmax = array[left];
        int rmax = array[right];

        int result = 0;

        while (left < right) {
            if (array[left] <= array[right]) {
                result += Math.max(0, lmax - array[left]);
                lmax = Math.max(array[left], lmax);
                left++;
            } else {
                result += Math.max(0, rmax - array[right]);
                rmax = Math.max(rmax, rmax - array[right]);
                right--;
            }
        }
        return result;
    }


}

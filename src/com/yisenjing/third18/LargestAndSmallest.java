package com.yisenjing.third18;

/**
 * Created by Yisen on 4/13/16.
 */
public class LargestAndSmallest {

    public int[] largestAndSmallest(int[] array) {
        if (array.length == 1) {
            return new int[]{array[0], array[0]};
        }
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] < array[n - 1 - i]) {
                int temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }
        }
        return new int[]{findLarge(array, 0, (n - 1) / 2), findsmallest(array, n / 2, n - 1)};
    }
    private int findLarge(int[] array, int left, int right) {
        int largest = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            largest = Math.max(largest, array[i]);
        }
        return largest;
    }
    private int findsmallest(int[] array, int left, int right) {
        int small = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            small = Math.min(small, array[i]);
        }
        return small;
    }
}

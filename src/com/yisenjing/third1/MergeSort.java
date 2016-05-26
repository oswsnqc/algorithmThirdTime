package com.yisenjing.third1;

/**
 * Created by Yisen on 3/29/16.
 */
public class MergeSort {

    public int[] mergeSort(int[] array) {

        if (array == null || array.length == 0) {
            return array;
        }

        int[] helper = new int[array.length];

        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }


    private void mergeSort(int[] array, int[] helper, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        sort(array, helper, left, mid, right);
    }

    private void sort(int[] array, int[] helper, int left, int mid, int right) {

        int leftHelperIndex = left;
        int rightHelperIndex = mid + 1;

        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        while (leftHelperIndex <= mid && rightHelperIndex <= right) {
            if (helper[leftHelperIndex] <= helper[rightHelperIndex]) {
                array[left++] = helper[leftHelperIndex++];
            } else {
                array[left++] = helper[rightHelperIndex++];
            }
        }
        while (leftHelperIndex <= mid) {
            array[left++] = helper[leftHelperIndex++];
        }
    }
}

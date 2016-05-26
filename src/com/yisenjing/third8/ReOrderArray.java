package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class ReOrderArray {

    public int[] reorder(int[] array) {

        if (array.length <= 2) {
            return array;
        }
        if (array.length % 2 == 0) {
            reorder(array, 0, array.length - 1);
        } else {
            reorder(array, 0, array.length - 2);
        }
        return array;
    }


    private void reorder(int[] array, int start, int end) {
        int length = end - start + 1;

        if (length <= 2) {
            return;
        }

        int mid = start + length / 2;
        int mleft = start + length / 4;
        int mright = start + length * 3 / 4;

        reverse(array, mleft, mid - 1);
        reverse(array, mid, mright - 1);
        reverse(array, mleft, mright - 1);

        reorder(array, start, mid - 1);
        reorder(array, mid, end);
    }


    private void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


}

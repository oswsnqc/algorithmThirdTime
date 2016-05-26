package com.yisenjing.third1;

/**
 * Created by Yisen on 3/31/16.
 */
public class Move0sToTheEndI {

    public int[] moves(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }


        int begin = 0;
        int end = array.length - 1;

        while (begin <= end) {
            if (array[begin] == 0) {
                swap(array, begin, end--);
            } else {
                begin++;
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}


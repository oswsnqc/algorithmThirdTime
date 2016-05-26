package com.yisenjing.third1;

import java.util.Objects;

/**
 * Created by Yisen on 3/31/16.
 */
public class RainbowSort {


    public int[] rainBow(int[] array) {

        if (array == null ||array.length == 0) {
            return array;
        }


        int zero = 0;
        int one = array.length - 1;
        int neg = 0;


        while (zero <= one) {
            if (array[zero] == 1) {
                swap(array, zero, one--);
            } else if (array[zero] == 0) {
                zero++;
            } else {
                swap(array, neg++, zero++);
            }
        }

        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }


    public static synchronized int abc(int[] array) {

        return 0;
    }

}

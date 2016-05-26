package com.yisenjing.third16;

/**
 * Created by Yisen on 4/12/16.
 */
public class PerfectShuffle {


    public void shuffle(int[] array) {


        if (array.length <= 1) {
            return;
        }

        for (int i = array.length; i >= 1; i--) {
            int inx = (int)(Math.random() * i);
            swap(array, i - 1, inx);
        }





    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

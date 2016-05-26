package com.yisenjing.third12;

/**
 * Created by Yisen on 4/11/16.
 */
public class ArrayHopperI {

    public boolean canJump(int[] array) {
        boolean[] canjum = new boolean[array.length];


        canjum[0] = true;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (canjum[j] && array[j] + j >= i) {
                    canjum[i] = true;
                    break;
                }
            }
        }
        return canjum[array.length - 1];
    }


}

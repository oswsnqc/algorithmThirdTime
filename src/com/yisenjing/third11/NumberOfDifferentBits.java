package com.yisenjing.third11;

/**
 * Created by Yisen on 4/11/16.
 */
public class NumberOfDifferentBits {

    public int diffBits(int a, int b) {

        a ^= b;

        int count = 0;

        while (a != 0) {
            count += a & 1;
            a >>>= 1;
        }

        return count;
    }


}

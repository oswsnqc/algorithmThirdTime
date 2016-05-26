package com.yisenjing.third11;

/**
 * Created by Yisen on 4/11/16.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int number) {

        if (number <= 0) {
            return false;
        }

        while ((number & 1) == 0) {
            number >>>= 1;
        }
        return number == 1;
    }
}

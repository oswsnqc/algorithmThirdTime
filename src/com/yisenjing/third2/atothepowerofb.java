package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class atothepowerofb {

    public long power(int a, int b) {

        if (b == 0) {
            return 1;
        }

        if (a == 0) {
            return 0;
        }

        if (a == 1) {
            return 1;
        }

        long half = power(a, b / 2);

        return b % 2 == 0 ? half * half : a * half * half;

    }


}

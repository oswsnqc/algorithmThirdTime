package com.yisenjing.third2;

/**
 * Created by Yisen on 3/29/16.
 */
public class FibonacciNumber {

    public long fibo(int K) {

        if (K <= 0) {
            return 0;
        }

        if (K == 1) {
            return 1;
        }

        long origi = 0;
        long result = 1;


        for (int i = 1; i < K; i++) {
            long temp = origi;
            origi = result;
            result += temp;
        }
        return result;
    }

}

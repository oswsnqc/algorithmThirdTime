package com.yisenjing.third25;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Yisen on 4/21/16.
 */
public class KthSmallestWithOnly357AsFactors {

    public long kth(int k) {

        long seed = 3 * 5 * 7L;

        Deque<Long> three = new LinkedList<>();
        Deque<Long> five = new LinkedList<>();
        Deque<Long> seven = new LinkedList<>();

        three.offerLast(seed * 3);
        five.offerLast(seed * 5);
        seven.offerLast(seed * 7);
        long result = seed;

        while (k > 1) {
            if (three.peekFirst() < five.peekFirst() && three.peekFirst() < seven.peekFirst()) {
                result = three.pollFirst();
                three.offerLast(result * 3);
                five.offerLast(result * 5);
                seven.offerLast(result * 7);
            } else if (five.peekFirst() < seven.peekFirst() && five.peekFirst() < three.peekFirst()) {
                result = five.pollFirst();
                five.offerLast(result * 5);
                seven.offerLast(result * 7);
            } else {
                result = seven.pollFirst();
                seven.offerLast(result * 7);
            }
            k--;
        }
        return result;
    }


}

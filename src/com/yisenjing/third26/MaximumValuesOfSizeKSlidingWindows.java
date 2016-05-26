package com.yisenjing.third26;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yisen on 4/25/16.
 */
public class MaximumValuesOfSizeKSlidingWindows {


    public List<Integer> maxWindows(int[] array, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[stack.peekLast()] <= array[i]) {
                stack.pollLast();
            }

            if (!stack.isEmpty() && stack.peekFirst() <= i - k) {
                stack.pollFirst();
            }
            stack.offerLast(i);

            if (i >= k - 1) {
                result.add(array[stack.peekFirst()]);
            }
        }
        return result;
    }



}

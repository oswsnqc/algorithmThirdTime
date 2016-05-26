package com.yisenjing.third24;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yisen on 4/17/16.
 */
public class AllValidPermutationsOfParenthesesII {
    private final char[] signal = new char[]{'(', ')', '[', ']', '{', '}'};
    public List<String> validParentheses(int l, int m, int n) {
        int length = (l + m + n) * 2;
        int[] remain = new int[]{l, l, m, m, n, n};
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new LinkedList<>();
        advancedDFS(result, remain, sb, stack, length);
        return result;
    }

    private void advancedDFS(List<String> result, int[] remain, StringBuilder sb, Deque<Character> stack, int length) {

        if (sb.length() == length) {
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < remain.length; i++) {
            if (i % 2 == 0) {
                if (remain[i] > 0) {
                    stack.offerFirst(signal[i]);
                    remain[i]--;
                    sb.append(signal[i]);
                    advancedDFS(result, remain, sb, stack, length);
                    remain[i]++;
                    sb.deleteCharAt(sb.length() - 1);
                    stack.pollFirst();
                }
            } else {
                if (!stack.isEmpty() && stack.peekFirst() == signal[i - 1]) {
                    stack.pollFirst();
                    remain[i]--;
                    sb.append(signal[i]);
                    advancedDFS(result, remain, sb, stack, length);
                    remain[i]++;
                    sb.deleteCharAt(sb.length() - 1);
                    stack.offerFirst(signal[i - 1]);
                }
            }
        }
    }


}

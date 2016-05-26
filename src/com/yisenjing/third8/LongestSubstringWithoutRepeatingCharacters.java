package com.yisenjing.third8;

import java.util.HashSet;

/**
 * Created by Yisen on 4/10/16.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int longest(String input) {

        int slow = 0;
        int fast = 0;
        int longest = 0;

        char[] array = input.toCharArray();
        HashSet<Character> sets = new HashSet<>();

        while (fast < array.length) {
            if (sets.contains(array[fast])) {
                sets.remove(array[slow++]);
            } else {
                sets.add(array[fast++]);
                longest = Math.max(longest, fast - slow);
            }
        }
        return longest;
    }



}

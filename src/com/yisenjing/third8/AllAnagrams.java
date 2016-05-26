package com.yisenjing.third8;

import java.util.*;

/**
 * Created by Yisen on 4/10/16.
 */
public class AllAnagrams {

    public List<Integer> allAnagrams(String s, String l) {

        List<Integer> result = new ArrayList<Integer>();

        if (l.length() == 0) {
            return result;
        }

        if (s.length() > l.length()) {
            return result;
        }

        Map<Character, Integer> records = getMap(s);
        int match = 0;

        for (int i = 0; i < l.length(); i++) {
            char tmp = l.charAt(i);
            Integer count = records.get(tmp);
            if (count != null) {
                records.put(tmp, count - 1);
                if (count == 1) {
                    match++;
                }
            }

            if (i >= s.length()) {

                tmp = l.charAt(i - s.length());
                count = records.get(tmp);
                if (count != null) {
                    records.put(tmp, count + 1);
                    if (count == 0) {
                        match--;
                    }
                }
            }

            if (match == records.size()) {
                result.add(i - s.length() + 1);
            }
        }
        return result;
    }

    private Map<Character, Integer> getMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : s.toCharArray()) {
            Integer count = result.get(ch);
            if (count == null) {
                result.put(ch, 1);
            } else {
                result.put(ch, count + 1);
            }
        }
        return result;
    }





}

package com.yisenjing.third13;

import java.util.HashSet;

/**
 * Created by Yisen on 4/12/16.
 */
public class DictionaryWordI {

    public boolean canBreak(String input, String[] dict) {

        HashSet<String> sets = getHash(dict);
        boolean[] canBreak = new boolean[input.length() + 1];
        canBreak[0] = true;

        for (int i = 1; i < canBreak.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sets.contains(input.substring(j, i)) && canBreak[j]) {
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[canBreak.length - 1];
    }

    private HashSet<String> getHash(String[] dict) {
        HashSet<String> result = new HashSet<>();
        for (String s : dict) {
            result.add(s);
        }
        return result;
    }

}

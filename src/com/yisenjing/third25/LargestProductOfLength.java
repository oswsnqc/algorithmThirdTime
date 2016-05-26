package com.yisenjing.third25;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yisen on 4/21/16.
 */
public class LargestProductOfLength {

    public int largestProduct(String[] dict) {
        Map<String, Integer> map = getMask(dict);
        int largest = 0;
        for (int i = 0; i < dict.length; i++) {
            for (int j = i + 1; j < dict.length; j++) {
                int x = map.get(dict[i]);
                int y = map.get(dict[j]);
                if ((x & y) == 0) {
                    largest = largest < dict[i].length() * dict[j].length() ? dict[i].length() * dict[j].length() : largest;
                }
            }
        }
        return largest;
    }


    private Map<String, Integer> getMask(String[] dict) {
        Map<String, Integer> result = new HashMap<>();
        for (String theS : dict) {
            int mask = 0;
            char[] array = theS.toCharArray();

            for (char thec : array) {
                mask = mask | 1 << thec - 'a';
            }
            result.put(theS, mask);
        }
        return result;
    }


}

package com.yisenjing.third7;

import java.util.HashSet;

/**
 * Created by Yisen on 4/10/16.
 */
public class RemoveCertainCharacters {

    public String remove(String input, String t) {

        if (input.length() == 0 || t.length() == 0) {
            return input;
        }

        int slow = 0;

        char[] tArray = t.toCharArray();
        char[] iArray = input.toCharArray();

        HashSet<Character> set = convertSet(tArray);


        for (int i = 0; i < iArray.length; i++) {
            if (!set.contains(iArray[i])) {
                iArray[slow++] = iArray[i];
            }
        }
        return new String(iArray, 0, slow);
    }

    private HashSet<Character> convertSet(char[] array) {
        HashSet<Character> result = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }


}

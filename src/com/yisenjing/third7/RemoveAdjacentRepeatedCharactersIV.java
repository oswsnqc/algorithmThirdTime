package com.yisenjing.third7;

/**
 * Created by Yisen on 4/9/16.
 */
public class RemoveAdjacentRepeatedCharactersIV {

    public String deDup(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 1; i < array.length; i++) {
            if (end == -1 || array[i] != array[end]) {
                array[++end] = array[i];
            } else {
                end--;
                while (i + 1 < array.length && array[i] == array[i + 1]) {
                    i++;
                }
            }
        }
        return new String(array, 0, end + 1);
    }

}

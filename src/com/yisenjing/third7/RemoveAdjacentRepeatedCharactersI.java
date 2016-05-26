package com.yisenjing.third7;

/**
 * Created by Yisen on 4/9/16.
 */
public class RemoveAdjacentRepeatedCharactersI {

    public String deDup(String input) {

        if (input == null) {
            return input;
        }

        int end = 0;
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[end - 1]) {
                array[end] = array[i];
                end++;
            }
        }
        return new String(array, 0, end);
    }


}

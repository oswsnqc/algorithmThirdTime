package com.yisenjing.third7;

/**
 * Created by Yisen on 4/10/16.
 */
public class RemoveSpaces {

    public String removeSpaces(String input) {

        if (input.length() == 0) {
            return input;
        }

        int end = 0;
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ' && (i == 0 || array[i - 1] == ' ')) {
                continue;
            }
            array[end++] = array[i];
        }
        if (end > 0 && array[end - 1] == ' ') {
            return new String(array, 0, end - 1);
        }
        return new String(array, 0, end);
    }

}

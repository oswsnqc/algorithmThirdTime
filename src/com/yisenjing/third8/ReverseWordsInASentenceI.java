package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class ReverseWordsInASentenceI {

    public String reverseWords(String input) {

        if (input == null || input.length() <= 1) {
            return input;
        }

        char[] array = input.toCharArray();

        reverse(array, 0, array.length - 1);
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')) {
                start = i;
            }

            if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')) {
                reverse(array, start, i);
            }
        }
        return new String(array);
    }


    private void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


}

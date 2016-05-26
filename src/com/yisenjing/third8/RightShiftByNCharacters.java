package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class RightShiftByNCharacters {

    public String rightShift(String input, int n) {

        if (input.length() <= 1) {
            return input;
        }

        char[] array = input.toCharArray();
        n %= array.length;

        reverse(array, array.length - n, array.length - 1);
        reverse(array, 0, array.length - n - 1);
        reverse(array, 0, array.length - 1);
        return new String(array);
    }


    private void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }



}

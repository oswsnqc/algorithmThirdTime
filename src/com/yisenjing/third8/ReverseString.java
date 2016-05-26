package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class ReverseString {

    public String reverse(String input) {

        char[] array = input.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        return new String(array);
    }
}

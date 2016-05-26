package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class DecompressStringII {
    public String decompress(String input) {

        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i++];
            int code = array[i] - '0';
            for (int c = 0; c < code; c++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

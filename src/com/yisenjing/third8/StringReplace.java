package com.yisenjing.third8;

/**
 * Created by Yisen on 4/10/16.
 */
public class StringReplace {

    public String replace(String input, String s, String t) {

        StringBuilder sb = new StringBuilder();
        int fromIndex = 0;
        int matchIndex = input.indexOf(s, fromIndex);

        while (matchIndex != -1) {
            sb.append(input, fromIndex, matchIndex).append(t);
            fromIndex = matchIndex + s.length();
            matchIndex = input.indexOf(s, fromIndex);
        }

        sb.append(input, fromIndex, input.length());
        return sb.toString();
    }


}

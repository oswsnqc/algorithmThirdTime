package com.yisenjing.third10;

/**
 * Created by Yisen on 4/11/16.
 */
public class StringAbbreviationMatching {

    public boolean match(String input, String pattern) {

        int ii = 0;
        int pi = 0;

        while (ii < input.length() && pi < pattern.length()) {

            if (pattern.charAt(pi) > '9' || pattern.charAt(pi) < '0') {
                if (input.charAt(ii) != pattern.charAt(pi)) {
                    return false;
                }
                ii++;
                pi++;
            } else {
                int num = 0;
                while (pi < pattern.length() && pattern.charAt(pi) <= '9' && pattern.charAt(pi) >= '0') {
                    num = num * 10 + (pattern.charAt(pi++) - '0');
                }
                ii = ii + num;
            }
        }
        return ii == input.length() && pi == pattern.length();
    }



}

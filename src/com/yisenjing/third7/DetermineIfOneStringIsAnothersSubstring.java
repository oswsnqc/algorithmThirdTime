package com.yisenjing.third7;

/**
 * Created by Yisen on 4/9/16.
 */
public class DetermineIfOneStringIsAnothersSubstring {


    public int strstr(String large, String small) {

        if (large.length() < small.length()) {
            return -1;
        }

        if (small.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= large.length() - small.length(); i++) {
            if (equal(large, i, small)) {
                return i;
            }
        }
        return -1;
    }


    private boolean equal(String large, int i, String small) {
        for (int p = 0; p < small.length(); p++) {
            if (large.charAt(p + i) != small.charAt(p)) {
                return false;
            }
        }
        return true;
    }


}

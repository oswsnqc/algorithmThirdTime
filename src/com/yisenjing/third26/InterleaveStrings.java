package com.yisenjing.third26;

/**
 * Created by Yisen on 4/25/16.
 */
public class InterleaveStrings {

    public boolean canMerge(String a, String b, String c) {
        char[] ary = a.toCharArray();
        char[] bry = b.toCharArray();
        char[] cry = c.toCharArray();

        if (ary.length + bry.length == cry.length && cry.length == 0) {
            return true;
        }

        if (ary.length + bry.length != cry.length) {
            return false;
        }
        boolean[][] path = new boolean[ary.length + 1][bry.length + 1];
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                if (i == 0 && j == 0) {
                    path[i][j] = true;
                } else {
                    if (i > 0 && ary[i - 1] == cry[i + j - 1]) {
                        path[i][j] |= path[i - 1][j];
                    }

                    if (j > 0 && bry[j - 1] == cry[i + j - 1]) {
                        path[i][j] |= path[i][j - 1];
                    }
                }
            }
        }
        return path[path.length - 1][path[0].length - 1];
    }


}

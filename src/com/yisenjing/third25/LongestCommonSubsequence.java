package com.yisenjing.third25;

/**
 * Created by Yisen on 4/20/16.
 */
public class LongestCommonSubsequence {

    public int longest(String s, String t) {


        if (s.length() == 0 || t.length() == 0) {
            return 0;
        }

        int[][] memory = new int[s.length()][t.length()];


        for (int i = 0; i < memory.length; i++) {
            for (int j = 0; j < memory[0].length; j++) {

                if (i == 0 && j == 0) {
                    memory[i][j] = s.charAt(i) == t.charAt(j) ? 1 : 0;
                } else if (i == 0) {
                    memory[i][j] = s.charAt(i) == t.charAt(j) ? 1 : memory[i][j - 1];
                } else if (j == 0) {
                    memory[i][j] = s.charAt(i) == t.charAt(j) ? 1 : memory[i - 1][j];
                } else {
                    memory[i][j] = s.charAt(i) == t.charAt(j) ? memory[i - 1][j - 1] + 1 : Math.max(memory[i - 1][j], memory[i][j - 1]);
                }
            }
        }
        return memory[s.length() - 1][t.length() - 1];
    }


}

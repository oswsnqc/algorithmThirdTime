package com.yisenjing.third13;

import java.util.Arrays;

/**
 * Created by Yisen on 4/12/16.
 */
public class EditDistance {


    public int editDistance(String one, String two) {

        if (one.length() == 0) {
            return two.length();
        }

        if (two.length() == 0) {
            return one.length();
        }

        int[][] matrix = new int[one.length()][two.length()];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = one.charAt(i) == two.charAt(j) ? 0 : 1;
                } else if (i == 0) {
                    matrix[i][j] = one.charAt(i) == two.charAt(j) ? matrix[i][j - 1] : matrix[i][j - 1] + 1;
                } else if (j == 0) {
                    matrix[i][j] = one.charAt(i) == two.charAt(j) ? matrix[i - 1][j] : matrix[i - 1][j] + 1;
                } else {
                    int min = Math.min(Math.min(matrix[i][j - 1], matrix[i - 1][j]), matrix[i - 1][j - 1]);
                    matrix[i][j] = one.charAt(i) == two.charAt(j) ? matrix[i - 1][j - 1] : min + 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        return matrix[one.length() - 1][two.length() - 1];
    }

}

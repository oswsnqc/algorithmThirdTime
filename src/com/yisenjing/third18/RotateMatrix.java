package com.yisenjing.third18;

/**
 * Created by Yisen on 4/13/16.
 */
public class RotateMatrix {

    public void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        rotateXY(matrix);
        rotateY(matrix);
    }


    private void rotateY(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                swap(matrix, i, j, i, matrix[0].length - 1 - j);
            }
        }
    }

    private void rotateXY(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; i + j < matrix[0].length - 1; j++) {        //每行减1,同时不碰到对角线
                swap(matrix, i, j, matrix.length - j - 1, matrix[0].length - i - 1);
            }
        }
    }
    private void swap(int[][] matrix, int a1, int a2, int b1, int b2) {
        int temp = matrix[a1][a2];
        matrix[a1][a2] = matrix[b1][b2];
        matrix[b1][b2] = temp;
    }

}

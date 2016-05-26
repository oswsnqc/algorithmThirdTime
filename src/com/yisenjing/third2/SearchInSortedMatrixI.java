package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class SearchInSortedMatrixI {


    public int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hori = mid % matrix[0].length;
            int verti = (mid - hori) / matrix[0].length;
            if (matrix[verti][hori] < target) {
                left = mid + 1;
            } else if (matrix[verti][hori] > target) {
                right = mid - 1;
            } else {
                return new int[]{verti, hori};
            }
        }
        return new int[]{-1, -1};
    }

}

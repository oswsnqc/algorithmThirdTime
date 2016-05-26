package com.yisenjing.third25;

/**
 * Created by Yisen on 4/23/16.
 */
public class LargestRectangleInHistogram {

    public int largest(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int currentHeight = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {

                currentHeight = Math.min(currentHeight, array[j]);
                result = Math.max(result, currentHeight * (j - i + 1));

            }
        }
        return result;
    }


}

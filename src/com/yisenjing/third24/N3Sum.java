package com.yisenjing.third24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yisen on 4/19/16.
 */
public class N3Sum {

    public List<List<Integer>> allTriples(int[] array, int target) {
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }

            while (left < right) {
                int sum = array[left] + array[right];
                if (array[i] + sum == target) {
                    result.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    while (left < right && array[left] == array[left - 1]) {
                        left++;
                    }

                } else if (array[i] + sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

}

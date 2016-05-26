package com.yisenjing.third24;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yisen on 4/19/16.
 */
public class N4Sum {

    public boolean exist(int[] array, int target) {

        Map<Integer, int[]> map = new HashMap<>();


        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {

                int sum = array[i] + array[j];

                if (map.containsKey(target - sum) && map.get(target - sum)[1] < j) {
                    return true;
                }

                if (!map.containsKey(sum)) {
                    map.put(sum, new int[]{j, i});
                }

            }
        }
        return false;

    }

}

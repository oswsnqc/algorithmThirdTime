package com.yisenjing.third24;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Yisen on 4/19/16.
 */
public class N2SumAllPairI {

    public List<List<Integer>> allPairs(int[] array, int target) {


        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            List<Integer> list = map.get(target - array[i]);
            if (list != null) {
                for (int j : list) {
                    result.add(Arrays.asList(i, j));
                }
            }

            if (!map.containsKey(array[i])) {
                map.put(array[i], new ArrayList<>());
            }
            map.get(array[i]).add(i);
        }
        return result;

    }


}

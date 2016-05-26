package com.yisenjing.third24;

import java.util.HashSet;

/**
 * Created by Yisen on 4/17/16.
 */
public class N2Sum {

    public boolean existSum(int[] array, int target) {


        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}

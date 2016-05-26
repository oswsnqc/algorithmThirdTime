package com.yisenjing.third16;

import java.util.List;

/**
 * Created by Yisen on 4/13/16.
 */
public class N95Percentile {


    public int percentile95(List<Integer> lengths) {


        int[] count = new int[4097];


        for (Integer len : lengths) {
            count[len] += 1;
        }

        int sum = 0;
        int length = 4097;
        while (sum <= 0.05 * lengths.size()) {
            sum += count[--length];
        }
        return length;
    }


}

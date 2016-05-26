package com.yisenjing.third7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/9/16.
 */
public class CommonNumbersOfTwoSortedArrays {

    public List<Integer> common(List<Integer> A, List<Integer> B) {

        List<Integer> result = new ArrayList<>();
        if (A.size() == 0 || B.size() == 0) {
            return result;
        }

        int aIndex = 0;
        int bIndex = 0;

        while (aIndex < A.size() && bIndex < B.size()) {
            if (A.get(aIndex).equals(B.get(bIndex))) {
                result.add(A.get(aIndex));
                aIndex++;
                bIndex++;
            } else if (A.get(aIndex) < B.get(bIndex)) {
                aIndex++;
            } else {
                bIndex++;
            }
        }
        return result;
    }


}

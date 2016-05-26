package com.yisenjing.third24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/16/16.
 */
public class CommonElementsInThreeSortedArray {

    public List<Integer> common(int[] a, int[] b, int[] c) {

        List<Integer> result = new ArrayList<>();
        if (a.length == 0 || b.length == 0 || c.length == 0) {
            return result;
        }

        int ia = 0;
        int ib = 0;
        int ic = 0;

        while (ia < a.length && ib < b.length && ic < c.length) {
            if (a[ia] == b[ib] && b[ib] == c[ic]) {
                result.add(a[ia]);
                ia++;
                ib++;
                ic++;
            } else {
                if (a[ia] <= b[ib] && a[ia] <= c[ic]) {
                    ia++;
                } else if (b[ib] <= a[ia] && b[ib] <= c[ic]) {
                    ib++;
                } else if (c[ic] <= b[ib] && c[ic] <= a[ia]) {
                    ic++;
                }
            }
        }
        return result;
    }


}

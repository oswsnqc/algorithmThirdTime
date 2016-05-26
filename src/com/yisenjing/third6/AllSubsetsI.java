package com.yisenjing.third6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/8/16.
 */
public class AllSubsetsI {


    public List<String> subSets(String set) {
        List<String> result = new ArrayList<String>();

        if (set == null) {
            return result;
        }

        DFS(result, set, 0, "");
        return result;
    }

    private void DFS(List<String> result, String set, int index, String cur) {

        if (index == set.length()) {
            result.add(cur);
            return;
        }
        DFS(result, set, index + 1, cur);
        DFS(result, set, index + 1, cur + set.charAt(index));
    }
}

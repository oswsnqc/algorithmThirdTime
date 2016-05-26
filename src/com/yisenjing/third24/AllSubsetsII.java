package com.yisenjing.third24;

import java.util.*;

/**
 * Created by Yisen on 4/16/16.
 */
public class AllSubsetsII {


    public List<String> subSets(String set) {

        List<String> result = new ArrayList<>();

        if (set == null) {
            return result;
        }

        HashSet<String> setss = new HashSet<>();
        char[] array = set.toCharArray();

        Arrays.sort(array);

        DFS(result, setss, "", 0, array);
        return result;
    }

    private void DFS(List<String> result, HashSet<String> set, String temp, int index, char[] array) {

        if (index == array.length) {
            if (!set.contains(temp)) {
                result.add(temp);
                set.add(temp);
            }
            return;
        }
        DFS(result, set, temp, index + 1, array);
        DFS(result, set, temp + array[index], index + 1, array);
    }


}

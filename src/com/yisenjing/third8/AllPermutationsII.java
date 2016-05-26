package com.yisenjing.third8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Yisen on 4/10/16.
 */
public class AllPermutationsII {

    public List<String> permutations(String set) {

        List<String> result = new ArrayList<>();

        if (set == null) {
            return result;
        }
        char[] array = set.toCharArray();
        HashSet<String> sets = new HashSet<>();
        DFS(array, 0, result, sets);
        return result;
    }

    private void DFS(char[] array, int index, List<String> result, HashSet<String> sets) {

        if (index == array.length) {
            String tmp = array.toString();
            if (!sets.contains(tmp)) {
                result.add(tmp);
                sets.add(tmp);
            }
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            DFS(array, index + 1, result,sets);
            swap(array, i, index);
        }
    }


    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

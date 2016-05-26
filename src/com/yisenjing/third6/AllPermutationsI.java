package com.yisenjing.third6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/8/16.
 */
public class AllPermutationsI {

    public List<String> permutations(String set) {
        List<String> result = new ArrayList<String>();

        if (set == null) {
            return result;
        }

        char[] array = set.toCharArray();
        DFS(array, 0, result);
        return result;
    }

    private void DFS(char[] array, int index, List<String> result) {

        if (index == array.length) {
            result.add(new String(array));
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            DFS(array, index + 1, result);
            swap(array, i, index);
        }
    }

    private void swap(char[] array, int i , int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

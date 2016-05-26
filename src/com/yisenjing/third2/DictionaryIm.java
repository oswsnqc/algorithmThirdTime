package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class DictionaryIm implements Dictionary {

    public Integer get(int index) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (index < array.length && index >= 0) {
            return array[index];
        } else {
            return null;
        }
    }

}

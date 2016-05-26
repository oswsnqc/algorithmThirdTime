package com.yisenjing.third11;

/**
 * Created by Yisen on 4/11/16.
 */
public class AllUniqueCharactersII {

    public boolean allUnique(String word) {

        char[] array = word.toCharArray();

        int[] storage = new int[8];

        for (char c : array) {
            if ((storage[c / 32] >>> (c % 32) & 1) != 0) {
                return false;
            }
            storage[c / 32] |= 1 << (c % 32);
        }
        return true;
    }


}

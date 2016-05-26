package com.yisenjing.third2;

/**
 * Created by Yisen on 4/6/16.
 */
public class SearchInUnknownSizedSortedArray {

    public int search(int target) {

        Dictionary dict = new DictionaryIm();

        if (dict == null) {
            return -1;
        }

        int left = 0;
        int right = 1;

        while (dict.get(right) != null && dict.get(right) < target) {
            left = right;
            right = right *  2;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (dict.get(mid) == null || dict.get(mid) > target) {
                right = mid - 1;
            } else if (dict.get(mid) < target){
                left = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}

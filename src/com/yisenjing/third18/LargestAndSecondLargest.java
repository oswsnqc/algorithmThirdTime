package com.yisenjing.third18;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/13/16.
 */
public class LargestAndSecondLargest {


    static class Element {
        public int value;
        public List<Integer> comparedValue;

        public Element(int value) {
            this.value = value;
            this.comparedValue = new ArrayList<>();
        }
    }

    public int[] largestAndSecond(int[] array) {
        int length = array.length;
        Element[] eArray = helper(array);
        while (length > 1) {
            shrinkArray(eArray, length);
            length = (length + 1) / 2;
        }
        return new int[]{eArray[0].value, largest(eArray[0].comparedValue)};
    }


    private void swap(Element[] array, int left, int right) {
        Element temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private Element[] helper(int[] array) {
        Element[] result = new Element[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Element(array[i]);
        }
        return result;
    }

    private void shrinkArray(Element[] array, int length) {

        for (int i = 0; i < length / 2; i++) {
            if (array[i].value < array[length - 1 - i].value) {
                swap(array, i, length - 1 - i);
            }
            array[i].comparedValue.add(array[length - 1 - i].value);
        }
    }

    private int largest(List<Integer> array) {
        int max = Integer.MIN_VALUE;
        for (Integer el : array) {
            max = Math.max(max, el);
        }
        return max;
    }



}

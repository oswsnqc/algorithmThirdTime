package com.yisenjing.third1;

/**
 * Created by Yisen on 3/29/16.
 */
public class QuickSort {

    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {


        if (left >= right) {
            return;
        }

        int privot = privotSort(array, left, right);
        quickSort(array, left, privot - 1);
        quickSort(array, privot + 1, right);
    }

    private int privotSort(int[] array, int left, int right) {

        int priIndex = randomGenerator(left, right);
        int privotContent = array[priIndex];
        int leftIndex = left;
        int rightIndex = right - 1;
        swap(array, priIndex, right);

        while (leftIndex <= rightIndex) {
            if (array[leftIndex] < privotContent) {
                leftIndex++;
            } else if (array[rightIndex] > privotContent) {
                rightIndex--;
            } else {
                swap(array, leftIndex++, rightIndex--);
            }
        }
        swap(array, leftIndex, right);
        return leftIndex;
    }


    private int randomGenerator(int left, int right) {
        return left + (int) Math.random() * (right - left + 1);
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


}

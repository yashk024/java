package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Selection_sort">wikipedia/Selection_sort</a>
 */

public class SelectionSort {

    /**
     * Sorts an array of integers in non-decreasing order using selection sort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        int minIndex, key;
        for (int i = 0; i < array.length - 1; i++) {

            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            key = array[minIndex];
            while (minIndex > i)
                array[minIndex] = array[--minIndex];
            array[i] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

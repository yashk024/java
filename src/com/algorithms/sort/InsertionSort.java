package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Insertion_sort">wikipedia_Insertion_sort</a>
 */

public class InsertionSort {

    /**
     * Sorts an array of integers in non-decreasing order using insertion sort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        int key, j;

        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

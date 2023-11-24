package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Bubble_sort">wikipedia/Bubble_sort</a>
 */

public class BubbleSort {

    /**
     * Sorts an array of integers in non-decreasing order using bubble sort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        int n = array.length - 1, new_n;
        do {
            new_n = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    new_n = j;
                }
            }
            n = new_n;
        } while (n > 0);
    }

    /**
     * Swaps two elements in an arrays of integers.
     *
     * @param array The array of integers.
     * @param i     The index of the first element to be swapped.
     * @param j     The index of the second element to be swapped.
     */

    private static void swap(int[] array, int i, int j) {
        array[i] = (array[i] ^ array[j]) ^ (array[j] = array[i]);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        // int[] arr = { 6, 5, 2, 3, 4, 9, 7 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Shellsort">wikipedia/ShellSort</a>
 */

public class ShellSort {

    /**
     * Sorts an array of integers in non-decreasing order using ShellSort algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {

        // Hibbard gap sequence { 1, 3, 7, 15, 31, 63, ... }
        int gap = (array.length >> 1);
        while ((gap & (gap - 1)) != 0) {
            gap &= (gap - 1);
        }
        --gap;

        int key, j;
        for (int k = gap; k > 0; k >>= 1) {

            for (int i = k; i < array.length; i++) {
                key = array[i];
                j = i - k;
                while (j >= 0 && array[j] > key) {
                    array[j + k] = array[j];
                    j -= k;
                }
                array[j + k] = key;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

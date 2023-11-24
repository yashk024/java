package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Radix_sort">wikipedia/Radix_sort</a>
 */

public class RadixSort {

    private static void countingSort(int[] array, int di) {

        // Create an auxiliary array to count occurrence of each digit `di`
        int[] aux = new int[19]; // for -9 to +9

        int r;
        for (int j : array) {
            r = j / (int) (Math.pow(10, di)) % 10;
            aux[r + 9]++;
        }

        for (int i = 1; i < aux.length; i++) {
            aux[i] += aux[i - 1];
        }

        int[] clone = array.clone();

        for (int i = clone.length - 1; i >= 0; i--) {
            r = clone[i] / (int) (Math.pow(10, di)) % 10;
            array[--aux[r + 9]] = clone[i];
        }

    }

    /**
     * Sorts an array of integers in non-decreasing order using radix sort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     * @param d     The maximum length of digit in the input array.
     */

    public static void sort(int[] array, int d) {
        for (int i = 0; i < d; i++) {
            countingSort(array, i);
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        // int[] arr = { 4, -10, 0, 6, 1, -5, -5, -2, 1, 1, 0, 6, 8, -7, 10 };
        int[] arr = { 12, 11, 13, 22, 16, 10, 24 };
        sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

}

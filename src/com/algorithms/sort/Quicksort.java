package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Quicksort">wikipedia/Quicksort</a>
 */

public class Quicksort {

    /**
     * Sorts an array of integers in non-decreasing order using Quicksort algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    /**
     * Recursively sorts a sub-array in non-decreasing using the Quicksort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     * @param start The starting index of the sub-array.
     * @param end   The ending index of the sub-array.
     */

    private static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int part = partition(array, start, end);
            quicksort(array, start, part);
            quicksort(array, part + 1, end);
        }
    }

    /**
     * Partitions a sub-array into two parts: elements less than the pivot and
     * elements greater than the pivot.
     *
     * @param array The array to be partitioned.
     * @param start The starting index of the sub-array.
     * @param end   The ending index of the sub-array.
     * @return The index where the partitioning is completed.
     */

    // Hoare partition scheme
    private static int partition(int[] array, int start, int end) {
        int pivot = array[(start + end) >>> 1];

        while (true) {
            while (array[start] < pivot)
                start++;
            while (array[end] > pivot)
                end--;
            if (start >= end)
                return end;
            swap(array, start++, end--);
        }
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
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

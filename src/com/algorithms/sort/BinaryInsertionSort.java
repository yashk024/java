package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Insertion_sort">wikipedia/Insertion_sort</a>
 */

public class BinaryInsertionSort {

    /**
     * Sorts an array of integers in non-decreasing order using insertion sort
     * algorithm, but instead of using linear search to find the index where
     * {@code key} needs to be inserted, it uses binary search.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        int key, left, right, mid;

        for (int i = 1; i < array.length; i++) {
            key = array[i];
            left = 0;
            right = i;

            while (left < right) {
                mid = left + ((right - left) >> 1);
                if (key < array[mid])
                    right = mid;
                else
                    left = mid + 1;
            }

            // System.arraycopy(array, left, array, left + 1, i - left);
            for (int j = i; j > left; j--)
                array[j] = array[j - 1];

            array[left] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

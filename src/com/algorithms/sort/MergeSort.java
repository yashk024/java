package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Merge_sort">wikipedia/Merge_sort</a>
 */

public class MergeSort {

    /**
     * Sorts an array of integers in non-decreasing order using merge sort
     * algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        if (array.length == 1) {
            return;
        }

        int mid = array.length >> 1;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        System.arraycopy(array, 0, leftArray, 0, mid);
        System.arraycopy(array, mid, rightArray, 0, array.length - mid);

        sort(leftArray);
        sort(rightArray);
        merge(array, leftArray, rightArray);
    }

    /**
     * Merges two sorted array of integers to a single sorted array.
     *
     * @param array      The array into which to merge the two sorted arrays.
     * @param leftArray  The left sorted array.
     * @param rightArray The right sorted array.
     */

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i, j, k;
        i = j = k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Heapsort">wikipedia/Heapsort</a>
 */

public class Heapsort {

    /**
     * Sorts an array of integers in non-decreasing order using heapsort algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {

        // build max-heap
        for (int i = (array.length >> 1) - 1; i >= 0; i--) {
            heapify(array, i, array.length);
        }

        // one by one extract top (largest) element from the heap
        for (int i = array.length - 1; i > 0; i--) {
            // swap top element with the last element
            swap(array, 0, i);
            // call max-heapify on reduced heap
            heapify(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapify(int[] array, int index, int heapSize) {

        int left = (index << 1) | 1; // left child
        int right = left + 1; // right child
        int largest = index;

        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        if (array[largest] > array[index]) {
            swap(array, index, largest);
            heapify(array, largest, heapSize);
        }
    }

    private static void swap(int[] array, int i, int j) {
        array[i] = (array[i] ^ array[j]) ^ (array[j] = array[i]);
    }
}

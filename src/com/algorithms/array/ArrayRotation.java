package com.algorithms.array;

import java.util.Arrays;

public class ArrayRotation {

    /**
     * Reverses a portion of an array of integers in-place.
     *
     * @param array The array of integers.
     * @param start The start index of the portion to reverse (inclusive).
     * @param end   The end index of the portion to reverse (inclusive).
     */

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start++, end--);
        }
    }

    /**
     * Rotates the elements of an array of integers to the right a specified number
     * of times.
     *
     * @param array The array of integers.
     * @param k     The number of times to rotate the array to right.
     */

    public static void rotateRight(int[] array, int k) {
        k %= array.length;
        reverseArray(array, 0, array.length - 1);
        reverseArray(array, 0, k - 1);
        reverseArray(array, k, array.length - 1);
    }

    /**
     * Rotates the elements of an array of integers to the left a specified number
     * of times.
     *
     * @param array The array of integers.
     * @param k     The number of times to rotate the array to left.
     */

    public static void rotateLeft(int[] array, int k) {
        k %= array.length;
        reverseArray(array, 0, array.length - 1);
        reverseArray(array, 0, array.length - 1 - k);
        reverseArray(array, array.length - k, array.length - 1);
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
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 4;
        // reverseArray(arr, 0, arr.length - 1);
        rotateRight(arr, k);
        rotateLeft(arr2, k);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

}

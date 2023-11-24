package com.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Maximum_subarray_problem">wikipedia/Maximum_subarray_problem</a>
 */

public class KadaneAlgorithm {

    /**
     * Finds the sum of a contiguous sub-array with the largest sum using Kadane's
     * algorithm.
     *
     * @param array The array of integers. {@code array.length} must be > 0.
     * @return The sum of contiguous sub-array with the largest sum.
     */

    public static int maxSubArraySum(int[] array) {
        int current_sum = array[0];
        int best_sum = array[0];
        for (int i = 1; i < array.length; i++) {
            current_sum = Integer.max(array[i], current_sum + array[i]);
            best_sum = Integer.max(best_sum, current_sum);
        }
        return best_sum;
    }

    /**
     * Finds a contiguous sub-array whose values have the greatest sum.
     *
     * @param array The array of integers. {@code array.length} must be > 0.
     * @return The sub-array with the largest sum.
     */

    public static int[] maxSumSubArray(int[] array) {
        int current_sum = array[0];
        int best_sum = array[0];
        int start = 0, end = 0;

        for (int i = 1; i < array.length; i++) {
            if (current_sum + array[i] > array[i]) {
                current_sum += array[i];
                if (current_sum > best_sum) {
                    best_sum = current_sum;
                    end = i;
                }
            } else {
                current_sum = array[i];
                if (current_sum > best_sum) {
                    best_sum = current_sum;
                    end = (start = i) + end;
                }
            }
        }

        int[] arr = new int[end - start + 1];
        System.arraycopy(array, start, arr, 0, arr.length);
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] arr2 = { 13, -3, 18, 20, -7, 12, -25, 20, -3, -16, -23, -5, -22, 15, 7 };
        System.out.println(maxSubArraySum(arr2));
        System.out.println(Arrays.toString(maxSumSubArray(arr2)));
    }

}

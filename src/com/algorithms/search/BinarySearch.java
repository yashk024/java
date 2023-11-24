package com.algorithms.search;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Binary_search_algorithm">wikipedia/Binary_search_algorithm</a>
 */

public class BinarySearch {

    /**
     * Searches for the index of a target value in an array sorted in non-decreasing
     * order using binary search algorithm.
     *
     * @param array  The array of integers sorted in non-decreasing order.
     * @param target The value to search for in the input array.
     * @return The index of {@code value} if found, else -1
     */

    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (array[mid] == target)
                return mid;
            if (target < array[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 1; i <= 1000; i++)
            arr[i - 1] = i * 57;
        int target = 5301;

        // int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        // int target = 4;

        int index = search(arr, target);
        System.out.println(index);
    }

}

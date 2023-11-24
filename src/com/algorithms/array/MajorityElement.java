package com.algorithms.array;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm">
 *      Boyer Moore majority vote algorithm</a>
 */

public class MajorityElement {

    /**
     * Finds the majority element in an array of integers using Boyer-Moore majority
     * vote algorithm.
     * A majority element is an element that appears more than {@code n/2} times in
     * an array of size {@code n}.
     *
     * @param array The array of integers.
     * @return The majority element (if exists).
     * @throws RuntimeException If no element exists in majority.
     */

    public static int majorityElement(int[] array) {
        int candidate = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = array[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int element : array) {
            if (element == candidate) {
                count++;
            }
        }

        if (count > array.length >> 1) {
            return candidate;
        }

        throw new RuntimeException("no element exists in majority.");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 2, 3, 2, 1, 2, 2, 2, 0, 2, 1 };
        System.out.println(majorityElement(arr));
    }

}

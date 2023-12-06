package com.algorithms.math.prime;

import java.util.Arrays;

public class LeastPrimeFactor {

    /**
     * Generates an array containing the least prime factor for each number from 1
     * to n.
     *
     * @param n The maximum number for which to calculate the least prime factors.
     * @return An array of size {@code (n + 1)} where the element at index {@code i}
     *         represents the least prime factor of {@code i}.
     *         If {@code i} is a prime number, the value at index {@code i} will be
     *         {@code i}.
     *         {@code n} must be {@code > 0}
     */

    public static int[] leastPrimeFactor(int n) {
        int[] lpf = new int[n + 1];
        lpf[1] = 1;
        for (int i = 2; i < lpf.length; i++) {
            if (lpf[i] == 0) {
                lpf[i] = i;
                for (int j = i * i; j < lpf.length; j += i) {
                    if (lpf[j] == 0) {
                        lpf[j] = i;
                    }
                }
            }
        }
        return lpf;
    }

    public static void main(String[] args) {
        int n = 77;
        System.out.println(Arrays.toString(leastPrimeFactor(n)));
    }

}

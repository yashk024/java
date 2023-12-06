package com.algorithms.math.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    /**
     * Factorizes a positive integer into its prime factors.
     *
     * @param n The integer to be factorized.
     * @return A list of prime factors of the input integer.
     */

    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();

        while ((n & 1) == 0) {
            factors.add(2);
            n >>= 1;
        }

        int k = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < k; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int n = 194;
        System.out.println(factorize(n));
    }

}

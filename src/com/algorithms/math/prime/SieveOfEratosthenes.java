package com.algorithms.math.prime;

import java.util.Arrays;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">wikipedia/Sieve_of_Eratosthenes</a>
 */

public class SieveOfEratosthenes {

    /**
     * Generates a boolean array indicating whether numbers up to the given limit
     * are prime or not.
     *
     * @param n The upper limit up to which to generate prime numbers. {@code n}
     *          must be > 1.
     * @return A boolean array where value at each index represents the primality of
     *         the corresponding index.
     */

    public static boolean[] primesTill(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        int k = (int) Math.sqrt(n) + 1;

        for (int i = 2; i < k; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[i] = false;
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 100;
        boolean[] primes = primesTill(n);

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.printf("%d ", i);
            }
        }
    }

}

package com.algorithms.math.prime;

/**
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Prime_number">wikipedia/Prime_number</a>
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Primality_test">wikipedia/Primality_test</a>
 */

public class PrimeNumber {

    /**
     * Checks whether a given integer in a prime number.
     *
     * @param n The integer to be checked for primality.
     * @return {@code true} if the {@code n} is prime, {@code false} otherwise.
     */

    public static boolean isPrime(int n) {

        if (n == 2 || n == 3)
            return true;

        if (n < 2 || (n & 1) == 0 || (n % 3) == 0)
            return false;

        int k = (int) Math.sqrt(n) + 1;
        for (int i = 5; i < k; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        // System.out.println(isPrime(1000000007)); // 10^{9} + 7
    }

}

package com.algorithms.math;

/**
 * The Fibonacci sequence starts with 0, 1, and each subsequent number after
 * that is the sum of the previous two. The first few values in the sequence
 * are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 *
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Fibonacci_sequence">wikipedia/Fibonacci_sequence</a>
 */

public class FibonacciNumber {

    /**
     * Calculates the nth Fibonacci number using an iterative approach.
     *
     * @param n The position of the desired Fibonacci number. {@code n} must be > 0.
     * @return The nth Fibonacci number.
     */

    public static int fibo(int n) {
        int now = 0, next = 1;
        while (--n > 0) {
            next = now + (now = next);
        }
        return now;
    }

    /**
     * Calculates the nth Fibonacci number using an iterative approach with
     * memoization.
     *
     * @param n The position of the desired Fibonacci number. {@code n} must be > 0.
     * @return The nth Fibonacci number.
     */

    public static int fiboMemo(int n) {
        if (n == 1) {
            return 0;
        }
        int[] memo = new int[n];
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }

    /**
     * Calculates the nth Fibonacci number using Binet's Formula, providing an
     * approximation in constant time.
     *
     * @param n The position of the desired Fibonacci number. {@code n} must be > 0.
     * @return An approximate value of the nth Fibonacci number.
     */

    public static int fiboConstantTime(int n) {
        double sqrt5 = Math.sqrt(5);

        double phi = (1 + sqrt5) / 2; // Golden ratio
        double phi_conjugate = (1 - sqrt5) / 2;

        /*
         * `phi` and `phi_conjugate` are the two roots
         * of the equation: x^{2} = x + 1
         */

        return (int) Math.round((Math.pow(phi, n - 1) - Math.pow(phi_conjugate, n - 1)) / sqrt5);
    }

    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", fiboConstantTime(i));
        }
        System.out.println(fibo(12));
        System.out.println(fiboMemo(12));
    }

}

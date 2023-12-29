package com.algorithms.math;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">
 *      Greatest common divisor</a>
 */

public class GCD {

    /**
     * Calculates GCD of two numbers using iterative Euclidean algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */

    public static int gcd(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;

        if (a == 0) {
            return b;
        }
        while (b > 0) {
            b = a % (a = b);
        }

        return a;
    }

    /**
     * Calculates GCD of two numbers using recursive Euclidean algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */

    public static int gcdRecursive(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;

        return (a == 0) ? b : gcd(b % a, a);
    }

    public static void main(String[] args) {
        int x = 36;
        int y = 60;
        System.out.println(gcd(x, y));
        System.out.println(gcdRecursive(x, y));
    }

}

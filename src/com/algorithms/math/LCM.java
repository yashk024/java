package com.algorithms.math;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Least_common_multiple">
 *      Least common multiple</a>
 */

public class LCM {

    /**
     * Calculates LCM of two numbers.
     * 
     * @param a The first number. {@code a} must be {@code >= 0}.
     * @param b The second number. {@code b} must be {@code >= 0}.
     * @return The LCM of the two numbers.
     */

    public static int lcm(int a, int b) {
        return a / GCD.gcd(a, b) * b;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        System.out.println(lcm(x, y));
    }

}

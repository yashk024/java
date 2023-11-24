package com.algorithms.math;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Narcissistic_number">
 *      Narcissistic Number</a>
 */

public class NarcissisticNumber {

    /**
     * Checks whether a number is Narcissistic / Armstrong number or not.
     *
     * @param n The integer to be checked. {@code n} must be >= 0.
     * @return {@code true} if the {@code n} is an Armstrong number,
     *         {@code false} otherwise.
     */

    public static boolean isArmstrongNumber(int n) {
        int ndigits = Integer.toString(n).length();
        int sum = 0, x = n;
        while (x > 0) {
            sum += (int) Math.pow(x % 10, ndigits);
            x /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(1634));
        System.out.println(isArmstrongNumber(0));
        System.out.println(isArmstrongNumber(1));
    }

}

package com.algorithms.math;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Exponentiation_by_squaring">
 *      Exponentiation by squaring</a>
 */

public class BinaryExponentiation {

    /**
     * Computes {@code x} raised to power {@code n} using exponentiation by
     * squaring.
     * 
     * @param x The base number.
     * @param n The exponent number. {@code n} must be {@code >= 0}.
     * @return The result of {@code x} raised to power {@code n}.
     */

    public static long power(long x, long n) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }
        return result;
    }

    /**
     * Computes {@code x} raised to power {@code n} modulo {@code m} using
     * exponentiation by squaring.
     * 
     * @param x The base number.
     * @param n The exponent number. {@code n} must be {@code >= 0}.
     * @param m The modulo value. {@code m} must be {@code > 0}.
     * @return The result of {@code x} raised to power {@code n}.
     */

    public static long powerModulo(long x, long n, long m) {
        long result = 1;
        x %= m;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % m;
            }
            x = (x * x) % m;
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(-7746, 3) % 798);
        System.out.println(powerModulo(-7746, 3, 798));
    }

}

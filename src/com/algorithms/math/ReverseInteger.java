package com.algorithms.math;

public class ReverseInteger {

    /**
     * Reverses the digits of an integer.
     * 
     * @param x The integer to be reversed.
     * @return The reversed integer.
     */

    public static int reverseInteger(int x) {
        int reverse = x % 10;
        while ((x /= 10) != 0) {
            reverse = reverse * 10 + x % 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int x = -13;
        System.out.println(reverseInteger(x));
    }

}

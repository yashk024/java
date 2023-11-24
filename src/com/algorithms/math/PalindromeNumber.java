package com.algorithms.math;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Palindromic_number">
 *      Palindromic Number</a>
 */

public class PalindromeNumber {

    /**
     * Checks if an integer is palindrome.
     *
     * @param x The integer to be checked.
     * @return {@code true} if the integer is palindrome, {@code false} otherwise.
     */

    public static boolean isPalindrome(int x) {
        return x >= 0 && x == ReverseInteger.reverseInteger(x);
    }

    public static void main(String[] args) {
        int num = 4576754;
        System.out.println(isPalindrome(num));
    }

}

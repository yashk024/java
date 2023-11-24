package com.algorithms.conversion;

public class DecimalToBinary {

    /**
     * Converts a decimal number to its binary equivalent.
     *
     * @param decimal The decimal number to be converted.
     * @return The binary representation of the input decimal number.
     */

    public static String toBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        do {
            binary.insert(0, decimal & 1);
        } while ((decimal >>>= 1) != 0);
        return binary.toString();
    }

    public static void main(String[] args) {
        int[] decimalNumbers = { -2, 5, 0, 1, 16, 24 };
        for (int decimal : decimalNumbers) {
            System.out.printf("%2d -> %s\n", decimal, toBinary(decimal));
        }
    }

}

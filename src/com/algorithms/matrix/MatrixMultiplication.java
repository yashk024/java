package com.algorithms.matrix;

import java.util.Arrays;

public class MatrixMultiplication {

    /**
     * Multiplies two square matrices.
     *
     * @param matrixA The first matrix, must be a square matrix.
     * @param matrixB The second matrix, must be a square matrix of the same size as
     *                matrixA.
     * @return A new matrix that is the product of matrixA and matrixB.
     */

    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matrixB = {
                { 1, -2, 4 },
                { -3, 5, 6 },
                { 7, 0, 1 }
        };

        System.out.println(Arrays.deepToString(multiply(matrixA, matrixB)));
    }

}

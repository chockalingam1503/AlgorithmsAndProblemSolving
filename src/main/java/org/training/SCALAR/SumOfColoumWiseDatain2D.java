package org.training.SCALAR;

public class SumOfColoumWiseDatain2D {
    public int[] solve(int[][] A) {

        int[] resultArray = new int[A[0].length];
        for (int col = 0; col < A[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < A.length; row++) {
                sum += A[row][col];
            }
            resultArray[col] = sum;
        }

        return resultArray;
    }
}

package org.training.SCALAR;

public class PrintAllSubArraysAndReturn2DArray {

    public static int[][] printSubArrays(int[] arr) {

        int n = arr.length;
        int startIndex;
        int endIndex;
        int size = (n * (n + 1)) / 2;
        int z = 0;
        int[][] result2Darray = new int[size][];
        for (int i = 0; i < arr.length; i++) {
            startIndex = i;
            for (int j = i; j < arr.length; j++) {
                endIndex = j;

                int m = 0;
                int[] subArr = new int[endIndex - startIndex + 1];
                for (int k = startIndex; k <= endIndex; k++) {
                    subArr[m++] = arr[k];
                }
                result2Darray[z++] = subArr;
            }
        }

        return result2Darray;
    }

    public static void main(String[] args) {

        printSubArrays(new int[]{1, 2, 3, 2, 1});
    }
}

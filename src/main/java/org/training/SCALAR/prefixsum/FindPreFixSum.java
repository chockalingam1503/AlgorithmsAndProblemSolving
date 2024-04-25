package org.training.SCALAR.prefixsum;

public class FindPreFixSum {

    static void printSum(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int sum = 0;
            for (int j = left; j <= right; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int [] arr= {7,7,9,9,3,1,5,5,1};

        int  [][] queries =  new int [4][2];
        queries[0][0] = 1;
        queries[0][1] = 4;

        queries[1][0] = 4;
        queries[1][1] = 6;
        queries[2][0] = 2;
        queries[2][1] = 6;
        queries[3][0] = 2;
        queries[3][1] = 7;

        printSum(arr , queries) ;
    }
}

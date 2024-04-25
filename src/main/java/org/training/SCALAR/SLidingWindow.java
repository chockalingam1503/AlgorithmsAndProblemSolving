package org.training.SCALAR;

public class SLidingWindow {
    public static int solve(int[] A, int B, int C) {

        long sum = 0;
        for (int i = 0; i < B ; i++) {
            sum += A[i];
        }


        int i = 1;
        int j = B;

        while (j < A.length) {
            sum = sum - A[i - 1] + A[j];
            if (sum == C) {
                return 1;
            }
            i++;
            j++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve( new int  []{6,7,10,3,10,10,3,10} , 3,23));
    }

}

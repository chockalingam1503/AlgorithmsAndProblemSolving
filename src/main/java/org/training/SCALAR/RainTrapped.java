package org.training.SCALAR;

public class RainTrapped {
    public static int trap(final int[] A) {


        int[] leftMaxArr = new int[A.length];
        int[] rightMaxArr = new int[A.length];

        leftMaxArr[0] = 0;
        rightMaxArr[0] = 0;
        for (int i = 0; i < A.length - 1; i++) {

            if (leftMaxArr[i] > A[i]) {
                leftMaxArr[i + 1] = leftMaxArr[i];
            } else {
                leftMaxArr[i + 1] = A[i];
            }

        }

        for (int i = A.length - 1; i > 1; i--) {

            if (rightMaxArr[i] > A[i]) {
                rightMaxArr[i -1] = rightMaxArr[i];
            } else {
                rightMaxArr[i -1] = A[i];
            }

        }
        int waterTrapped = 0;

        for (int i = 0; i < A.length; i++) {

            if(rightMaxArr[i] >A[i] &&  leftMaxArr[i] >A[i] ) {
                int min = rightMaxArr[i] < leftMaxArr[i] ? rightMaxArr[i] : leftMaxArr[i];

                waterTrapped += (min - A[i]);
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int []{0,1,0,2}));
    }

}

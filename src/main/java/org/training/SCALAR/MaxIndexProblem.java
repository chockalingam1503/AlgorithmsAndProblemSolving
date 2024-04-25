package org.training.SCALAR;

public class MaxIndexProblem {
    public int majorityElement(final int[] A) {

        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }

        int maxIndex = 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {

            if (count > 0) {
                if (A[i] == A[maxIndex]) {
                    count++;
                } else {
                    count--;
                }

            } else {
                maxIndex = i;
                count++;
            }
        }

        int countOfMaxIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[maxIndex]) {
                countOfMaxIndex++;
            }
        }

        if (countOfMaxIndex > (A.length / 2)) {
            return A[maxIndex];
        } else {
            return -1;
        }
    }

}

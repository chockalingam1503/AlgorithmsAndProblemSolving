package org.training.SCALAR;

public class CountOfPrime {

    public int solve(int A) {
        if (A <= 1) {
            return 0;
        }

        int i = 2;
        int count = 0;
        while (i <= A) {
            if (countFactors(i) == 2) {
                count++;
            }
            i++;
        }
        return count;
    }

    public int countFactors(int A) {

        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (count > 2) {
                return 3;
            }
            if (A % i == 0) {
                if (i == (A / i)) count++;
                else count += 2;
            }
        }
        return count;
    }


}

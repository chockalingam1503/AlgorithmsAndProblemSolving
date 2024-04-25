package org.training.SCALAR;

public class PerfectNumber {
    public static  int solve(int A) {

        if (A == 0 || A == 1) return 0;

        int sum = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {

            if (A % i == 0) {
                if (i == (A / i) || i==1) sum += i;
                else sum = sum + i + (A / i);
            }
        }
        if (sum == A) {
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve(6));
    }
}

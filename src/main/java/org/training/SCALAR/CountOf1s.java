package org.training.SCALAR;

public class CountOf1s {

    public static int solve(int A) {

        int count = 0;

        int i = 0;
        while (i <= 31) {
            if ((A & (1 << i)) !=0) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(6));
    }
}

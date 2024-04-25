package org.training.SCALAR;

public class UnsetIthBit {

    public static int solve(int A, int B) {

        if ((A & (int) (Math.round(Math.pow(2, B)))) >0) {
            Double result = A - Math.pow(2, B);
            return (int) (Math.round(result));
        } else {
            return A;
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(13,2));
    }
}

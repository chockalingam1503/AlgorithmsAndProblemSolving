package org.training.SCALAR.day1;

public class FindFactors {
    public int solve(int A) {
        int count = 0;
        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int solve2(int A) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    count++;
                } else
                    count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindFactors obj = new FindFactors();
        System.out.println(obj.solve2(5));
    }
}

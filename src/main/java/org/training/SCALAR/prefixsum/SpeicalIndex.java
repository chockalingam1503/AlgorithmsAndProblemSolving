package org.training.SCALAR.prefixsum;

import java.util.ArrayList;

public class SpeicalIndex {

    public static int solve(ArrayList<Integer> A) {

        int[] prefixEven = new int[A.size()];
        int[] prefixOdd = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {

            if (i % 2 == 0) {
                if (i == 0) {
                    prefixOdd[i] = 0;
                    prefixEven[i] = A.get(i);
                    continue;
                }
                prefixEven[i] = prefixEven[i - 1] + A.get(i);
                prefixOdd[i] = prefixOdd[i - 1];
            } else {
                prefixOdd[i] = prefixOdd[i - 1] + A.get(i);
                prefixEven[i] = prefixEven[i - 1];
            }

        }
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            int sumOfE = 0;
            int sumOfOdd = 0;

            if (i == 0) {
                sumOfE = prefixOdd[A.size() - 1] - prefixOdd[0];
                sumOfOdd = prefixEven[A.size() - 1] - prefixEven[0];

            } else {
                sumOfE = prefixEven[i - 1] + prefixOdd[A.size() - 1] - prefixOdd[i + 1 - 1];
                sumOfOdd = prefixOdd[i - 1] + prefixEven[A.size() - 1] - prefixEven[i + 1 - 1];

            }
            if (sumOfOdd == sumOfE) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] numArry = {2, 1, 6, 4};
        for (int num : numArry) {
            al.add(num);
        }

        System.out.println(solve(al));
    }


}

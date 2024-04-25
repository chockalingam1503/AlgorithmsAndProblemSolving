package org.training.SCALAR;

import java.util.Arrays;

public class ReturnASubArrayFromBtoC {
    public static int[] solve(int[] A, int B, int C) {

        int[] resultArr = new int[C - B + 1];
        int index = 0;
        for (int i = B; i <= C; i++) {
            resultArr[index++] = A[i];
        }

        return resultArr;
    }

    public static void main(String[] args) {

        int[]   resultArr = solve(new int[]{1, 2, 3, 2, 1}, 3, 4);
        Arrays.stream(resultArr).forEach(a-> System.out.println(a));
    }
}

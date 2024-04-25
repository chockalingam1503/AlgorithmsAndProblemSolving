package org.training.SCALAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CostOfRemoval {
    public static int solve(int[] A) {

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            numList.add(A[i]);
        }

        Collections.sort(numList, Collections.reverseOrder());

        int cost = 0;
        for (int i = 0; i < numList.size(); i++) {
            cost += (i + 1) * numList.get(i);
        }

        return cost;
    }


    public static void main(String[] args) {
        System.out.println(solve(new int[]{8,0,10}));
    }

}

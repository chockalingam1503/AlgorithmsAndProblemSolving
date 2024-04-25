package org.training.SCALAR.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixSumInRange {
        public static  ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

            ArrayList<Long> resultList = new ArrayList<>();

            int [] pfSumArr = new  int [A.size()];

            for (int i = 0; i < A.size(); i++) {

                if (i == 0) {
                    pfSumArr[0] = A.get(0);
                } else {
                    pfSumArr[i] = pfSumArr[i - 1] + A.get(i);
                }

            }

            for (ArrayList<Integer> lst:  B) {
                int left = lst.get(0);
                int right = lst.get(1);

                if (right == 0) {
                    resultList.add((long) pfSumArr[0]);
                } else if(left ==0){
                    resultList.add((long)pfSumArr[right]);
                }else {
                    resultList.add((long) (pfSumArr[right] - pfSumArr[left - 1]));
                }

            }

            return resultList;
        }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] numArry = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        for (int num : numArry) {
            al.add(num);
        }

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a4 = new ArrayList<Integer>();

        a1.add(6);
        a1.add(9);

        a2.add(2);
        a2.add(9);


        a3.add(2);
        a3.add(4);

        a4.add(0);
        a4.add(9);


        ArrayList<ArrayList<Integer>> twoDValues = new ArrayList<>();
        twoDValues.add(a1);
        twoDValues.add(a2);
        twoDValues.add(a3);
        twoDValues.add(a4);

        ArrayList<Long> outputArr = rangeSum(al, twoDValues);

        outputArr.forEach(a-> System.out.println(a));

    }

}

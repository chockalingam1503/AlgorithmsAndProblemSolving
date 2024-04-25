package org.training.SCALAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {


        reverseInRange(A, B , C );



        return A;
    }

    public static void reverseInrange(int[] arr2, int leftIndex, int rightIndex) {
        int i = leftIndex;
        int j = rightIndex;
        int temp;
        while (i <= rightIndex) {
            temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            i++;
            j--;
        }
    }
    public static void reverseInRange(ArrayList<Integer> arrLst, int leftIndex, int rightIndex) {
        int i = leftIndex;
        int j = rightIndex;
        int temp;
        while (i < j) {
            temp = arrLst.get(i);
            arrLst.set(i,arrLst.get(j));
            arrLst.set(j,temp);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(9);
        al.add(3);
        al.add(7);
        ReverseInRange obj = new ReverseInRange();
        System.out.println(obj.solve(al ,1,5));
    }


}

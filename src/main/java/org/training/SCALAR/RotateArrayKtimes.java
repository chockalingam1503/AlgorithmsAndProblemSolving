package org.training.SCALAR;

import java.util.ArrayList;

public class RotateArrayKtimes {


    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        B =   B% A.size();
        reverseInRange(A, 0, A.size() - 1);
        reverseInRange(A, 0, B - 1);
        reverseInRange(A, B, A.size() - 1);

        return A;
    }


    public static void reverseInRange(ArrayList<Integer> arrLst, int leftIndex, int rightIndex) {
        int i = leftIndex;
        int j = rightIndex;
        int temp;
        while (i < j) {
            temp = arrLst.get(i);
            arrLst.set(i, arrLst.get(j));
            arrLst.set(j, temp);
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
        RotateArrayKtimes obj = new RotateArrayKtimes();
        System.out.println(obj.solve(al, 13));
    }
}

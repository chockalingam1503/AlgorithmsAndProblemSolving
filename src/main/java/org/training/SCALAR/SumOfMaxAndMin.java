package org.training.SCALAR;

import java.util.ArrayList;
import java.util.List;

public class SumOfMaxAndMin {
    public int solve(List<Integer> A) {

        int max =A.get(0);
        int min =A.get(0);
        for(int num: A){
            if(num>max){
                max =num;
            }
            if(num<min){
                min =num;
            }
        }

        return max+min;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(7);
        SumOfMaxAndMin obj = new SumOfMaxAndMin();
        System.out.println(obj.solve(al));

    }
}

package org.training.SCALAR;

import java.util.ArrayList;
import java.util.List;

public class TwoSUm {

    public int solve(List<Integer> A, int B) {

        List<Integer> complementArray=new ArrayList<>();
        for (int num : A) {
            if(complementArray.size()==0){
                complementArray.add(B -num);
            }else{
                if(complementArray.contains(num)){
                    return 1 ;
                }else {
                    complementArray.add(B -num);
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(7);
        TwoSUm obj = new TwoSUm();
        System.out.println(obj.solve(al , 10));

    }
}

package org.training.SCALAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxBitWiseAnd {

    public static int solve(int[] A) {



        for(int i =31 ; i>=0 ;i --){
            List<Integer> arrList = new ArrayList<>();

            for (int j = 0; j < A.length; j++) {
                if((A[j] & (1<<i)) > 0){
                    arrList.add(A[j]);
                }
            }
            if(arrList.size()>=2){
                A= new int [arrList.size()];

                int m=0;
                for (int num : arrList){
                    A[m++]  =num;
                }
            }

        }


        return A[0]& A[1] ;
    }



    public static void main(String[] args) {


//        int[] solve = solve(new int[]{1, 1, 4, 2, 2, 6});
//        System.out.println(solve[0]);
//        System.out.println(solve[1]);
        System.out.println( solve(new int[]{256,2,3,4}));


    }

}

package org.training.SCALAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSingleNumbers {

    public static int[] solve(int[] A) {
        int aXorb = 0; // the result of a xor b
        for (int item : A)
            aXorb ^= item;
        int lastBit = (aXorb & (aXorb - 1)) ^ aXorb; // the last bit that a differs from b
        int intA = 0, intB = 0;
        for (int item : A) {
            // based on the last bit, group the items into groupA (include a) and groupB
            if ((item & lastBit) != 0)
                intA = intA ^ item;
            else
                intB = intB ^ item;
        }
        int x = Math.min(intA, intB), y = Math.max(intA, intB);
        int[] ans = new int[2];
        ans[0] = x;
        ans[1] = y;
        return ans;
    }

    public static int[] solve1Missing(int[] A) {


        List<Integer> arrList = new ArrayList<>();
        for(int item : A){
            arrList.add(item);
        }

        for (int i = 1; i <= A.length+2; i++) {
            arrList.add(i);
        }

        int  [] finalArr = new int [arrList.size()];
        int j =0;
        for( int item :arrList){
            finalArr[j++]=item;
        }
        int xOr =0;
        for(int item : finalArr){
            xOr = xOr^item;
        }


        int lastBit = ( xOr & (xOr-1)) ^  xOr;

        int intA=0 ; int intB=0;

        for(int item : finalArr){
            if((item & lastBit) !=0){
                intA=intA^item  ;
            }else
                intB=intB^item  ;
        }

        int [] resArry = new int [2];
        if(intA>intB){
            resArry[0]=intB;
            resArry[1]=intA;
        }else {
            resArry[1]=intB;
            resArry[0]=intA;
        }
        return resArry;

    }

    public static void main(String[] args) {


//        int[] solve = solve(new int[]{1, 1, 4, 2, 2, 6});
//        System.out.println(solve[0]);
//        System.out.println(solve[1]);
        int[] solve1 = solve1Missing(new int[]{1,2,4,5,7,8});
        System.out.println(solve1[0]);
        System.out.println(solve1[1]);

    }

}

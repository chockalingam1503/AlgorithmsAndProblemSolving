package org.training.SCALAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NobelInteger {

    public static int solve(int[] A) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            numList.add(A[i]);
        }

        Collections.sort(numList, Collections.reverseOrder());

        int count =-1;



        boolean previousIsNobelInteger=false;
        for ( int i = 0; i < numList.size(); i++) {
            if(i==numList.get(i)){
                if(i==0 && numList.get(i)==0){
                    count++;
                    continue;
                }

                if(numList.get(i)== numList.get(i-1))
                {
                    if(previousIsNobelInteger){
                        count++;

                    }
                    continue;
                }
                count++;
                previousIsNobelInteger = true;
                continue;
            }
            previousIsNobelInteger=false;
        }

        if(count ==-1){
            return -1;
        }
        return count+1;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-4,-2,0,-1,-6}));
    }


}

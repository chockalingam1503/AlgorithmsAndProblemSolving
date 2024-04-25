package org.training.SCALAR;

public class ContinuosSumFromSubQuery {
    public int[] solve(int A, int[][] B) {

        int [] resultArray = new int [B.length]  ;

        for(int row =0;row<B.length;row++){
            int startIndex =B[row][0];
            int endIndex =B[row][1];
            int value =B[row][2];
            resultArray[startIndex]+=value;
           if(endIndex<resultArray.length-1) {
               resultArray[endIndex + 1] = resultArray[endIndex + 1] - value;
           }
        }

        int sum =0;
        for(int i =0;i<resultArray.length;i++){
            resultArray[i]=sum+resultArray[i];

        }

        return resultArray;
    }

}

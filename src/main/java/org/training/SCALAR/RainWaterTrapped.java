package org.training.SCALAR;

public class RainWaterTrapped {

    public static  int trap(final int[] A) {

        int  leftMaxArr [] = new int [A.length];
        int  rightMaxArr [] = new int [A.length];

        int leftMax =A[0];
        for(int i =0 ;i <A.length ;i++){
            if(i==0){
                leftMaxArr[i]=0;
                continue;
            }
            if(leftMax>A[i]){
                leftMaxArr[i]=leftMax;
            }
            if(A[i]>leftMax)   {
                leftMax=A[i];
            }

        }
        int rightMax =A[A.length-1];
        for(int i =A.length-1 ;i >=0 ;i--){
            if(i==A.length-1){
                rightMaxArr[A.length-1]=0;
                continue;
            }
            if(rightMax>A[i]){
                rightMaxArr[i]=rightMax;
            }
            if(A[i]>rightMax)   {
                rightMax=A[i];
            }

        }

        int total =0;
        for(int i =0 ;i <A.length ;i++){

            int secondHighest= leftMaxArr[i]>rightMaxArr[i]?rightMaxArr[i]:leftMaxArr[i];
            if(secondHighest>A[i])
            total += (secondHighest-A[i]);


        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println( trap(new int[]{0,1,0,2}));
    }
}

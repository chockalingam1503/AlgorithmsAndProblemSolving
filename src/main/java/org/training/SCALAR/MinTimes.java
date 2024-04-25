package org.training.SCALAR;

public class MinTimes {

    public static int solve(int[] A) {

        int sum =0;
        int maxNum =A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>maxNum){
                maxNum =A[i];
            }
            sum+=A[i];
        }
        return (A.length*maxNum - sum);
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 4, 1, 3, 2}));
    }
}

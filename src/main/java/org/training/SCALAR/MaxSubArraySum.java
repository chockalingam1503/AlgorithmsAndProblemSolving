package org.training.SCALAR;

public class MaxSubArraySum {

    public static   long solve(int[] a) {
        long maxSum = Integer.MIN_VALUE;
        long currSum=a[0];


        for(int i=1 ;i<a.length ;i++) {

            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(a[i]>a[i-1]){
                currSum+=a[i];
            }else {
                currSum=a[i];
            }

            if(currSum>maxSum){
                maxSum=currSum;
            }

        }
        return maxSum;
    }


    public static void main(String[] args) {
        System.out.println( solve(new int[]{9,2,4,2}));
    }
}

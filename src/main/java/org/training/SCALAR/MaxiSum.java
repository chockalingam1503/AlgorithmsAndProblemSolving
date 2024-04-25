package org.training.SCALAR;

public class MaxiSum {
    public static int maxSubarray(int A, int B, int[] C) {


        long maxSum=0;
        for (int i = 0; i < A; i++) {
            long sum =0;
            for (int j = i; j < A; j++) {
                sum +=C[j];

                if(sum<=B && sum>maxSum){
                    maxSum=sum;
                }
                if(sum>B){
                    break;
                }
            }
            if(sum<=B && sum>maxSum){
                maxSum=sum;
            }

        }


        return (int )maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarray(9,14, new int  []{1,2,4,4,5,5,5,7,5} ));
    }

}

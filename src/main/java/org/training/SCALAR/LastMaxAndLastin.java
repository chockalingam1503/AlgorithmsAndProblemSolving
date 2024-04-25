package org.training.SCALAR;

public class LastMaxAndLastin {

    public static  int solve(int[] A) {

        int largest=A[0];
        int smallest=A[0];



        for (int num: A) {
            if(num>largest){
                largest=num;
            } else if(num<smallest) {
                smallest=num;
            }
        }

        if(largest==smallest){
            return 1;
        }
    int lengthOfSubArray=Integer.MAX_VALUE;
        int lastMinIndexFound=-1;
        int lastMaxIndexFound=-1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]==largest){
                lastMaxIndexFound=i ;
                if(lastMinIndexFound!=-1){
                    if((lastMaxIndexFound-lastMinIndexFound+1 ) <lengthOfSubArray) {
                        lengthOfSubArray = (lastMaxIndexFound - lastMinIndexFound + 1);
                    }
                }
            } else if (A[i]==smallest) {
                lastMinIndexFound=i;
                if(lastMaxIndexFound!=-1){
                    if((lastMinIndexFound-lastMaxIndexFound+1 ) <lengthOfSubArray) {
                        lengthOfSubArray = (lastMinIndexFound - lastMaxIndexFound + 1);
                    }
                }
            }
        }

        return lengthOfSubArray;
    }

    public static void main(String[] args) {
        int[] arr = {0,7,2,1,6,19};
        System.out.println(solve(arr));
    }

}

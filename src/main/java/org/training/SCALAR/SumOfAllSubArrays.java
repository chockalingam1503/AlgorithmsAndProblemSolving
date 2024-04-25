package org.training.SCALAR;

public class SumOfAllSubArrays {
    public static void printSubArrays(int  [] arr){

        int startIndex;
        int endIndex;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            startIndex=i;
            for (int j = i; j < arr.length ; j++) {
                endIndex=j;

                for (int k = startIndex; k <= endIndex ; k++) {
                    sum +=arr[k];
                }

            }
        }
        System.out.println(sum);
    }
    public static void sumOfAllSubArrays(int  [] arr) {

        int[] pfSumArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                pfSumArr[0] = arr[0];
            } else {
                pfSumArr[i] = pfSumArr[i - 1] + arr[i];
            }

        }


        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {

            int subSum = 0;
            for (int j = i; j < arr.length; j++) {


                if (i != 0) {
                    subSum += (pfSumArr[j] - pfSumArr[i - 1]);
                } else {
                    subSum += (pfSumArr[j]);
                }
            }
            totalsum += subSum;
        }
        System.out.println(totalsum);
    }

    public static void sumOfAllSubArraysUsingCarryFwd(int  [] arr) {




        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {

            int subSum = 0;
            for (int j = i; j < arr.length; j++) {

                subSum+=arr[j];
                totalsum+=subSum;

            }
//            totalsum += subSum;
        }
        System.out.println(totalsum);
    }
    public static void sumOfAllSubArraysOrderOfN(int  [] arr) {

        long totalsum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalsum+=((long)arr[i]*(i+1)*(arr.length-i)) ;
        }
        System.out.println(totalsum);

    }




    public static void main(String[] args) {
        long l = 829496470932889354l;

        sumOfAllSubArraysOrderOfN(new int  []{1,2,3});
    }
}

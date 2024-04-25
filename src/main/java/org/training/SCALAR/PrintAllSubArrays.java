package org.training.SCALAR;

public class PrintAllSubArrays {

    public static void printSubArrays(int  [] arr){

        int startIndex;
        int endIndex;
        for (int i = 0; i < arr.length; i++) {
            startIndex=i;
            for (int j = i; j < arr.length ; j++) {
                endIndex=j;

                for (int k = startIndex; k <= endIndex ; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {

        printSubArrays(new int  []{1,2,3,2,1});
    }
}

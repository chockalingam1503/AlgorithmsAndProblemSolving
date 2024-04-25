package org.training.SCALAR;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static int kthsmallest(final int[] A, int B) {


        for (int i = 0; i < A.length ; i++) {
            int minIndex=i;

            for (int j = i+1; j < A.length; j++) {
                if(A[j]<A[minIndex]){
                    minIndex=j;
                }
            }

            int temp =A[i];
            A[i]=A[minIndex];
            A[minIndex]=temp;

            if(i+1==B){
                return A[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(kthsmallest(new int[]{1,2} ,2));
    }

}

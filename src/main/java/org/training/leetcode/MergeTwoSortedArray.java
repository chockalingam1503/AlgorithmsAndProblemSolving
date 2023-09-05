package org.training.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int [] mergeTwoArray(int [] arr1, int arr2 []) {

        int i =0;
        int k=0;
        int  [] arr3 = new int [arr1.length+arr2.length] ;
        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        i=0;
        while(i<arr2.length){
            arr3[k++]=arr1[i++];
        }
        Arrays.sort(arr3);
        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};


        int arr2[] = {2, 4, 6, 8};

        int[] arr3 = mergeTwoArray(arr1, arr2);

        System.out.println("Array after merging");
        for (int i=0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");

    }

}

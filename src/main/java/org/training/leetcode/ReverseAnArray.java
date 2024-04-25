package org.training.leetcode;

public class ReverseAnArray {

    public static int[] reverse(int[] arr) {
        int j = arr.length - 1;


        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            j--;
        }

        return arr2;
    }

    public static void reverseInrange(int[] arr2, int leftIndex, int rightIndex) {
        int i = leftIndex;
        int j = rightIndex;
        int temp;
        while (i < rightIndex) {
            temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        arr1 = reverse(arr1);
        System.out.println("Array after reversing");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
rotateNTimes(arr1, 2);
reverseInrange(arr1 , 1,2);
    }

    public static void  rotateNTimes(int[] arr, int n){
        int j=1;
        while (j<=n) {
            int temp =arr[arr.length-1];
            for (int i = arr.length-1; i >0 ; i--) {
              arr[i]= arr[i-1];
            }
            arr[0]=temp;
            j++;
        }

    }
}

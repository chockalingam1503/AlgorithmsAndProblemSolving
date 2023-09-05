package org.training.leetcode;

import java.util.Arrays;

public class TwoSUmanotherSolution {

    public static int[] twoSum(int[] nums, int target) {

        int  [] originalArray = new int  [nums.length];
        for (int i = 0; i <nums.length ; i++) {
            originalArray[i]=nums[i];
        }
        Arrays.sort(nums);


        int sumArray[] = new int [2];
        sumArray[0]=-1;
        sumArray[1]=-1;
        int leftIndex =0;
        int rightIndex = nums.length-1;
        while(leftIndex<=rightIndex){

            if(nums[leftIndex]+nums[rightIndex]==target){
                sumArray[0]=nums[leftIndex];
                sumArray[1]=nums[rightIndex];
                break;
            }
            else if(nums[leftIndex]+nums[rightIndex]>target){
                rightIndex--;
            }else{
                leftIndex++;
            }
        }

        if( sumArray[0]>=0 &&  sumArray[1]>=0){
            sumArray[0]= findIndex(originalArray,sumArray[0]);
            sumArray[1]=  findIndex(originalArray,sumArray[1]);

        }

        return sumArray;
    }

    public static int findIndex(int [] numArray , int n){

        for (int i = 0; i < numArray.length; i++) {
            if(n==numArray[i]){
                return i;
            }
        }

        return -1;

    }
}

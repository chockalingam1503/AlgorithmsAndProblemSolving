package org.training.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int returnIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1) {
                if (nums[0] == val) {
                    nums = new int[]{};
                }
             break;
            }

            if (i != nums.length - 1) {
                if (nums[i] == val) {
                    if (nums[i + 1] != val) {
                        int temp = nums[i + 1];
                        nums[i + 1] = val;
                        nums[returnIndex] = temp;
                        returnIndex++;
                    }

                }else {
                    returnIndex++;
                }
            }
        }
        System.out.println("Below is the final array");
        Arrays.stream(nums).forEach(a-> System.out.println(a));
        System.out.println("Below is the return size");
        return returnIndex+1;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2}, 3));
    }

}

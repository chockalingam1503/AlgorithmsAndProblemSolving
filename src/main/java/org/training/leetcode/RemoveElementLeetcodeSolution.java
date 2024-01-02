package org.training.leetcode;

import java.util.Arrays;

public class RemoveElementLeetcodeSolution {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int n = nums[i];
            if (n != val) {
                nums[j++] = n;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,3,4,5,5,3}, 3));
    }

}

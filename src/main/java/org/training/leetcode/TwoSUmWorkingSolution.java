package org.training.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSUmWorkingSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int  []nums = {2,7,11,15};

        int[] res = twoSum(nums, 26);
        System.out.println("result is " + res[0] + " & " +res[1]);
    }

}

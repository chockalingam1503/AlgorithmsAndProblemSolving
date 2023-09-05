/*
package org.training.leetcode;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int resultArray[] = new int[2];
        resultArray[0] = -1;
        resultArray[1] = -1;
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            indexMap.put( i ,nums[i]);
        }



//        for (Map.Entry<Integer, Integer> mp : indexMap.entrySet()) {
//            int num = mp.getKey();
//            int secondNum=target-num;
//            if(valuesSet.contains(secondNum) && ){
//                resultArray[0]=mp.getValue();
//                resultArray[1]=indexMap.get(secondNum);
//                return resultArray;
//            }
//        }

        for (int i = 0; i <nums.length ; i++) {
            int num =nums[i];
            int requiredNum=target-num;
            if(indexMap.containsValue(requiredNum)&& i!=indexMap.get )


        }
        return resultArray;
    }

    public static void main(String[] args) {
        int  []nums = {3,3};

        int[] res = twoSum(nums, 6);
        System.out.println("result is " + res[0] + " & " +res[1]);
    }


}


//problem  statement
    */
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.


        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/


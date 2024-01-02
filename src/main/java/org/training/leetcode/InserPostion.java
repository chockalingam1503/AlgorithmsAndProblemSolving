package org.training.leetcode;

class InserPostion {
    public static int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] nums, int start, int end, int target) {

        if (nums[end] == target) {
            return end;
        }
        if (target > nums[end]) {
            return end + 1;
        }



        if (nums[start] == target) {
            return start;
        }
        if (target < nums[start]) {
            if (start == 0) {
                return 0;
            } else
                return start - 1;
        }
        if(start==0&&end==1 && target<nums[end]){
            return 1;
        }

        if(target < nums[end] && target > nums[start]  && start+1==end){
            return start+1;
        }
        int mid = (end+start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            end = mid;
        } else if (nums[mid] < target) {
            start = mid;
        }

        return search(nums, start, end, target);


    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2,7,8,9,10}, 9));
    }
}
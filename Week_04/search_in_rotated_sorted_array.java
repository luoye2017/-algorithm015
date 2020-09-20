package com.example.leetcode.leetcode;

public class search_in_rotated_sorted_array {

    public int search(int[] nums, int target) {
        if (nums == null) return -1;
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left <= right){
             mid = left + (right - left) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[left] <= nums[mid]){
                if (nums[left] <= target && nums[mid] > target){
                    right = mid -1;
                }else {
                    left = mid + 1;
                }
            }else {
                if (nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }else {
                    right = mid -1;
                }
            }
        }

        return -1;
    }
}

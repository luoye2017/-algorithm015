package com.example.leetcode.leetcode;

public class climbing_stairs {
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n-1];
    }
}

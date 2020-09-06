package com.example.leetcode.leetcode.test;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if (hashMap.containsKey(targetNum) && hashMap.get(targetNum) != i){
                return new int[]{i,hashMap.get(targetNum)};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}

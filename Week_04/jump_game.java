package com.example.leetcode.leetcode;

public class jump_game {
    public boolean canJump(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if ( i > index){
                return false;
            }else {
                if (i + nums[i] > index){
                    index = i + nums[i];
                }
            }
        }
        return true;
    }
}

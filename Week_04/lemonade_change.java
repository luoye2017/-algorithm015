package com.example.leetcode.leetcode;

public class lemonade_change {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; int ten = 0;
        for (int bill : bills) {
            if (bill == 5){
                five++;
            }else if (bill == 10){
                five--;
                ten++;
            }else if (bill == 20){
                if (ten > 0){
                    ten--;
                    five--;
                }else {
                    five = five - 3;
                }
            }
            if ( ten < 0 || five < 0){
                return false;
            }
        }
        return true;
    }
}

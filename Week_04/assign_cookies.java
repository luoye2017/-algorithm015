package com.example.leetcode.leetcode;

import java.util.Arrays;

public class assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int num = 0;
        for (int i = 0,j = 0; i < g.length && j < s.length;) {
            if (s[j] >= g[i]){
                i++;
                j++;
                num++;
            }else{
                j++;
            }
        }

        return num;
    }
}

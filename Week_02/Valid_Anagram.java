package com.example.leetcode.leetcode.test;

import java.util.HashMap;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                hashMap.replace(c, hashMap.get(c) + 1);
            }else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (hashMap.containsKey(c)){
                hashMap.replace(c,hashMap.get(c)-1);
                if (hashMap.get(c) == 0){
                    hashMap.remove(c);
                }
            }else {
                return false;
            }
        }

        if (hashMap.size() == 0){
            return true;
        }
        return false;
    }
}

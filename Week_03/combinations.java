package com.example.leetcode.leetcode.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class combinations {

    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> arrayLists = new ArrayList<>();
        ArrayList list = new ArrayList<>();

        recursion(arrayLists, list, n, k, 0);

        Collections.reverse(arrayLists);

        return arrayLists;
    }

    private void recursion(List<List<Integer>> result, List<Integer> list,int n, int k,int index){
        if (k == list.size() ){
            result.add(list);
            return;
        }
        if (index >= n){
            return;
        }

        index++;
        recursion(result,new ArrayList<>(list),n,k,index);
        list.add(index);
        recursion(result,new ArrayList<>(list),n,k,index);

    }

    public static void main(String[] args) {
        combinations combinations = new combinations();
        List<List<Integer>> combine = combinations.combine(4, 2);
        System.out.println(combine);
    }
}

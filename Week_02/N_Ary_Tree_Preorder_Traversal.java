package com.example.leetcode.leetcode.test;

import java.util.ArrayList;
import java.util.List;

public class N_Ary_Tree_Preorder_Traversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<Integer> preorder(Node root) {
        if (root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(root.val);
        if (root.children !=null){
            for (Node child : root.children) {
                list.addAll(preorder(child));
            }
        }
        return list;
    }
}

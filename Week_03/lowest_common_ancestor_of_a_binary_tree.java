package com.example.leetcode.leetcode.test;

public class lowest_common_ancestor_of_a_binary_tree {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null || root == p || root == q){
          return root;
      }

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null) return rightNode;
        if (rightNode == null) return leftNode;

        return root;
    }

}

package com.problems;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root){
        if(root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }
}

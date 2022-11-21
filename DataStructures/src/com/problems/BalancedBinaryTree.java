package com.problems;

public class BalancedBinaryTree {


    public static boolean isBalancedBottomUpApproach(TreeNode root) {
        if(root == null) return true;
        return height(root) !=-1;
    }

    public static int height1(TreeNode node){
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        int bf = Math.abs(left - right);

        if(bf > 1 || left == -1 || right == -1 ) return -1;
        return 1 + Math.max(left, right);
    }

    public static boolean isBalancedTopDownApproach(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalancedTopDownApproach(root.left) && isBalancedTopDownApproach(root.right);
    }

    public static int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode rightNode) {
        this.val = val;
        this.left = left;
        this.right = rightNode;
    }
}

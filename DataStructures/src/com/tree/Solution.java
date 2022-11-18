package com.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    static List<Integer> result = new ArrayList<>();

    public static void main(String args[]) {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        var result = iterativeInOrderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> iterativeInOrderTraversal(TreeNode root) {
        List<Integer> outputArr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            outputArr.add(current.val);
            current = current.right;
        }
        return outputArr;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return result;
        }

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;
    }
}

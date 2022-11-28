package com.tree;

public class BinaryTreeByArrayMain {

    public static void main(String[] args) {
        int n = 2/3;
        System.out.println(n);
        BinaryTreeByArray binaryTree = new BinaryTreeByArray(9);
        binaryTree.insert(20);
        binaryTree.insert(100);
        binaryTree.insert(3);
        binaryTree.insert(50);
        binaryTree.insert(15);
        binaryTree.insert(250);
        binaryTree.insert(35);
        binaryTree.insert(222);

        binaryTree.deleteNode(50);

        binaryTree.insert(500);
    }

}

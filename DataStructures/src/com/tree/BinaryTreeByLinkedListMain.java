package com.tree;

public class BinaryTreeByLinkedListMain {

    public static void main(String args[]) {
        BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();
        tree.insert(20);
        tree.insert(100);
        tree.insert(3);
        tree.insert(50);
        tree.insert(15);
        tree.insert(250);
        tree.insert(35);

        tree.getDeepestNode();
    }
}

package com.tree.binarysearchtree;

public class BinarySearchTreeByLinkedListMain {

    public static void main(String[] args) {
//        BinaryNode root = new BinaryNode(100);
//        root.setLeft(new BinaryNode(80));
//        root.setRight(new BinaryNode(200));
//        root.getLeft().setLeft(new BinaryNode(70));
//        root.getLeft().setRight(new BinaryNode(90));
//        root.getRight().setLeft(new BinaryNode(150));
//        root.getRight().setRight(new BinaryNode(300));

//        BinaryNode result = new BinarySearchTreeByLinkedList().binarySearchTree(root, 200);
//        System.out.println(result.getLeft());

        BinarySearchTreeByLinkedList bst = new BinarySearchTreeByLinkedList();
        bst.insert(100);
        bst.insert(80);
        bst.insert(200);
        bst.insert(70);
        bst.insert(90);
        bst.insert(150);
        bst.insert(300);
        bst.insert(160);
        bst.insert(155);
        bst.insert(170);

        bst.deleteNodeOfBST(100);


    }
}

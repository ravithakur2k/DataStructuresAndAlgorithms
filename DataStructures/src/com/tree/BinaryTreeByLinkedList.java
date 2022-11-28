package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {

    BinaryNode root;

    public BinaryTreeByLinkedList() {
        root = null;
    }

    void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            System.out.println("Successfully inserted new node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setRight(node);
                break;
            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value) {
                System.out.println("Value found");
                return;
            } else {
                if (presentNode.getLeft() != null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Value not found");
    }

    void deleteNodeOfBinaryTree(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value) {
                presentNode.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("Deleted the node");
            } else {
                if (presentNode.getLeft() != null) queue.add(presentNode.getLeft());
                if (presentNode.getRight() != null) queue.add(presentNode.getRight());
            }
        }
        System.out.println("Value not found to be deleted");
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if (presentNode.getRight() == null) {
                previousNode.setLeft(null);
                return;
            }
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }
    }

    BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        return presentNode;
    }

    // pre-order traversal of binary tree
    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }//end of method


    // post-order traversal of binary tree
    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + " ");
    }//end of method


    // in-order traversal of binary tree
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRight());
    }//end of method

}

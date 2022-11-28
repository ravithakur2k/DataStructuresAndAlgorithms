package com.tree.binarysearchtree;

import com.tree.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {

    BinaryNode root;

    public BinaryNode getRoot() {
        return root;
    }

    public BinarySearchTreeByLinkedList() {
        root = null;
    }

    void insert(int value) {
        root = insert(root, value);
    }


    BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            currentNode = new BinaryNode(value);
        } else if (value < currentNode.getValue()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
        }
        return currentNode;
    }
    // Deleting a node from BST
    public void deleteNodeOfBST(int value) {
        System.out.println("\n\nDeleting " + value + " from BST...");
        deleteNode(root,value);
    }

    BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.getValue()) {
            root.setLeft(deleteNode(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(deleteNode(root.getRight(), value));
        } else {
            if (root.getLeft() != null && root.getRight() != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumElement(temp.getRight());
                root.setValue(minNodeForRight.getValue());
                root.setRight(deleteNode(root.getRight(), minNodeForRight.getValue()));
            } else if (root.getLeft() != null) {
                root = root.getLeft();
            } else if (root.getRight() != null) {
                root = root.getRight();
            } else {
                root = null;
            }
        }
        return root;
    }

    public BinaryNode minimumElement(BinaryNode node) {
        if (node.getLeft() == null) {
            return node;
        } else {
            return minimumElement(node.getLeft());
        }
    }

    public BinaryNode binarySearchTree(BinaryNode root, int value) {
        if (root == null) {
            return null;
        } else if (root.getValue() == value) {
            return root;
        } else if (value < root.getValue()) {
            return binarySearchTree(root.getLeft(), value);
        } else {
            return binarySearchTree(root.getRight(), value);
        }
    }

    public void inOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.getLeft());
            System.out.println("print the value" + root.getValue());
            inOrderTraversal(root.getRight());
        }
    }

    public void preOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println("Print the value" + root.getValue());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    public void postOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println("Print the value" + root.getValue());
        }
    }

    public void levelOrderTraversal(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            System.out.println(node.getValue());
            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
        }
    }

    void printTreeGraphically() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        Queue<Integer> level = new LinkedList<Integer>();

        int CurrentLevel = 1;
        boolean previousLevelWasAllNull = false;
        queue.add(root);
        level.add(1);

        System.out.println("\nPrinting Level order traversal of Tree...");
        if(root == null) {
            System.out.println("Tree does not exists !");
            return;
        }

        while (!queue.isEmpty()) {
            if(CurrentLevel == level.peek()) { //if we are in the same level
                if(queue.peek()==null) {
                    queue.add(null);level.add(CurrentLevel+1);
                }else {
                    queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
                    queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
                    previousLevelWasAllNull = false;
                }
                System.out.print(queue.remove().getValue() + "  ");level.remove();
            }else { //level has changed
                System.out.println("\n");
                CurrentLevel++;
                if(previousLevelWasAllNull == true) {
                    break;
                }
                previousLevelWasAllNull = true;
            }
        }//end of loop
    }//end of method
}

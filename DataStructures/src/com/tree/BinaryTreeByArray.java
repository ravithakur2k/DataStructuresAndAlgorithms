package com.tree;

public class BinaryTreeByArray {

    int[] arr;
    int lastUsedIndex;

    public BinaryTreeByArray(int size) {
        arr = new int[size+1];
        lastUsedIndex = 0;
    }

    private boolean isTreeFull() {
        if (lastUsedIndex == arr.length-1) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int value) {
        if (isTreeFull()) {
            System.out.println("Tree is full");
        } else {
            arr[++lastUsedIndex] = value;
            //lastUsedIndex++;
        }
    }

    public void search(int value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println("Value found");
            } else {
                System.out.println("Value not found");
            }
        }
    }

    public void inOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            inOrderTraversal(index * 2);
            System.out.println(arr[index] + " ");
            inOrderTraversal(index * 2 + 1);
        }
    }

    public void preOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            System.out.println(arr[index] + " ");
            preOrderTraversal(index * 2);
            preOrderTraversal(index * 2 + 1);
        }
    }

    public void postOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            postOrderTraversal(index * 2);
            postOrderTraversal(index * 2 + 1);
            System.out.println(arr[index] + " ");
        }
    }

    public void deleteNode(int value){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == value){
                arr[i] = arr[lastUsedIndex];
                lastUsedIndex--;
                return;
            }
        }
        System.out.println("Value not found to be deleted");
    }


}

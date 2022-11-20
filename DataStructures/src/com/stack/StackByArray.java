package com.stack;

public class StackByArray {
    int topOfStack = -1;
    int[] stackArr;

    public StackByArray(int size) {
        stackArr = new int[size];
    }

    void push(int value) {
        if (topOfStack == stackArr.length-1) {
            System.out.println("Stack is full");
            return;
        } else {
            topOfStack++;
            stackArr[topOfStack] = value;
        }
    }

    int pop() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stackArr[topOfStack];
            topOfStack--;
            return value;
        }
    }

    int peek() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArr[topOfStack];
        }
    }

    boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (topOfStack == stackArr.length) {
            return true;
        } else {
            return false;
        }
    }

}

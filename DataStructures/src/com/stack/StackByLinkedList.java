package com.stack;

import com.linkedlist.SingleLinkedList;

public class StackByLinkedList {

    SingleLinkedList list;

    StackByLinkedList() {
        list = new SingleLinkedList();
    }

    void push(int value) {
        if (list.getHead() == null) {
            list.createSingleLinkedList(value);
        } else {
            list.insertLinkedList(value, 0);
        }
    }

    int pop() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Stack underflow error");
        } else {
            value = list.getHead().getValue();
            list.deletionOfNode(0);
        }
        return value;
    }

    int peek() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Stack underflow error");
        } else {
            value = list.getHead().getValue();
        }
        return value;
    }

    public boolean isEmpty() {
        if (list.getHead() == null)
            return true;
        else
            return false;
    }// end of method

    public void deleteStack() {
        list.setHead(null);
    }

}

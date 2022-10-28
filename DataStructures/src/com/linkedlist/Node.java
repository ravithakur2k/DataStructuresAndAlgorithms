package com.linkedlist;

public class Node {

    int value;
    Node next;

    public Node(){

    }

    public Node(int val) {
        this.value = val;
    }

    public Node(int val, Node nextNode) {
        this.value = val;
        this.next = nextNode;
    }
}

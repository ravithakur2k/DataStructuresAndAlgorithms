package com.linkedlist;

public class SingleNode {

    int value;
    SingleNode next;

    public SingleNode(){}

    public SingleNode(int val) {
        this.value = val;
    }

    public SingleNode(int val, SingleNode nextSingleNode) {
        this.value = val;
        this.next = nextSingleNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "value=" + value +
                '}';
    }
}

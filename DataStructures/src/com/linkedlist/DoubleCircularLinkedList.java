package com.linkedlist;

public class DoubleCircularLinkedList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    DoubleNode createDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        head = tail = node;
        node.setPrev(node);
        node.setNext(node);
        size = 1;
        return head;
    }

    void insertIntoDoubleLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        if (location == 0) {
            head.setPrev(node);
            tail.setNext(node);
            node.setNext(head);
            node.setPrev(tail);
            head = node;
        } else if (location >= getSize()) {
            head.setPrev(node);
            tail.setNext(node);
            node.setPrev(tail);
            node.setNext(head);
            tail = node;
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.getNext().setPrev(node);
            tempNode.setNext(node);
        }
        size++;
    }

    void deletionOfNode(int location) {
        if (location == 0) {
            head.getNext().setPrev(tail);
            head = head.getNext();
            tail.setNext(head);
        } else if (location >= getSize()) {
            DoubleNode temp = tail.getPrev();
            temp.setNext(head);
            head.setPrev(temp);
            tail = temp;
        } else {
            DoubleNode temp = head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.getNext();
            }
            temp.getNext().getNext().setPrev(temp);
            temp.setNext(temp.getNext().getNext());
        }
        setSize(getSize() - 1);
    }

}

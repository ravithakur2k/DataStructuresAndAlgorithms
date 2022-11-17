package com.linkedlist;

public class SingleCircularLinkedList {

    SingleNode head;
    SingleNode tail;
    private int size;

    SingleNode createSingleLinkedList(int nodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        head = node;
        tail = node;
        node.setNext(node);
        size = 1;
        return head;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertIntoCircularLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if (location == 0) {
            node.setNext(head);
            head = node;
            tail.setNext(node);
        } else if (location >= size) {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        } else {
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
    }

    public void deletionFromCircularLinkedList(int location) {
        if (location == 0) {
            head = head.getNext();
            tail.setNext(head);
            setSize(getSize() - 1);
            if (getSize() == 0) {
                tail = null;
            }
        } else if (location >= getSize()) {
            SingleNode tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                setSize(getSize() - 1);
                return;
            }
            tail = tempNode;
            tail.setNext(head);
            setSize(getSize() - 1);
        } else {
            SingleNode temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            setSize(getSize() - 1);
        }
    }

}

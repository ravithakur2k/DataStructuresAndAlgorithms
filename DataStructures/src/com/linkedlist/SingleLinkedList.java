package com.linkedlist;

public class SingleLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode createSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
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

    public void insertLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if (!existsLinkedList()) {
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            tail.setNext(node);
            node.setNext(null);
            tail = node;

        } else {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            SingleNode nextNode = tempNode.getNext();
            node.setNext(nextNode);
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }

    public boolean existsLinkedList() {
        // if head is not null retrun true otherwise return false
        return head != null;
    }

    void traverseLinkedList() {
        if (existsLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.println(tempNode.getValue());
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked list does not exists");
        }
    }

    public void deletionOfNode(int location) {
        if (location == 0) {
            head = head.getNext();
            setSize(getSize() - 1);
            if (getSize() == 0) {
                tail = null;
            }
        } else if (location >= getSize()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize() - 1; i++) {
                tempNode = tempNode.getNext();
            }
            if (tempNode == head) {
                head = tail = tempNode;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize() - 1);
        } else {
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize() - 1);
        }
    }
}

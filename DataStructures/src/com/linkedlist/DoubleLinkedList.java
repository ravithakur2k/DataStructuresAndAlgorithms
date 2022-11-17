package com.linkedlist;

public class DoubleLinkedList {

    DoubleNode head;
    DoubleNode tail;
    int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    DoubleNode createDoubleLinkedList(int nodeValue) {
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        node.setPrev(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    void insertLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        if (location == 0) {
            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        } else if (location >= size) {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            node.setNext(null);
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.getNext().setPrev(node);
            node.setPrev(tempNode);
            tempNode.setNext(node);
        }
        size++;
    }

    public void deletionOfNode(int location) {
        if(location == 0){
            if(getSize() == 1){
                tail = head = null;
                setSize(getSize() - 1);
            }
            head = head.getNext();
            head.setPrev(null);
            setSize(getSize() - 1);
        } else if(location >= getSize()){
            DoubleNode tempNode = tail.getPrev();
            if(tempNode == head){
                head = tail = null;
                setSize(getSize() - 1);
                return;
            }
            tail = tempNode;
            tail.setNext(null);
            setSize(getSize() - 1);
        } else {
            DoubleNode tempNode = head;
            for(int i = 0 ; i < location - 1; i++){
                tempNode = tempNode.getNext();
            }
            if(tempNode == head){
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize()-1);
        }

    }
}
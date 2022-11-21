package com.queue;

import com.linkedlist.SingleLinkedList;

public class QueueByLinkedList {

    SingleLinkedList list;

    public QueueByLinkedList() {
        list = new SingleLinkedList();
    }

    public void enQueue(int value) {
        if (list.getHead() == null) {
            list.createSingleLinkedList(value);
        } else {
            list.insertLinkedList(value, list.getSize());
        }
    }

    public int deQueue() {
        int value = -1;
        if (list.getHead() == null) {
            System.out.println("Queue is empty");
        } else {
            value = list.getHead().getValue();
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        if (list.getHead() == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return list.getHead().getValue();
        }
    }

    public void deleteQueue() {
        list.setHead(null);
    }


}

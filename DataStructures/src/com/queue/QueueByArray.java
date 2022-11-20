package com.queue;

public class QueueByArray {

    private int[] queue;
    private int beginningOfQueue;
    private int topOfQueue;

    public void createQueue(int size) {
        queue = new int[size];
        beginningOfQueue = 0;
        topOfQueue = 0;
    }

    public void enQueue(int value) {
        if (!isFull()) {
            queue[topOfQueue] = value;
            topOfQueue++;
        }
    }

    public int deQueue() {
        int value = queue[beginningOfQueue];
        beginningOfQueue++;
        if(beginningOfQueue > topOfQueue){
            beginningOfQueue = topOfQueue = 0;
        }
        return value;
    }

    public boolean isFull() {
        if (topOfQueue == queue.length) {
            return true;
        } else {
            return false;
        }
    }

}

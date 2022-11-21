package com.queue;

public class CircularQueueByArray {

    int beginningOfQueue;
    int topOfQueue;
    int[] arr;

    public CircularQueueByArray(int size) {
        arr = new int[size];
        beginningOfQueue = -1;
        topOfQueue = -1;
    }

    public void enQueue(int value) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else if (topOfQueue + 1 == arr.length) {
            topOfQueue = 0;
        } else {
            topOfQueue++;
        }
        arr[topOfQueue] = value;
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty, nothing to dequeue");
        } else {
            initializeBeginningOfQueue();
            System.out.println("value -- " + arr[beginningOfQueue]);
            if (beginningOfQueue + 1 == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == arr.length) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
        }
    }

    private void initializeBeginningOfQueue(){
        if(beginningOfQueue == -1){
            beginningOfQueue = 0;
        }
    }

    private boolean isQueueEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isQueueFull() {
        if (beginningOfQueue  == 0 && topOfQueue + 1 == arr.length) {
            return true;
        } else if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else {
            return false;
        }
    }

    public void peekOperation() {
        //if stack is not empty, return the value on top of stack
        if (!isQueueEmpty()) {
            System.out.println("\nPeeking value from queue...");
            System.out.println(arr[beginningOfQueue]);
        } else {
            System.out.println("The queue is empty!!");
        }
    }//end of method


    public void deleteStack() {
        System.out.println("\n\nDeleting the entire Queue...");
        arr = null;
        System.out.println("Queue is successfully deleted !");
    }//end of method


    //Print entire array
    public void printArray() {
        System.out.println("Array now...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nStart = " + beginningOfQueue);
        System.out.println("End = " + topOfQueue);
    }//end of method


}

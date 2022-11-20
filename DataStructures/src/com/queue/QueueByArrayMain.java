package com.queue;

public class QueueByArrayMain {

    public static void main(String[] args) {
        QueueByArray queue = new QueueByArray();
        queue.createQueue(10);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        System.out.println(queue.deQueue());

        System.out.println(queue.deQueue());

        queue.enQueue(50);
        queue.enQueue(60);

        System.out.println(queue.deQueue());

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}

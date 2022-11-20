package com.stack;

public class StackByLinkedListMain {
    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList();

        stack.push(10);
        stack.push(14);
        stack.push(34);
        stack.push(45);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}

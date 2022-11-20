package com.stack;

public class StackByArrayMain {

    public static void main(String args[]){
        StackByArray stack = new StackByArray(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(25);
        stack.push(40);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}

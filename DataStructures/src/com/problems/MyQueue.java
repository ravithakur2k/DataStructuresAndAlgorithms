package com.problems;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }

    public void push(int x) {
        mainS.push(x);
    }

    public int pop() {
        while(mainS.size() !=1) helperS.push(mainS.pop());// Until the size is one keep poping from main. Once we have only one size then return that.
        int rem = mainS.pop(); // When size is one.
        while(!helperS.isEmpty()) mainS.push(helperS.pop()); // Put the data from helper stack back to main stack.
        return rem;
    }

    public int peek() {
        while(mainS.size() !=1) helperS.push(mainS.pop());
        int rem = mainS.peek();
        while(!helperS.isEmpty()) mainS.push(helperS.pop());
        return rem;
    }

    public boolean empty() {
        return mainS.size() == 0;
    }
}

package com.problems;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String args[]){
        System.out.println(isValid("{([])}"));
    }

    public static boolean isValid(String s){

        if(s.length() % 2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c =='(' || c=='{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                if((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || c == ']' && stack.peek() == '[' ){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}

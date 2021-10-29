package com.sliconspectra.collectiontopic;

import java.util.Stack;

public class StackTopic {
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

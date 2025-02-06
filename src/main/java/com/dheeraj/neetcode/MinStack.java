package com.dheeraj.neetcode;

import java.util.Map;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(
                Math.min(
                      val,
                      minStack.empty() ? val : minStack.peek()
                )
        );
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(25);
        minStack.push(15);
        System.out.println(minStack.getMin());
        minStack.push(10);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
    }
}

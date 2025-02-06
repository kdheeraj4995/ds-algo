package com.dheeraj.neetcode;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens) {
                switch (i) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        int c = stack.pop();
                        int d = stack.pop();
                        stack.push(d / c);
                        break;
                    default:
                        stack.push(Integer.parseInt(i));
                }
            }
        return stack.pop();
    }

    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
//        String[] tokens = {"2", "1", "+", "3", "*"};
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(reversePolishNotation.evalRPN(tokens));
    }
}

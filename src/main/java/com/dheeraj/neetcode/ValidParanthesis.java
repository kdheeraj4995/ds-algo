package com.dheeraj.neetcode;


import java.util.HashMap;
import java.util.Map;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Map<Character, Character> paranthesisMap = new HashMap<>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (paranthesisMap.containsValue(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != paranthesisMap.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        System.out.println(validParanthesis.isValid("()("));
    }
}

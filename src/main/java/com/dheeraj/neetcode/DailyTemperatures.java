package com.dheeraj.neetcode;

import java.util.Map;
import java.util.Stack;

// https://neetcode.io/problems/daily-temperatures
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek().getValue() < temperatures[i]) {
                Map.Entry<Integer, Integer> entry = stack.pop();
                result[entry.getKey()] = i - entry.getKey();
            }
            stack.push(Map.entry(i, temperatures[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        DailyTemperatures temperatures = new DailyTemperatures();
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = temperatures.dailyTemperatures(temp);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

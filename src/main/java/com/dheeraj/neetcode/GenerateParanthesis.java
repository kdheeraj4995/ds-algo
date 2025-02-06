package com.dheeraj.neetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result, new StringBuilder(),0, 0, n);
        return result;
    }

    public void generateParenthesis(List<String> result, StringBuilder current, int openCount, int closeCount, int maxCount){
        if (openCount == maxCount && closeCount == maxCount) {
            result.add(current.toString());
        }

        if (openCount < maxCount) {
            current.append("(");
            generateParenthesis(result, current, openCount + 1, closeCount, maxCount);
            current.deleteCharAt(current.length() - 1);
        }

        if (closeCount < openCount) {
            current.append(")");
            generateParenthesis(result, current, openCount, closeCount + 1, maxCount);
            current.deleteCharAt(current.length() - 1);
        }

    }

    public static void main(String[] args) {
        GenerateParanthesis generateParanthesis = new GenerateParanthesis();
        List<String> result = generateParanthesis.generateParenthesis(3);
        System.out.println(result);
    }
}

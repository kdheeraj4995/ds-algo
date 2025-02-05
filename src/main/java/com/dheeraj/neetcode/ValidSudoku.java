package com.dheeraj.neetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                String boxIndex = (i / 3) + "" + (j / 3);
                Set<Character> tempRow = rows.getOrDefault(i, new java.util.HashSet<>());
                Set<Character> tempColumn = columns.getOrDefault(j, new java.util.HashSet<>());
                Set<Character> tempBox = boxes.getOrDefault(boxIndex, new java.util.HashSet<>());
                char c = board[i][j];
                boolean rowItemAdded = c == '.' || tempRow.add(board[i][j]);
                boolean columnItemAdded = c == '.' || tempColumn.add(board[i][j]);
                boolean boxItemAdded = c == '.' || tempBox.add(board[i][j]);
                if (!rowItemAdded || !columnItemAdded || !boxItemAdded) {
                    return false;
                }
                rows.put(i, tempRow);
                columns.put(j, tempColumn);
                boxes.put(boxIndex, tempBox);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] input = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '4', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '.', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(input));
    }
}

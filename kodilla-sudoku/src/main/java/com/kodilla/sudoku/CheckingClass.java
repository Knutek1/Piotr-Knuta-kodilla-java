package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class CheckingClass {
    private int x = 11;
    private int y = 19;
    private int i;
    private int j;
    List<Character> possibleValues = new ArrayList<>();

    public char[][] checkByRows(char[][] board){
        for (i = 0; i < x; i++) {
            for (SudokuElement s : SudokuElement.values()) {
                for (j = 1; j < y; j=j+2) {
                    if (board[i][j] == s.getValue()) {
                        break;
                    } else if (board[i][j] == ' ') {
                        possibleValues.add(s.getValue());
                    }
                }
                if (possibleValues.size() == 1) {
                    board[i][j] = s.getValue();
                }

                possibleValues.clear();
            }
        }
        return board;
    }
    public char[][] checkByColumns(char[][] board){
        for (j = 1; j < y; j=j+2) {
            for (SudokuElement s : SudokuElement.values()) {
                for (i = 0; i < x; i++) {
                    if (board[i][j] == s.getValue()) {
                        break;
                    } else if (board[i][j] == ' ') {
                        possibleValues.add(s.getValue());
                    }
                }
                if (possibleValues.size() == 1) {
                    board[i][j] = s.getValue();
                }
                possibleValues.clear();
            }
        }
        return board;
    }
    public char[][] checkBySquares(char[][] board){
        int startI = 0;

        for (SudokuElement s : SudokuElement.values()) {
            int startJ = 1;
            for (i = startI; i < startI + 3; i++) {
                for (j = startJ; j < startJ + 5; j = j + 2) {
                    if (board[i][j] == s.getValue()) {
                        break;
                    } else if (board[i][j] == ' ') {
                        possibleValues.add(s.getValue());
                    }
                }
                startJ = startJ + 6;
            }
            startI = startI + 4;
            if (possibleValues.size() == 1) {
                board[i][j] = s.getValue();
            }
            possibleValues.clear();
            if (startI == 12)
                break;
        }
        return board;
    }
}

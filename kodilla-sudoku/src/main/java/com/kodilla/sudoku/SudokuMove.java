package com.kodilla.sudoku;

public class SudokuMove {
    int x;
    int y;
    char value;

    public SudokuMove(int x, int y, char value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getValue() {
        return value;
    }
}

package com.kodilla.sudoku;

public class AdressForGuessingValue {
    private char[][] board;
    private int row;
    private int col;


    public AdressForGuessingValue(char[][] board, int row, int col) {
        this.board = board;
        this.row = row;
        this.col = col;
    }

    public char[][] getBoard() {
        return board;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}

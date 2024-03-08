package com.kodilla.sudoku;

public class SudokuBoard {
    private final int x = 11;
    private final int y = 19;
    private final char[][] board = new char[x][y];
    public char [][] emptyBoard() {
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j=j+2) {
                board[i][j] =  '|';
            }
            for(int j=1; j<y; j=j+2) {
                board[i][j] = ' ';
            }
        }
        for(int i=3; i<x; i=i+4) {
            for (int j=0; j<y; j++) {
                board[i][j] = '-';
            }

        }
       return board;
    }

    public char[][] insertToBoard(SudokuMove sudokuMove) {
        board[sudokuMove.getX()][sudokuMove.getY()] = sudokuMove.getValue();
        return board;
    }

    public char[][] getBoard() {
        return board;
    }
}

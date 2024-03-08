package com.kodilla.sudoku;


public class SolveLogic {
    AdressForGuessingValue adressForGuessingValue;
    private int x = 11;
    private int y = 19;

    public char[][] solve(char[][] board) {
        int counter;
        CheckingClass checkingClass = new CheckingClass();

        do {
            counter = 0;
            char[][] board1 = checkingClass.checkByRows(board);
            char[][] board2 = checkingClass.checkByColumns(board1);
            board = checkingClass.checkBySquares(board2);


            if (board == board1 && board == board2) {
                //Zgadywanie które nie wychodzi
                adressForGuessingValue = adressForGuessingValue(board);
                for (int l = 0; l<SudokuElement.values().length; l++){

                    board[adressForGuessingValue.getRow()][adressForGuessingValue.getCol()] = SudokuElement.values()[l].getValue();
                    for(int i=0; i<x; i++){
                        if(board[i][adressForGuessingValue.getCol()] == SudokuElement.values()[l].getValue() && i!= adressForGuessingValue.getRow()){
                            board = adressForGuessingValue.getBoard();
                            break;
                        }
                    }
                    for(int j=1; j<x; j=j+2){
                        if(board[adressForGuessingValue.getRow()][j] == SudokuElement.values()[l].getValue() && j!= adressForGuessingValue.getCol()){
                            board = adressForGuessingValue.getBoard();
                            break;
                        }
                    }

                    board1 = checkingClass.checkByRows(board);
                    board2 = checkingClass.checkByColumns(board1);
                    board = checkingClass.checkBySquares(board2);
                }

            }


            for (int i = 0; i < x; i++) {
                for (int j = 1; j < y; j = j + 2) {
                    if (board[i][j] == ' ')
                        counter++;
                }
            }
        } while (counter != 0);
        return board;
    }


    public AdressForGuessingValue adressForGuessingValue(char[][] board) {


        for (int i = 0; i < x; i++) {
            for (int j = 1; j < y; j = j + 2) {
                if (board[i][j] == ' ') {
                        return new AdressForGuessingValue(board, i, j);
                }
            }
        }
        return null;
    }
}


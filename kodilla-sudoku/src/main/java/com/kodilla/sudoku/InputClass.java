package com.kodilla.sudoku;

import java.util.Scanner;

public class InputClass {

    int xPosition;
    int yPosition;
    char sudokuValue;
    int numberOfValues;
    boolean flag;
    char board[][];
    SudokuBoard sudokuBoard = new SudokuBoard();

    public char[][] setValuesIntoBoard() {
        System.out.println("How many values you want to put into the board?");
        do {
            try {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    numberOfValues = sc1.nextInt();
                } while (numberOfValues > 81);
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter only integer value");
                flag = true;
            }
        }
        while (flag);

        sudokuBoard.emptyBoard();

        for (int i = 0; i < numberOfValues; i++) {
            SudokuMove sudokuMove = move();
            board = sudokuBoard.getBoard();
            if (board[sudokuMove.getX()][sudokuMove.getY()] == ' ') {
                sudokuBoard.insertToBoard(sudokuMove);
            }
            else {
                System.out.println("This field is occupied, please put value into another");
                i--;
            }
            VisualLayer.printBoard(sudokuBoard.getBoard());
        }
        return sudokuBoard.getBoard();
    }

    public SudokuMove move() {

        System.out.println("Please enter number of row");
        do {
            try {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter only values from 1 to 9");
                    xPosition = sc1.nextInt();
                } while (xPosition < 1 || xPosition > 9);
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter only integer value");
                flag = true;
            }
        }
        while (flag);

        System.out.println("Please enter number of column");
        do {
            try {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter only values from 1 to 9");
                    yPosition = sc1.nextInt();
                } while (yPosition < 1 || yPosition > 9);
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter only integer value");
                flag = true;
            }
        }
        while (flag);

        System.out.println("Please enter the sudoku value");
        do {
            try {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter only values from 1 to 9");
                    sudokuValue = sc1.next().charAt(0);
                } while (sudokuValue != SudokuElement.correctValue(sudokuValue));
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter only integer value");
                flag = true;
            }
        }
        while (flag);
        if (xPosition <= 3)
            return new SudokuMove(xPosition - 1, 2 * yPosition - 1, sudokuValue);
        else if (xPosition <= 6)
            return new SudokuMove(xPosition, 2 * yPosition - 1, sudokuValue);
        else
            return new SudokuMove(xPosition + 1, 2 * yPosition - 1, sudokuValue);


    }

    public char[][] tabelaDoCwiczen(){
        char[][] exerciseBoard={
                {'|', '5', '|', '3', '|', ' ', '|', ' ', '|', '7', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', '6', '|', ' ', '|', ' ', '|', '1', '|', '9', '|', '5', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'|', ' ', '|', '9', '|', '8', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'|', '8', '|', ' ', '|', ' ', '|', ' ', '|', '6', '|', ' ', '|', ' ', '|', ' ', '|', '3', '|'},
                {'|', '4', '|', ' ', '|', ' ', '|', '8', '|', ' ', '|', '3', '|', ' ', '|', ' ', '|', '1', '|'},
                {'|', '7', '|', ' ', '|', ' ', '|', ' ', '|', '2', '|', ' ', '|', ' ', '|', ' ', '|', '6', '|'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'|', ' ', '|', '6', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', '2', '|', '8', '|', ' ', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', '4', '|', '1', '|', '9', '|', ' ', '|', ' ', '|', '5', '|'},
                {'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', '8', '|', ' ', '|', ' ', '|', '7', '|', '9', '|'}
        };
        return exerciseBoard;
    }
}

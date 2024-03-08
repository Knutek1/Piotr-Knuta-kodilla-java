package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        InputClass inputClass = new InputClass();
        VisualLayer.printBoard(sudokuBoard.emptyBoard());
        //inputClass.setValuesIntoBoard();
        SolveLogic solveLogic = new SolveLogic();
        VisualLayer.printBoard(solveLogic.solve(inputClass.tabelaDoCwiczen()));
    }
}

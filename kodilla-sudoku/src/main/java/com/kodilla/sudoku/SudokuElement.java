package com.kodilla.sudoku;

public enum SudokuElement {
    ONE('1'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9');
    private final char value;

    SudokuElement(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static char correctValue(char inputValue) {
        for (SudokuElement sudokuElement : values()) {
            if (sudokuElement.getValue() == inputValue) {
                return sudokuElement.getValue();
            }
        }
        throw new IllegalArgumentException("Illegal argument, please enter another");
    }
}

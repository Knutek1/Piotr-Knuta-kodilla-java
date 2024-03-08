package com.kodilla.sudoku;

public class VisualLayer {

    public static void printBoard(char[][] board) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("  ");
        for (int j = 1; j < 10; j++) {
            sb1.append(" ").append(j);
        }
        System.out.println(sb1);

        for (int i = 0; i < 11; i++) {
            StringBuilder sb = new StringBuilder();
            if (i < 3)
                sb.append(i + 1).append(".");
            if (3 < i && i < 7)
                sb.append(i).append(".");
            if (i > 7) {
                sb.append(i - 1).append(".");
            }
            if (i==3 || i== 7){
                sb.append("  ");
            }
                for (int j = 0; j < 19; j++) {
                    sb.append(board[i][j]);
                }
            System.out.println(sb);
        }
    }
}

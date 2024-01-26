package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        char c;
        while (!end) {
            Game game = new Game();
            game.game();
            do {
                System.out.println("Do you want to play another game (press 'n') or exit (press 'x')");
                Scanner sc1 = new Scanner(System.in);
                c = sc1.next().charAt(0);
                if (c != 'x' && c != 'n')
                    System.out.println("Please enter only x or n");
            } while (c != 'x' && c != 'n');

            if (c == 'x') {
                end = true;
            }
        }
    }
}
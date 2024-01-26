package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void game(){
        WelcomeClass welcomeClass = new WelcomeClass();
        User user = welcomeClass.welcome();
        int userPoints = 0;
        int computerPoints = 0;

        while(user.getNumberOfWinningRounds()>userPoints && user.getNumberOfWinningRounds()>computerPoints) {
            char userMove;
            char computerMove;

            // User move
            System.out.println("Please make your move");
            do {
                Scanner sc1 = new Scanner(System.in);
                userMove = sc1.next().charAt(0);
                if (userMove != '1' && userMove != '2' && userMove != '3' && userMove != 'x' && userMove != 'n')
                    System.out.println("Please enter only 1, 2, 3 x or n");
            } while (userMove != '1' && userMove != '2' && userMove != '3' && userMove != 'x' && userMove != 'n');

            if(userMove == 'x'){
                System.out.println("Are you sure to quit the game? If so press y");
                Scanner sc1 = new Scanner(System.in);
                char c = sc1.next().charAt(0);
                if(c == 'y')
                    break;
                else
                    continue;
            }

            if(userMove == 'n'){
                System.out.println("Are you sure to quit this game and start the new one? If so press y");
                Scanner sc1 = new Scanner(System.in);
                char c = sc1.next().charAt(0);
                if(c == 'y'){
                    userPoints = 0;
                    computerPoints = 0;
                    continue ;}
                else
                    continue;
            }

                switch (userMove) {
                case '1':
                    System.out.println("You chose a rock");
                    break;
                case '2':
                    System.out.println("You chose a paper");
                    break;
                case '3':
                    System.out.println("You chose a scissors");
                    break;


            }
            //Computer move
            Random rnd = new Random();
            computerMove = (char) ('1' + rnd.nextInt(3));
            switch (computerMove) {
                case '1':
                    System.out.println("Computer chose a rock");
                    break;
                case '2':
                    System.out.println("Computer chose a paper");
                    break;
                case '3':
                    System.out.println("Computer chose a scissors");
                    break;
            }

            // Game logic
            if (userMove == '1' && computerMove == '2')
            {System.out.println("Round for Computer!");
                computerPoints++;}
            if (userMove == '1' && computerMove == '3')
            {System.out.println("Round for You!");
                userPoints++;}
            if (userMove == '2' && computerMove == '1')
            {System.out.println("Round for You!");
                userPoints++;}
            if (userMove == '2' && computerMove == '3')
            {System.out.println("Round for Computer!");
                computerPoints++;}
            if (userMove == '3' && computerMove == '1')
            {System.out.println("Round for Computer!");
                computerPoints++;}
            if (userMove == '3' && computerMove == '2')
            {System.out.println("Round for You!");
                userPoints++;}
            System.out.println("Result:\n" +user.getName()+ " " +userPoints+ ", Computer: " +computerPoints);
        }
        if(userPoints>computerPoints)
            System.out.println(user.getName()+" is the winner of the game!!!");
        else
            System.out.println("Computer is the winner of the game :( :( :( ");


    }



}

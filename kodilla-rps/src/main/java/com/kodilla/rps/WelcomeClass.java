package com.kodilla.rps;

import java.util.Scanner;

public class WelcomeClass {

    public User welcome() {
        System.out.println("Welcome in Rock-Paper-Scissors game! \n" +
                            "Please enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Please enter how many winning rounds to victory: " );
        int n=0;
        boolean flag;
        do
        {
            try
            {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter only values from 1 to 100");
                    n = sc1.nextInt();
                }while (n<1 || n>100);
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("Please enter only integer value");
                flag=true;
            }


        }
        while(flag);
        User user = new User(name,n);
        System.out.println("Hello " +name+ "! You have to win " +n+ " rounds to beat me :)!");
        System.out.println("Here are some instructions:\n" +
                "On your keyboard you can press:\n" +
                "'1' to make a stone\n'2' to make a paper\n'3' to make a scissors\n'x' to leave the game\n'n' to start a new game");
        return user;
    }
}

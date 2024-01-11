package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator(9, 5);
        int c = 9 + 5;
        int d = 9 - 5;



        if(c == calc.add()){
            System.out.println("Wykonano poprawne funkcję dodawania");
        } else {
            System.out.println("Error!");
        }

        if(d == calc.subtract()){
            System.out.println("Wykonano poprawne funkcję odejmowania");
        } else {
            System.out.println("Error!");
        }
    }
}
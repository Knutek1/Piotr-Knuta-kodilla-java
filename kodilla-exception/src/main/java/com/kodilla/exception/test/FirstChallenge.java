package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result;
        try {
            result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Nie ma takiej liczby");
        }finally {
            System.out.println("Pamiętaj by nigdy nie dzielić przez '0'");
        }


    }
}
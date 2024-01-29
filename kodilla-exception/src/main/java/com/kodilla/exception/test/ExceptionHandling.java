package com.kodilla.exception.test;

public class ExceptionHandling {

    public void exceptionHandling(double a,double b) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(a, b);
        }catch (Exception e){
            System.out.println("This is an exception!");
            throw new Exception();
        }finally {
            System.out.println("Exception or not, I'm back!!!");
        }
    }
}

package com.kodilla.exception.test;

public class ExpRunner {

    public static void main(String[] args) {
        Exponent exponent = new Exponent();
        exponent.exp(4,1);
        //zero jako baza
        exponent.exp(0,0);
        exponent.exp(0,4);
        //zero jako wykładnik
        exponent.exp(4,0);
        exponent.exp(0,0);
        //jeden jako wykładnik
        exponent.exp(3,1);
        exponent.exp(8,1);
    }
}

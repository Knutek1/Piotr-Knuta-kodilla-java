package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        int c = this.a + this.b;
        return c;
    }

    public int subtract(){
        int c = this.a - this.b;
        return c;
    }

}

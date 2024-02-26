package com.kodilla.spring.portfolio;

public class FibonacciRunner {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciCalculateIterative(9));
        System.out.println(fibonacci.fibonacciCalculateRecurrent(9));
    }
}

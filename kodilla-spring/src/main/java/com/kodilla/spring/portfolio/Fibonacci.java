package com.kodilla.spring.portfolio;

public class Fibonacci {

    public int fibonacciCalculateIterative(int n) {
        int fibonacciArray[] = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 1; i < n - 1; i++) {
            fibonacciArray[i + 1] = fibonacciArray[i] + fibonacciArray[i - 1];
        }
        return fibonacciArray[n - 1];
    }

    public int fibonacciCalculateRecurrent(int n){
        if(n==1){
            return 0;
        }
        if(n==2 || n==3){
            return 1;
        }

            return fibonacciCalculateRecurrent(n - 1) + fibonacciCalculateRecurrent(n - 2);

    }
}

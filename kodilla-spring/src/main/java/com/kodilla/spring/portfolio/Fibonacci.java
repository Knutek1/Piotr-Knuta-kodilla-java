package com.kodilla.spring.portfolio;

public class Fibonacci {

    public int fibonacciCalculate(int n){
        int fibonacciArray[] = new int[n];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        for (int i=1; i<n-1; i++){
           fibonacciArray[i+1] = fibonacciArray[i]+fibonacciArray[i-1];
        }
        return fibonacciArray[n-1];
    }
}

package com.kodilla.exception.test;

public class Exponent {
    public Integer exp(Integer b,Integer n){
        Integer result=b;


        if(b == 0 && n == 0){
            //System.out.println("Wyrażenie nieoznaczone");
            result = null;
        }
        else if(n == 0){result = 1;}
        else {
            for (int i = 1; i < n; i++) {
                result = result * b;
            }
        }
       // System.out.println(result);
        return result;
    }
}

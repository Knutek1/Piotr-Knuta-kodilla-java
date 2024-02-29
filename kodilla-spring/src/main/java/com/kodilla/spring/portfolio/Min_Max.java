package com.kodilla.spring.portfolio;

public class Min_Max {
    public static int minValue(int[] tab){
        int min = tab[0];
        for(int i = 1; i< tab.length; i++){
            if(min > tab[i]){
                min = tab[i];
            }
        }
        return min;
    }
    public static int maxValue(int[] tab){
        int max = tab[0];
        for(int i = 1; i< tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
}

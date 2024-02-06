package com.kodilla.good.patterns.challenges;


public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.showTitles();

        Silnia silnia = new Silnia();
        System.out.println(silnia.factorial(3));
        System.out.println(silnia.factorial(5));
        System.out.println(silnia.factorial(6));
    }
}

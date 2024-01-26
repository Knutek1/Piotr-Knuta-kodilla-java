package com.kodilla.rps;

public class User {
    private String name;
    private int numberOfWinningRounds;

    public User(String name, int numberOfWinningRounds) {
        this.name = name;
        this.numberOfWinningRounds = numberOfWinningRounds;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWinningRounds() {
        return numberOfWinningRounds;
    }

    @Override
    public String toString() {
        return name;
    }
}

package com.kodilla.patterns.strategy.social;

public final class XPublisher implements SocialPublisher{

    @Override
    public String share() {
        String string = "X platform";
        return string;
    }
}

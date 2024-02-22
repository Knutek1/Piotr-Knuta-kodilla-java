package com.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        String string = "Facebook platform";
        return string;
    }
}

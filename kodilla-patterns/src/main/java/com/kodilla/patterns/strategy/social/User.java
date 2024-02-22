package com.kodilla.patterns.strategy.social;

public sealed class User
permits Millenials,YGeneration,ZGeneration
{
    private String name;
    public SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    String sharePost() {
        return name + " sharing posts with " + socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}

package com.kodilla.patterns.strategy.social;

public sealed interface SocialPublisher
permits FacebookPublisher,XPublisher,SnapchatPublisher{
    String share();
}

package com.kodilla.patterns.com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Sent on Snapchat.");
    }
}

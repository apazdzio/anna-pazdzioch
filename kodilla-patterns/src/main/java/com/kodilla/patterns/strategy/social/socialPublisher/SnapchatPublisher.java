package com.kodilla.patterns.strategy.social.socialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "My favorite channel among social media is Snapchat.";
    }
}

package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.socialPublisher.FacebookPublisher;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}

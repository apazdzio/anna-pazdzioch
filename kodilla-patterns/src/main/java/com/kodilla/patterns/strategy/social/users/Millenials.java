package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.socialPublisher.TwitterPublisher;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}

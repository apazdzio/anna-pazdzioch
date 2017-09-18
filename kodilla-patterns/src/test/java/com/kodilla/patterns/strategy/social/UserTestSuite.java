package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialPublisher.TwitterPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mary = new Millenials("Mary");
        User anna = new YGeneration("Anna");
        User nicola = new ZGeneration("Nicola");
        //When
        String maryPrefers = mary.sharePost();
        String annaPrefers = anna.sharePost();
        String nicolaPrefers = nicola.sharePost();
        //Then
        Assert.assertEquals("My favorite channel among social media is Twitter.", maryPrefers);
        Assert.assertEquals("My favorite channel among social media is Facebook.", annaPrefers);
        Assert.assertEquals("My favorite channel among social media is Snapchat.", nicolaPrefers);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User anna = new YGeneration("Anna");
        //When
        String annaPrefers = anna.sharePost();
        System.out.println(annaPrefers);
        anna.setSocialPublisher(new TwitterPublisher());
        annaPrefers = anna.sharePost();
        System.out.println(annaPrefers);
        //Then
        Assert.assertEquals("My favorite channel among social media is Twitter.", annaPrefers);


    }
}

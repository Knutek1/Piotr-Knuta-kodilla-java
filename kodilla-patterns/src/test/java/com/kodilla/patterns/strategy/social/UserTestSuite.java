package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //given
    User user1 = new Millenials("Tytus");
    User user2 = new YGeneration("Romek");
    User user3 = new ZGeneration("Atomek");

     //when & then
        Assertions.assertEquals("Tytus sharing posts with X platform",user1.sharePost());
        Assertions.assertEquals("Romek sharing posts with Facebook platform",user2.sharePost());
        Assertions.assertEquals("Atomek sharing posts with Snapchat platform",user3.sharePost());

    }
    @Test
    void testIndividualSharingStrategy(){
        //given
        User user = new Millenials("Franchesco Totti");
        System.out.println(user.sharePost());
        //when
        user.setSocialPublisher(new FacebookPublisher());
        System.out.println(user.sharePost());
        //then
        Assertions.assertEquals("Franchesco Totti sharing posts with Facebook platform",user.sharePost());


    }
}

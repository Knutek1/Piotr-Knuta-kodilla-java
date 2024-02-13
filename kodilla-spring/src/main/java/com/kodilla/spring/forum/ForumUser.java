package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User{
    String username;

    public ForumUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}

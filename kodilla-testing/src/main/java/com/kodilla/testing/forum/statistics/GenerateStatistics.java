package com.kodilla.testing.forum.statistics;

import java.util.List;

public class GenerateStatistics {
    private int amountOfUsers;
    private int amountOfPosts;
    private int amountOfComments;

    public GenerateStatistics(int amountOfUsers, int amountOfPosts, int amountOfComments) {
        this.amountOfUsers = amountOfUsers;
        this.amountOfPosts = amountOfPosts;
        this.amountOfComments = amountOfComments;
    }


    public List<String> usersNames() {
        return null;
    }

   /* @Override
    public int postsCount() {
        return amountOfPosts;
    }*/


    public int commentsCount() {
        return amountOfComments;
    }
    public int userCount(){
        return amountOfUsers;
    }
}

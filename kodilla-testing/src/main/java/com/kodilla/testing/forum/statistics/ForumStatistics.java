package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
    numberOfPosts = statistics.postsCount();
    numberOfComments = statistics.commentsCount();
    numberOfUsers = statistics.usersNames().size();

    //if(numberOfUsers != 0) {
        averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
   //}

    //if(numberOfUsers != 0) {
         averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        // }
   // if(numberOfPosts != 0) {
        averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
    //}


    }

    void showStatistics(Statistics statistics){
        System.out.println("Liczba użytkowników to: "+numberOfUsers);
        System.out.println("Liczba postów to: "+numberOfPosts);
        System.out.println("Liczba komentarzy to: "+numberOfComments);
        System.out.println("Średnia liczba postów na użytkownika to: "+averagePostsPerUser);
        System.out.println("Średnia liczba komentarzy na użytkownika to: "+averageCommentsPerUser);
        System.out.println("Średnia liczba komentarzy na post to: "+averageCommentsPerPost);

    }
}

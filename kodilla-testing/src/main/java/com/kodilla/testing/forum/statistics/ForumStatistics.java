package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }


    double calculateAdvStatistics(Statistics statistics){
    return 0;
    }
    public int postsCount() {
        int numberOfPost = statistics.postsCount();
        return numberOfPost;
    }
    void showStatistics(){

    }
}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    List<String> generateListOfUsers(int n){
        List <String> listOfUsers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            listOfUsers.add("User number "+i);
        }
        return listOfUsers;
    }

    @Nested
    @DisplayName("Tests with Posts")
    class TestWithPosts {
        @Test
        void statisticsWith0Post() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(5);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
         //   Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
         //   Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsPerUser());
          //  Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());

        }

        @Test
        void statisticsWith1000Post() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(5);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
            Assertions.assertEquals(100, forumStatistics.getAveragePostsPerUser());
            Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsPerUser());
            Assertions.assertEquals(0.005, forumStatistics.getAverageCommentsPerPost());

        }
    }

    @Nested
    @DisplayName("Test with Comments")
    class TestWithComments{
        @Test
        void statisticsWith0Comments() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
            Assertions.assertEquals(100, forumStatistics.getAveragePostsPerUser());
            Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
            Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());

        }

    }
    @Nested
    @DisplayName("Tests with Posts and Comments")
    class TestWithPostsAndComments {
        @Test
        void statisticsWithMorePostThanComments() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
            Assertions.assertEquals(10, forumStatistics.getAveragePostsPerUser());
            Assertions.assertEquals(5, forumStatistics.getAverageCommentsPerUser());
            Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost());

        }

        @Test
        void statisticsWithMoreCommentsThanPosts() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
            Assertions.assertEquals(5, forumStatistics.getAveragePostsPerUser());
            Assertions.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
            Assertions.assertEquals(2, forumStatistics.getAverageCommentsPerPost());

        }
    }
    @Nested
    @DisplayName("Tests with Users")
    class TestWithUsers {
        @Test
        void statisticsWith0User() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(5);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(0));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
      //      Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
      //      Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
      //      Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost());

        }

        @Test
        void statisticsWith100Users() {
            //given
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(5);
            when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(100));
            //when
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.showStatistics(statisticsMock);
            //then
            Assertions.assertEquals(10, forumStatistics.getAveragePostsPerUser());
            Assertions.assertEquals(0.05, forumStatistics.getAverageCommentsPerUser());
            Assertions.assertEquals(0.005, forumStatistics.getAverageCommentsPerPost());

        }
    }


}
/*

gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.*/
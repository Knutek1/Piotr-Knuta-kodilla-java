package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    @Test
    void statisticsWithNoPost(){
        //given
    ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
    int numberOfPost = 0;
    //GenerateStatistics gs1 = new GenerateStatistics(0,0,0);
    when(statisticsMock.postsCount()).thenReturn(numberOfPost);
    //when
    int averagePostPerUser = forumStatistics.postsCount();
    //then
       Assertions.assertEquals(0,averagePostPerUser);

    }
    @Test
    void statisticsWith1000Post(){
        //given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        int numberOfPost = 1000;
        //GenerateStatistics gs1 = new GenerateStatistics(0,0,0);
        when(statisticsMock.postsCount()).thenReturn(numberOfPost);
        //when
        int averagePostPerUser = forumStatistics.postsCount();
        //then
        Assertions.assertEquals(0,averagePostPerUser);

    }
}
/*gdy liczba postów = 0,
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.*/
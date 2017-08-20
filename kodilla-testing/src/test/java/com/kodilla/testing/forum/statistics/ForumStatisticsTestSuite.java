package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);


        //Then
        Assert.assertEquals(0.0, forumStatistic.getAverPostsPerUser());
    };
}

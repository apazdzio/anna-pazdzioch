package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static com.kodilla.testing.forum.statistics.ForumStatistic.showStatistics;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> usersList = new ArrayList<>();
        for (int n = 0; n < usersQuantity; n++) {
            usersList.add("Name" + n);
        }
        return usersList;
    }
    @Test
    public void testCalculateStatisticsWhen0UsersAndPosts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        showStatistics(forumStatistic);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverPostsPerUser());
    }
    @Test
    public void testCalculateStatisticsWhen100Users(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> users100 = generateListOfNUsers(100);
        when(statisticMock.usersNames()).thenReturn(users100);
        when(statisticMock.postsCount()).thenReturn(1000);
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(10, forumStatistic.getAverPostsPerUser());
    }
    @Test
    public void testCalculateStatisticsWhenCommMoreThanPosts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> users50 = generateListOfNUsers(50);
        when(statisticMock.usersNames()).thenReturn(users50);
        when(statisticMock.commentsCount()).thenReturn(2000);
        when(statisticMock.postsCount()).thenReturn(1000);
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(2, forumStatistic.getAverCommentsPerPost());
    }
    @Test
    public void testCalculateStatisticsWhenPostsMoreThanComm(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> users50 = generateListOfNUsers(50);
        when(statisticMock.usersNames()).thenReturn(users50);
        when(statisticMock.commentsCount()).thenReturn(400);
        when(statisticMock.postsCount()).thenReturn(500);
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        showStatistics(forumStatistic);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverCommentsPerPost());
    }
    @Test
    public void testCalculateStatisticsWhen0Comm(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> users50 = generateListOfNUsers(50);
        when(statisticMock.usersNames()).thenReturn(users50);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(500);
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverCommentsPerUser());
    }
    @Test
    public void testCalculateStatisticsWhen0Posts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> users50 = generateListOfNUsers(50);
        when(statisticMock.usersNames()).thenReturn(users50);
        //When
        forumStatistic.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverCommentsPerUser());
    }
}

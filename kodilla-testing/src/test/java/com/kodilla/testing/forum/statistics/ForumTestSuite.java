package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite {
    @Test
    public void testCalculateNoOfUsersWhenNoUsers(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        int postsCount = 1;
        int commentsCount = 1;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfUsers = statsProcessor.calculateAdvStatistics(statisticsMock).usersNames().size();

        //then
        Assert.assertEquals(0, noOfUsers);
    }

    @Test
    public void testCalculateNoOfUsersWhen100Users(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int postsCount = 1;
        int commentsCount = 1;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfUsers = statsProcessor.calculateAdvStatistics(statisticsMock).usersNames().size();

        //then
        Assert.assertEquals(100, noOfUsers);
    }

    @Test
    public void testCalculateNoOfPostsWhenNoPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        int postsCount = 0;
        int commentsCount = 1;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfPosts = statsProcessor.calculateAdvStatistics(statisticsMock).postsCount();

        //then
        Assert.assertEquals(0, noOfPosts);
    }

    @Test
    public void testCalculateNoOfPostsWhen1000Posts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        int postsCount = 1000;
        int commentsCount = 1;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfPosts = statsProcessor.calculateAdvStatistics(statisticsMock).postsCount();

        //then
        Assert.assertEquals(1000, noOfPosts);
    }

    @Test
    public void testCalculateNoOfCommentsWhenNoComments(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        int postsCount = 10;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfComments = statsProcessor.calculateAdvStatistics(statisticsMock).commentsCount();

        //then
        Assert.assertEquals(0, noOfComments);
    }

    @Test
    public void testCalculateNoOfCommentsWhen10Comments(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        int postsCount = 10;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfComments = statsProcessor.calculateAdvStatistics(statisticsMock).commentsCount();

        //then
        Assert.assertEquals(10, noOfComments);
    }

    @Test
    public void testCalculateStatsWhenLessCommentsThanPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            userNames.add("John");
        }
        int postsCount = 10;
        int commentsCount = 2;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfComments = statsProcessor.calculateAdvStatistics(statisticsMock).commentsCount();
        int noOfPosts = statsProcessor.calculateAdvStatistics(statisticsMock).postsCount();
        int noOfUsers = statsProcessor.calculateAdvStatistics(statisticsMock).usersNames().size();

        double postsPerUser = (double) noOfPosts/noOfUsers;
        double commentsPerUser = (double) noOfComments/noOfUsers;
        double commentsPerPost = (double) noOfComments/noOfPosts;

        //then
        Assert.assertEquals(2, noOfComments);
        Assert.assertEquals(10, noOfPosts);
        Assert.assertEquals(1.0, postsPerUser, 0);
        Assert.assertEquals(0.2, commentsPerUser, 0);
        Assert.assertEquals(0.2, commentsPerPost, 0);
    }

    @Test
    public void testCalculateStatsWhenMoreCommentsThanPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor(statisticsMock);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            userNames.add("John");
        }
        int postsCount = 10;
        int commentsCount = 20;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //when
        int noOfComments = statsProcessor.calculateAdvStatistics(statisticsMock).commentsCount();
        int noOfPosts = statsProcessor.calculateAdvStatistics(statisticsMock).postsCount();
        int noOfUsers = statsProcessor.calculateAdvStatistics(statisticsMock).usersNames().size();

        double postsPerUser = (double) noOfPosts/noOfUsers;
        double commentsPerUser = (double) noOfComments/noOfUsers;
        double commentsPerPost = (double) noOfComments/noOfPosts;

        //then
        Assert.assertEquals(20, noOfComments);
        Assert.assertEquals(10, noOfPosts);
        Assert.assertEquals(1.0, postsPerUser, 0);
        Assert.assertEquals(2, commentsPerUser, 0);
        Assert.assertEquals(2, commentsPerPost, 0);
    }
}

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
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        int posts = 0;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(0, noOfUsers);
        Assert.assertEquals(0, noOfPosts);
        Assert.assertEquals(0, noOfComments);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testCalculateNoOfUsersWhen100Users(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
               userNames.add("John");
            }
        int posts = 50;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(50, noOfPosts);
        Assert.assertEquals(10, noOfComments);
        Assert.assertEquals(0.5, postsPerUser, 0);
        Assert.assertEquals(0.1, commentsPerUser, 0);
        Assert.assertEquals(0.2, commentsPerPost, 0);
    }

    @Test
    public void testCalculateNoOfPostsWhenNoPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            userNames.add("John");
        }
        int posts = 0;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(10, noOfUsers);
        Assert.assertEquals(0, noOfPosts);
        Assert.assertEquals(0, noOfComments);
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testCalculateNoOfPostsWhen1000Posts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int posts = 1000;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(1000, noOfPosts);
        Assert.assertEquals(10, noOfComments);
        Assert.assertEquals(10, postsPerUser, 0);
        Assert.assertEquals(0.1, commentsPerUser, 0);
        Assert.assertEquals(0.01, commentsPerPost, 0);
    }

    @Test
    public void testCalculateNoOfCommentsWhenNoComments(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int posts = 50;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(50, noOfPosts);
        Assert.assertEquals(0, noOfComments);
        Assert.assertEquals(0.5, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testCalculateNoOfCommentsWhen10Comments(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int posts = 100;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(100, noOfPosts);
        Assert.assertEquals(10, noOfComments);
        Assert.assertEquals(1, postsPerUser, 0);
        Assert.assertEquals(0.1, commentsPerUser, 0);
        Assert.assertEquals(0.1, commentsPerPost, 0);
    }

    @Test
    public void testCalculateStatsWhenLessCommentsThanPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int posts = 500;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(500, noOfPosts);
        Assert.assertEquals(10, noOfComments);
        Assert.assertEquals(5, postsPerUser, 0);
        Assert.assertEquals(0.1, commentsPerUser, 0);
        Assert.assertEquals(0.02, commentsPerPost, 0);
    }

    @Test
    public void testCalculateStatsWhenMoreCommentsThanPosts(){
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatsProcessor statsProcessor = new StatsProcessor();
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            userNames.add("John");
        }
        int posts = 50;
        int comments = 100;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        statsProcessor.calculateAdvStatistics(statisticsMock);
        int noOfUsers = statsProcessor.getNoOfUsers();
        int noOfPosts = statsProcessor.getNoOfPosts();
        int noOfComments = statsProcessor.getNoOfComments();
        double postsPerUser = statsProcessor.getPostsPerUser();
        double commentsPerUser = statsProcessor.getCommentsPerUser();
        double commentsPerPost = statsProcessor.getCommentsPerPost();

        //then
        Assert.assertEquals(100, noOfUsers);
        Assert.assertEquals(50, noOfPosts);
        Assert.assertEquals(100, noOfComments);
        Assert.assertEquals(0.5, postsPerUser, 0);
        Assert.assertEquals(1, commentsPerUser, 0);
        Assert.assertEquals(2, commentsPerPost, 0);
    }
}

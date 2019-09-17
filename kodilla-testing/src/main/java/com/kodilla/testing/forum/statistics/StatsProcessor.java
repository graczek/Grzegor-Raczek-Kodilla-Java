package com.kodilla.testing.forum.statistics;

public class StatsProcessor {

    private Statistics statistics;
    private int noOfUsers;
    private int noOfPosts;
    private int noOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public StatsProcessor(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNoOfUsers() {
        return noOfUsers;
    }

    public int getNoOfPosts() {
        return noOfPosts;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public Statistics calculateAdvStatistics(Statistics statistics){

        noOfUsers = statistics.usersNames().size();
        noOfPosts = statistics.postsCount();
        noOfComments = statistics.commentsCount();

        if(noOfPosts == 0 || noOfUsers == 0){
            System.out.println("Cannot divide by zero!");
            postsPerUser = 0;
            commentsPerUser = 0;
            commentsPerPost = 0;
        } else {
            postsPerUser = (double) noOfPosts / noOfUsers;
            commentsPerUser = (double) noOfComments / noOfUsers;
            commentsPerPost = (double) noOfComments / noOfPosts;
        }

        return statistics;
    }

    public void showStatistics(){
        System.out.println("Current no of users: " + getNoOfUsers());
        System.out.println("Current no of posts: " + getNoOfPosts());
        System.out.println("Current no of comments: " + getNoOfComments());
        System.out.println("Current no of posts per user: " + getPostsPerUser());
        System.out.println("Current no of comments per user: " + getCommentsPerUser());
        System.out.println("Current no of comments per post: " + getCommentsPerPost());
    }

}

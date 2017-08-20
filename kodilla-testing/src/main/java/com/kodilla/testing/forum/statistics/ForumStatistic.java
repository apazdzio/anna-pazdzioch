package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private int quantityOfPosts;
    private int quantityOfComments;
    private int quantityOfUsers;
    private double averPostsPerUser;
    private double averCommentsPerUser;
    private double averCommentsPerPost;

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public double getAverPostsPerUser() {
        return averPostsPerUser;
    }

    public double getAverCommentsPerUser() {
        return averCommentsPerUser;
    }

    public double getAverCommentsPerPost() {
        return averCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        quantityOfUsers = statistics.usersNames().size();
        averPostsPerUser = quantityOfPosts / quantityOfUsers;
        averCommentsPerUser = quantityOfComments / quantityOfUsers;
        averCommentsPerPost = quantityOfComments / quantityOfPosts;
    };

    public void ShowStatistics(){};

}

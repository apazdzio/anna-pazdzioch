package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private int quantityOfPosts;
    private int quantityOfComments;
    private int quantityOfUsers;
    private int averPostsPerUser;
    private int averCommentsPerUser;
    private int averCommentsPerPost;

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getAverPostsPerUser() {
        return averPostsPerUser;
    }

    public int getAverCommentsPerUser() {
        return averCommentsPerUser;
    }

    public int getAverCommentsPerPost() {
        return averCommentsPerPost;
    }

    @Override
    public String toString() {
        return "ForumStatistic{" +
                "quantityOfPosts=" + quantityOfPosts +
                ", quantityOfComments=" + quantityOfComments +
                ", quantityOfUsers=" + quantityOfUsers +
                ", averPostsPerUser=" + averPostsPerUser +
                ", averCommentsPerUser=" + averCommentsPerUser +
                ", averCommentsPerPost=" + averCommentsPerPost +
                '}';
    }

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        quantityOfUsers = statistics.usersNames().size();
        if (quantityOfUsers > 0 && quantityOfPosts > 0) {
            averPostsPerUser = quantityOfPosts / quantityOfUsers;
            averCommentsPerUser = quantityOfComments / quantityOfUsers;
            averCommentsPerPost = quantityOfComments / quantityOfPosts;
        }
    }
    static void showStatistics(ForumStatistic forumStatistic) {
        System.out.println(forumStatistic);
    }
}

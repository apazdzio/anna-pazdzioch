package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int quantityOfPosts;

    public ForumUser(int userId, String username, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int quantityOfPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return   username +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityOfPosts=" + quantityOfPosts;
    }
}
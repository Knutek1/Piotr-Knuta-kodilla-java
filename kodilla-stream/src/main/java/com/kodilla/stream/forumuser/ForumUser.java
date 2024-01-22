package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    int userID;
    String username;
    char sex;
    LocalDate birthdate;
    int numberOfPosts;

    public ForumUser(int userID, String username, char sex, LocalDate birthdate, int numberOfPosts) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userID != forumUser.userID) return false;
        if (sex != forumUser.sex) return false;
        if (numberOfPosts != forumUser.numberOfPosts) return false;
        if (!Objects.equals(username, forumUser.username)) return false;
        return Objects.equals(birthdate, forumUser.birthdate);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + numberOfPosts;
        return result;

    }
}

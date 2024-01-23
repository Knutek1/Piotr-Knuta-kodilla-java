package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer,ForumUser> mapOfUser = forum.getUserList().stream()
        .filter(forumUser -> forumUser.getSex() == 'm')
        .filter(forumUser -> forumUser.getBirthdate().getYear() < 2004)
                .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));
        System.out.println(mapOfUser.size());

        mapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ":ddd " + entry.getValue())
                .forEach(System.out::println);



    }
}
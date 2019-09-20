package com.kodilla.stream;


import com.kodilla.stream.book.BookDirectory;
import forumuser.Forum;
import forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        LocalDate today = LocalDate.now();
        LocalDate twentyYearsBackDate = today.minusYears(20);

        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUsersList().stream()
                .filter(user -> user.getSex() == 'm')
                .filter(user -> user.getDateOfBirth().isBefore(twentyYearsBackDate))
                .filter(user -> user.getNoOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Currently there are " + theResultMapOfForumUsers.size() +
                " users that are male, over 20 years old and have a least 1 post on the forum: ");

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}


package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List <ForumUser> userList = new ArrayList<>();

        public Forum() {
            userList.add(new ForumUser(1, "Aladdddkazam", 'm', LocalDate.parse("2000-01-01"), 10));
            userList.add(new ForumUser(2, "Bulbazaur", 'm', LocalDate.parse("2001-02-02"), 0));
            userList.add(new ForumUser(3, "Charizard", 'm', LocalDate.parse("2002-03-03"), 234));
            userList.add(new ForumUser(4, "Dragonite", 'm', LocalDate.parse("2003-04-04"), 3));
            userList.add(new ForumUser(5, "Electrode", 'm', LocalDate.parse("2004-05-05"), 5));
            userList.add(new ForumUser(6, "Flareon", 'm', LocalDate.parse("2005-06-06"), 6));
            userList.add(new ForumUser(7, "Gengar", 'm', LocalDate.parse("2006-07-07"), 2));
            userList.add(new ForumUser(8, "Hariyama", 'f', LocalDate.parse("2007-08-08"), 10));
            userList.add(new ForumUser(9, "Ivisaur", 'f', LocalDate.parse("2008-09-09"), 10));
            userList.add(new ForumUser(10, "Jolteon", 'f', LocalDate.parse("2009-10-10"), 10));
        }
        public List <ForumUser> getUserList() {
                return new ArrayList<>(userList);


}
}

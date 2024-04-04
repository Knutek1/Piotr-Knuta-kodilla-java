package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTestSuite {
    @Test
    void testMentorsNotifying(){
        Mentor alan = new Mentor("Alan");
        Mentor boris = new Mentor("Boris");
        TaskList tasklist1 = new TaskList("module 1");
        TaskList tasklist2 = new TaskList("module 2");
        TaskList tasklist3 = new TaskList("module 3");
        TaskList tasklist4 = new TaskList("module 4");
        TaskList tasklist5 = new TaskList("module 5");
        tasklist1.addObserver(boris);
        tasklist2.addObserver(boris);
        tasklist3.addObserver(boris);
        tasklist4.addObserver(alan);
        tasklist5.addObserver(alan);
        tasklist1.addTask("Task 1 module 1 ");
        tasklist1.addTask("Task 2 module 1 ");
        tasklist2.addTask("Task 1 module 2 ");
        tasklist2.addTask("Task 2 module 2 ");
        tasklist3.addTask("Task 1 module 3 ");
        tasklist4.addTask("Task 1 module 4 ");
        tasklist5.addTask("Task 1 module 5 ");

        Assertions.assertEquals(5,boris.getCounter());
        Assertions.assertEquals(2,alan.getCounter());
    }
}

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;



@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Pierwsza", "Mało w niej zawartosci");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        Assertions.assertEquals(1,readTaskList.size());
        //clean up
        taskListDao.delete(taskList);
    }

    ;
}

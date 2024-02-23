package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrive(){
        //given && when
        Task drive = TaskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //then
        Assertions.assertEquals(true,drive.isTaskExecuted());
        Assertions.assertEquals("Collect cake",drive.getTaskName());
        Assertions.assertEquals("Processing Collect cake",drive.executeTask());
    }
    @Test
    void testFactoryPaint(){
        Task paint = TaskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //then
        Assertions.assertEquals(true,paint.isTaskExecuted());
        Assertions.assertEquals("Paint wall",paint.getTaskName());
        Assertions.assertEquals("Processing Paint wall",paint.executeTask());
    }
    @Test
    void testFactoryShop(){
        Task paint = TaskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //then
        Assertions.assertEquals(false,paint.isTaskExecuted());
        Assertions.assertEquals("Buy snacks",paint.getTaskName());
        Assertions.assertEquals("Processing Buy snacks",paint.executeTask());
    }
}

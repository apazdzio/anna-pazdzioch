package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTaskFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task1 = factory.makeTask(TaskFactory.DRIVING);
        task1.executeTask();
        //Then
        Assert.assertEquals("Transport", task1.getTaskName());
        Assert.assertTrue(task1.isTaskExecuted());
    }

    @Test
    public void testPaintingTaskFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task2 = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Portrait", task2.getTaskName());
        Assert.assertFalse(task2.isTaskExecuted());
    }

    @Test
    public void testShoppingTaskFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task3 = factory.makeTask(TaskFactory.SHOPPING);
        task3.executeTask();
        //Then
        Assert.assertEquals("Shopping", task3.getTaskName());
        Assert.assertTrue(task3.isTaskExecuted());
    }

}

package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task1 = factory.makeTask(TaskFactory.DRIVING);
        factory.process(task1);
        //then
        Assert.assertEquals("Transport", task1.getTaskName());
        Assert.assertEquals(1, factory.getTasks().size());
    }
    @Test
    public void testPaintingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task2 = factory.makeTask(TaskFactory.PAINTING);
        factory.process(task2);
        //then
        Assert.assertEquals("Portrait", task2.getTaskName());
        Assert.assertTrue(factory.getTasks().contains(task2));
    }

}

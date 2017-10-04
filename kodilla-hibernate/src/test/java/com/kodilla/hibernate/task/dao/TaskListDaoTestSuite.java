package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ToDo", "The list contains tasks to perform.");
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> savedTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, savedTaskList.size());
        Assert.assertEquals(listName, savedTaskList.get(0).getListName());

        //CleanUp
        taskListDao.delete(1);
    }

}

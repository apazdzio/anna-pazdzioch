package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    TaskList taskList;

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getTaskListToDo() {
        return new TaskList();
    }
    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getTaskListInProgress() {
        return new TaskList();
    }
    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getTaskListDone() {
        return new TaskList();
    }
    @Bean
    public Board board() {
        return new Board(getTaskListToDo(), getTaskListInProgress(), getTaskListDone());
    }
}

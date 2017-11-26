package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor robert = new Mentor("Robert", "Wójcikiewicz");
        Mentor tom = new Mentor ("Tom", "Novak");
        TasksQueue aniaTasksQueue = new TasksQueue(new Student("Ania", "Paździoch"));
        TasksQueue markTasksQueue = new TasksQueue(new Student("Mark", "Jacobsen"));
        TasksQueue jacobTasksQueue = new TasksQueue(new Student("Jacob", "Peterson"));
        TasksQueue peterTasksQueue = new TasksQueue(new Student("Peter", "Markovski"));
        aniaTasksQueue.registerObserver(robert);
        markTasksQueue.registerObserver(robert);
        jacobTasksQueue.registerObserver(tom);
        peterTasksQueue.registerObserver(tom);
        //When
        aniaTasksQueue.addTask(new Task(20.3 , "Dodajemy logowanie żądań do fasady"));
        aniaTasksQueue.addTask(new Task(20.4 , "Kolejki z zadaniami do sprawdzenia"));
        markTasksQueue.addTask(new Task(19.1 , "Uaktualnienie projektu na Heroku"));
        jacobTasksQueue.addTask(new Task(18.3 , "Rozszerzenie klasy odpowiedzi"));
        peterTasksQueue.addTask(new Task(20.5 , "Klasyfikator statystyczny książek"));
        //Then
        assertEquals(3, robert.getUpdateCount());
        assertEquals(2, tom.getUpdateCount());
    }
}
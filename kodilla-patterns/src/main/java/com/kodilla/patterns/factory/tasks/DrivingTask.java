package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends AbstractTask implements Task{
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() { this.setExecuted(true); }

    @Override
    public String getTaskName() { return taskName; }

    @Override
    public boolean isTaskExecuted() { return this.isExecuted();}
}

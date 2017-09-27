package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends AbstractTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() { this.setExecuted(true); }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() { return this.isExecuted(); }
}

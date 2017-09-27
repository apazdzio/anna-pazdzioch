package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class ShoppingTask extends AbstractTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() { this.setExecuted(true); }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isExecuted();
    }
}

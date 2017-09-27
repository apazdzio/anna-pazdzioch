package com.kodilla.patterns.factory.tasks;

abstract class AbstractTask {
    private boolean executed;

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    public boolean isExecuted() {
        return executed;


    }
}

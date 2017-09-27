package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {
    public static final String DRIVING = "DrivingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String SHOPPING = "ShoppingTask";

    public TaskFactory() {
    }

    public final Task makeTask(String className) {
        switch (className) {
            case DRIVING:
                return new DrivingTask("Transport", "Airport","Taxi");
            case PAINTING:
                return new PaintingTask("Portrait", "Black", "Women");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Computer" , 1.0);
            default:
                return null;
        }
    }
}

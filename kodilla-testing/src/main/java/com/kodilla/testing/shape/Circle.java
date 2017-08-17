package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static double PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return "This is a circle.";
    }

    public double getField() {
        return PI * Math.pow(this.radius, 2);
    }
}
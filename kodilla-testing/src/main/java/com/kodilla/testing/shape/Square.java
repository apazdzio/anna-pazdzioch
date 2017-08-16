package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void getShapeName() {
        System.out.println("This is a square.");
    }

    public double getField() {

        return Math.pow(this.side, 2);
    }
}

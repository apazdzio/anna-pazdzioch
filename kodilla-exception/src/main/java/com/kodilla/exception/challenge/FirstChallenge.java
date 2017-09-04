package com.kodilla.exception.challenge;

public class FirstChallenge {

    public double divide(double a, double b) {
        try {
            return a /b;

        } catch(ArithmeticException e){
            System.out.println("Oh no! Error: " + e);
            return 0.0;

        } finally {

        System.out.println("Division ended");

    }
}

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3.0, 0.0);

        System.out.println(result);

    }
}
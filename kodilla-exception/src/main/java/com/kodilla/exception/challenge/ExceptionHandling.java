package com.kodilla.exception.challenge;

public class ExceptionHandling {

    public static void main(String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.5, 0.0);

        } catch (Exception e) {

            System.out.println(e + " Wrong arguments");
        }
    }
}

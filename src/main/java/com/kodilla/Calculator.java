package com.kodilla;

public class Calculator {

    public int addAToB(int a, int b){
        return a + b;
    }
    public int substractAFromB(int a, int b){
        return b - a;
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addAToB(10, 15));
    }
}

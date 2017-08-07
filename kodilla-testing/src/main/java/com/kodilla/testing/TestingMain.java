package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator();

        int sum = calculator.addAToB(10, 15);
        int difference = calculator.substractAFromB(10, 15);

        if(sum == 25){
            System.out.println("Test1 OK");
        }else{
            System.out.println("Test1 Error!");
        }
        if(difference == 5){
            System.out.println("Test2 OK");
        }else{
            System.out.println("Test2 Error!");
        }
    }
}
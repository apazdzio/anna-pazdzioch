package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> theList) {
        int number = 0;
        for (int n = 0; n < theList.size(); n++) {
            number = theList.get(n);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Lista zawiera " + theList.size() + " liczb, z tego " + evenNumbers.size() + " to liczby parzyste");
    }
}
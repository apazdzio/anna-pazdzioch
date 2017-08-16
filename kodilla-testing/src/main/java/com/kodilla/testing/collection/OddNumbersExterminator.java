package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> theList) {
        for (int n = 0; n < theList.size(); n++) {
            if (theList.get(n) % 2 == 0) {
                evenNumbers.add(theList.get(n));
            }
        }
        System.out.println("Lista zawiera " + theList.size() + " liczb, z tego " + evenNumbers.size() + " to liczby parzyste");
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}

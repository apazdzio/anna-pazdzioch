package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void showBefore(){
        System.out.println("Test case starts");
    }
    @After
    public void showAfter(){
        System.out.println("Test case ended");
    }
    @BeforeClass
    public static void showBeforeClass() {
        System.out.println("START");
    }
    @AfterClass
    public static void showAfterClass() {
        System.out.println("END");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        exterminator1.exterminate(emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random generator = new Random();
        for(int n = 0; n<50; n++) {
            numbers.add(generator.nextInt(100));
        }
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        exterminator2.exterminate(numbers);
    }
}

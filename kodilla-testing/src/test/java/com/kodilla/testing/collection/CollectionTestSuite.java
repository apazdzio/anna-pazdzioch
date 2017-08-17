package com.kodilla.testing.collection;

import org.junit.*;
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
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
       //When
        exterminator1.exterminate(emptyList);
        //Then
        Assert.assertEquals(0,exterminator1.getEvenNumbers().size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random generator = new Random();
        for (int n = 0; n < 50; n++) {
            numbers.add(generator.nextInt(100));
        }
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        //When
        exterminator2.exterminate(numbers);
        //Then
        for (Integer even: exterminator2.getEvenNumbers()) {
            Assert.assertTrue(even % 2 == 0);
        }
    }
}
package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private Square square;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        Square square = new Square(5.0);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, retrievedFigure);
    }
    @Test
    public void testShowFigures() {
        //Given
        Square square = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        String retrievedString = shapeCollector.showFigures();
        String expectedString = "This is a square.";
        //Then
        Assert.assertEquals(expectedString, retrievedString);
    }
}
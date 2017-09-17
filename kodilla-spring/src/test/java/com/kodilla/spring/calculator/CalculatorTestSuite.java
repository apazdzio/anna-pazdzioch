package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2,4);
        double subResult = calculator.sub(2,4);
        double mulResult = calculator.mul(2,4);
        double divResult = calculator.div(2,4);

        //Then
        Assert.assertEquals(6, addResult, 0.01);
        Assert.assertEquals(-2, subResult, 0.01);
        Assert.assertEquals(8, mulResult, 0.01);
        Assert.assertEquals(0.5, divResult, 0.01);
    }

}

package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
    //Given
        int[] numbers = new int[20];
        numbers[0] = 13;
        numbers[1] = 23;
        numbers[2] = 34;
        numbers[3] = 45;
        numbers[4] = 56;
        numbers[5] = 67;
        numbers[6] = 78;
        numbers[7] = 89;
        numbers[8] = 90;
        numbers[9] = 135;
        numbers[10] = 1;
        numbers[11] = 6;
        numbers[12] = 156;
        numbers[13] = 15;
        numbers[14] = 47;
        numbers[15] = 69;
        numbers[16] = 99;
        numbers[17] = 256;
        numbers[18] = 45;
        numbers[19] = 257;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(79.05, average, 0.001);
    }
}

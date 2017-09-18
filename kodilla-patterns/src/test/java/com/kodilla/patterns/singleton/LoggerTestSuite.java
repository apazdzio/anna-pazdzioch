package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog(){
        //When
        Logger.getInstance().log("2017-09-09");
        String date = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("2017-09-09", date);
    }
}
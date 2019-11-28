package com.kodilla.patterns.singleton;

import com.kodilla.patterns.com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("test log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test log", result);
    }
}

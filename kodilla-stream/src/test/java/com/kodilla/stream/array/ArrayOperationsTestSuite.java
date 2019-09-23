package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //given
        int[] data = new int[20];
        for (int i = 0; i < data.length ; i++) {
            data[i] = i + 1;
        }
        //when
        double average = ArrayOperations.getAverage(data);
        //then
        Assert.assertEquals(20, data.length);
        Assert.assertEquals(10.5, average, 0);

    }
}

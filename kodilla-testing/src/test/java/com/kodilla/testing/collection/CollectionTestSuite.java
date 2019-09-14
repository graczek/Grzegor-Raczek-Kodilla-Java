package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testListEmpty = new ArrayList<Integer>();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testListEmpty);
        //then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testListMixedNumbers = new ArrayList<Integer>();
        testListMixedNumbers.add(4);
        testListMixedNumbers.add(3);
        testListMixedNumbers.add(17);
        testListMixedNumbers.add(46);
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testListMixedNumbers);
        //then
        Assert.assertEquals(2, testListMixedNumbers.size());

    }
}

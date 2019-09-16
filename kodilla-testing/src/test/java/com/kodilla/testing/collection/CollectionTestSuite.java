package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();
    @Before
    public void before(){
        System.out.println("Test " + name.getMethodName() + " begins");
    }
    @After
    public void after(){
        System.out.println("Test " + name.getMethodName() + " ends");
    }
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
        ArrayList<Integer> actual = result;
        List<Integer> expected = Arrays.asList(4, 46);
        //then
        Assert.assertEquals(2, result.size());
        Assert.assertThat(expected, is(actual));

    }
}

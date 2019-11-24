package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 2;
        double b = 2;
        double expectedAddResult = 4;
        double expectedSubResult = 0;
        double expectedMulResult = 4;
        double expectedDivResult = 1;
        //When
        double addResult = calculator.add(a, b);
        double subResult = calculator.sub(a, b);
        double mulResult = calculator.mul(a, b);
        double divResult = calculator.div(a, b);
        //Then
        Assert.assertEquals(expectedAddResult, addResult, 0);
        Assert.assertEquals(expectedSubResult, subResult, 0);
        Assert.assertEquals(expectedMulResult, mulResult, 0);
        Assert.assertEquals(expectedDivResult, divResult, 0);
    }
}

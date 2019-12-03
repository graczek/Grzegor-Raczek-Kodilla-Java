package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //given
        Bigmac leBigmac = new Bigmac.BigmacBuilder()
                .ingredient("lots of bacon")
                .bun("nice bun")
                .burgers(3)
                .sauce("spicy")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("cheese")
                .build();
        System.out.println(leBigmac);
        //when
        int howManyIngredients = leBigmac.getIngredients().size();
        //then
        Assert.assertEquals(4, howManyIngredients);
    }
}


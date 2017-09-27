package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.SESAME)
                .sauce(Sauce.BARBECUE)
                .burgers(2)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.ONION)
                .build();
        System.out.println(bigmac);
        //When
        Roll whichRoll = bigmac.getRoll();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(Roll.SESAME, whichRoll);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(2, howManyIngredients);
    }
}

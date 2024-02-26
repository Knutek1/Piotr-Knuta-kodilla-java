package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void bicMacConfiguration(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.NO_SEZAM)
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredients(Ingredient.BACON)
                .ingredients(Ingredient.CHEESE)
                .ingredients(Ingredient.ONION)
                .build();
        //when & then
        Assertions.assertEquals(Bun.NO_SEZAM,bigmac.getBun());
        Assertions.assertEquals(3,bigmac.getIngredients().size());
        System.out.println(bigmac);
    }
}

package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    void testPizzaOrder(){
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SauceOrder(pizzaOrder);
        pizzaOrder = new ChilliPepperOrder(pizzaOrder);
        pizzaOrder = new ShrimpsOrder(pizzaOrder);
        //when
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals(new BigDecimal(40),cost);
        Assertions.assertEquals("Pizza with sauce, peppers, shrimps, ",description);

    }
}

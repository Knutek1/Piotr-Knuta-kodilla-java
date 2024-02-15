package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    @Test
    void testCalculations(){
        //Given
        double resultAdd = calculator.add(3.2,2.5);
        double resultSub =calculator.sub(3.2,2.5);
        double resultMul =calculator.mul(3.2,2.5);
        double resultDiv =calculator.div(3.2,2.5);
        //When & Then
        Assertions.assertEquals(5.7,resultAdd);
        Assertions.assertEquals(0.7,resultSub,0.01);
        Assertions.assertEquals(8,resultMul,0.01);
        Assertions.assertEquals(1.28,resultDiv,0.01);
    }

}

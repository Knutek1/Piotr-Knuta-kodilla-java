package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    @Test
    void boundaryConditionsWithX(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When & Then
        Assertions.assertThrows(Exception.class , ()->exceptionHandling.exceptionHandling(2,3));
        Assertions.assertThrows(Exception.class , ()->exceptionHandling.exceptionHandling(0.99,3));
        Assertions.assertDoesNotThrow(()->exceptionHandling.exceptionHandling(1,3));

    }
    @Test
    void withYAsOneAndHalf(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When & Then
        Assertions.assertThrows(Exception.class , ()->exceptionHandling.exceptionHandling(1.5,1.5));
        Assertions.assertDoesNotThrow(()->exceptionHandling.exceptionHandling(1.5,1.6));

    }
}

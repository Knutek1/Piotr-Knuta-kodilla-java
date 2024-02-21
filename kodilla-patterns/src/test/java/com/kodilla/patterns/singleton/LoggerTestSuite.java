package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void testLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("Otwarcie programu");
        //Then
        Assertions.assertEquals("Otwarcie programu",logger.getLastLog());
    }
}

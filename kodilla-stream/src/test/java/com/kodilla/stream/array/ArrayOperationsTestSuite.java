package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

private ArrayOperations arrayOperationsMock;
    @Test
    void testGetAverage(){
        //given
        int array[] = {1,3,5,7,9,-2,-4,-6,-8,-10,2,4,6,8,10,1,1,1,1,1};
        OperationsClass operationsClass = new OperationsClass();
        //when
        double average = operationsClass.getAverage(array);
        //then
        Assertions.assertEquals(1.5,average);
    };
}

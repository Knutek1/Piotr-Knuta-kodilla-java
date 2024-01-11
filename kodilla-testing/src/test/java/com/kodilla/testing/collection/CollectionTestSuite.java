package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @DisplayName("Checking if the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();

        if(one.exterminate(list).isEmpty()){
            System.out.println("Lista jest pusta");
        }
    }

    @DisplayName("Checking if the list is working properly")

    @Test
    void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(i);
        }
        System.out.println(one.exterminate(list));
    }

    @BeforeEach
    public void before() {
        System.out.println("Start ");
    }
    @AfterEach
    public void after() {
        System.out.println("Koniec ");
    }
}

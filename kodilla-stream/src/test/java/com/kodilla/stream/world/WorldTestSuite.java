package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test

    void testGetPeopleQuantity(){
        //given
        List <Country> countryEurope = new ArrayList<>();
        countryEurope.add(new Country("Polska",new BigDecimal("37000000")));
        countryEurope.add(new Country("Niemcy",new BigDecimal(80000000L)));
        countryEurope.add(new Country("Wielka Brytania",new BigDecimal(53000000)));
        List <Country> countryAsia = new ArrayList<>();
        countryAsia.add(new Country("Chiny",new BigDecimal("1400000000")));
        countryAsia.add(new Country("Indie",new BigDecimal("1450000000")));
        countryAsia.add(new Country("Pakistan",new BigDecimal(200000000)));
        List <Country> countryAmerica = new ArrayList<>();
        countryAmerica.add(new Country("Kanada",new BigDecimal("40000000")));
        countryAmerica.add(new Country("Indie",new BigDecimal("300000000")));
        countryAmerica.add(new Country("Meksyk",new BigDecimal(120000000)));
        List<Continent>listWorld = new ArrayList<>();
        listWorld.add(new Continent(countryAmerica));
        listWorld.add(new Continent(countryAsia));
        listWorld.add(new Continent(countryEurope));
        //when
        World world = new World(listWorld);
        BigDecimal totalPopulation = world.getPeopleQuantity();
        //then
        BigDecimal expectedPopulation = new BigDecimal(3680000000L);
        Assertions.assertEquals(expectedPopulation,totalPopulation);
    }
}

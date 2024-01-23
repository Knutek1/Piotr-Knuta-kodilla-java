package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List <Continent> continentList = new ArrayList<>();

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.countryList.stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO,(sum,current)->sum = sum.add(current));

    }
}

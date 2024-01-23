package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> countryList = new ArrayList<>();

    public Continent(List<Country> countryList) {
        this.countryList = countryList;
    }
}

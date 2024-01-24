package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String nameOfCountry;
    private final BigDecimal population;

    public Country(String nameOfCountry, BigDecimal population) {
        this.nameOfCountry = nameOfCountry;
        this.population = population;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return Objects.equals(nameOfCountry, country.nameOfCountry);
    }

    @Override
    public int hashCode() {
        return nameOfCountry != null ? nameOfCountry.hashCode() : 0;
    }
}

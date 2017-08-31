package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final Set<Country> countries = new HashSet<>();

    public Continent() {
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }
}

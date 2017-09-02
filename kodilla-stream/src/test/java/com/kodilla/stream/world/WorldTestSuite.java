package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
                //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent southAmerica = new Continent();
        Country country1 = new Country("Poland", BigDecimal.valueOf(38000000));
        Country country2 = new Country("Denmark", BigDecimal.valueOf(5700000));
        Country country3 = new Country("China", BigDecimal.valueOf(1300000000));
        Country country4 = new Country("Japan", BigDecimal.valueOf(127000000));
        Country country5 = new Country("Brazil", BigDecimal.valueOf(207700000));
        Country country6 = new Country("Argentina", BigDecimal.valueOf(43800000));

        europe.addCountry(country1);
        europe.addCountry(country2);
        asia.addCountry(country3);
        asia.addCountry(country4);
        southAmerica.addCountry(country5);
        southAmerica.addCountry(country6);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        //When
        BigDecimal expectedPopulation = BigDecimal.valueOf(1722200000);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        // Then
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }

}

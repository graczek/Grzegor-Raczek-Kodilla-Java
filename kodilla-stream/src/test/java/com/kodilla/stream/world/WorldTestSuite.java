package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        List<Country> europeContinentCountriesList = new ArrayList<>();
        List<Country> asiaContinentCountriesList = new ArrayList<>();
        List<Country> americaContinentCountriesList = new ArrayList<>();

        Country poland = new Country("Poland", new BigDecimal(38123456));
        Country germany = new Country("Germany", new BigDecimal(68123456));
        Country croatia = new Country("Croatia", new BigDecimal(18123456));

        europeContinentCountriesList.add(poland);
        europeContinentCountriesList.add(germany);
        europeContinentCountriesList.add(croatia);

        Country china = new Country("China", new BigDecimal(548123456));
        Country thailand = new Country("Thailand", new BigDecimal(61123456));
        Country cambodia = new Country("Cambodia", new BigDecimal(11123456));

        asiaContinentCountriesList.add(china);
        asiaContinentCountriesList.add(thailand);
        asiaContinentCountriesList.add(cambodia);

        Country usa = new Country("Spain", new BigDecimal(198123456));
        Country canada = new Country("Norway", new BigDecimal(81123456));
        Country mexico = new Country("Norway", new BigDecimal(91123456));

        americaContinentCountriesList.add(usa);
        americaContinentCountriesList.add(canada);
        americaContinentCountriesList.add(mexico);

        List<Continent> continentList = new ArrayList<>();

        Continent europe = new Continent(europeContinentCountriesList);
        Continent asia = new Continent(asiaContinentCountriesList);
        Continent america = new Continent(americaContinentCountriesList);

        continentList.add(europe);
        continentList.add(asia);
        continentList.add(america);

        World world = new World(continentList);

        //when
        BigDecimal totalWorldPopulation = world.getPeopleQuantity();

        //then
        Assert.assertEquals(3, continentList.size());
        Assert.assertEquals(3, europeContinentCountriesList.size());
        Assert.assertEquals(3, asiaContinentCountriesList.size());
        Assert.assertEquals(3, americaContinentCountriesList.size());
        Assert.assertEquals(new BigDecimal(1115111104), totalWorldPopulation);
    }
}

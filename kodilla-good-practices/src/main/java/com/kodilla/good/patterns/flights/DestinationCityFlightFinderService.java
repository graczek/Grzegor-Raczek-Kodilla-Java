package com.kodilla.good.patterns.flights;

import java.util.Map;

public class DestinationCityFlightFinderService implements FlightFinder {
    @Override
    public void findFlight(String city, Map<Integer, Flight> flightsMap) {
        flightsMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(c -> c.getDestination().equals(city))
                .forEach(System.out::println);


    }
}

package com.kodilla.good.patterns.flights;

import java.util.List;

public class DestinationCityFlightFinderService implements FlightFinder {
    @Override
    public void findFlight(String city, List<Flight> flightsList) {
        flightsList.stream()
                .filter(c -> c.getDestination().equals(city))
                .forEach(System.out::println);


    }
}

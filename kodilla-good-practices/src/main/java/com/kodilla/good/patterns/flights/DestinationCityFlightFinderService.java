package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class DestinationCityFlightFinderService implements FlightFinder {
    @Override
    public List<Flight>  findFlight(String city, List<Flight> flightsList) {
        return flightsList.stream()
                .filter(c -> c.getDestination().equals(city))
                .collect(Collectors.toList());


    }
}

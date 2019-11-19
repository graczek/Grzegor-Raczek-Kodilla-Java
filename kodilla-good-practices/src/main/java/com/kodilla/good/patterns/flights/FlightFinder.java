package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightFinder {
    List<Flight> findFlight(String city, List<Flight> flightsList);
}

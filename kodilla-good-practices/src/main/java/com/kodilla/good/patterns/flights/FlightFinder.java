package com.kodilla.good.patterns.flights;

import java.util.Map;

public interface FlightFinder {
    void findFlight(String city, Map<Integer, Flight> flightsMap);
}

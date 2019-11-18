package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightDB {

    private final Map<Integer, Flight> flightsMap = new HashMap<>();

    public Map<Integer, Flight> getFlightsMap() {
        return flightsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightDB flightDB = (FlightDB) o;

        return flightsMap.equals(flightDB.flightsMap);
    }

    @Override
    public int hashCode() {
        return flightsMap.hashCode();
    }

    @Override
    public String toString() {
        return "FlightDB{" +
                "flightsMap=" + flightsMap +
                '}';
    }
}

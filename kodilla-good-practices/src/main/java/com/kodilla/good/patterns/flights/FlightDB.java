package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightDB {

    private final List<Flight> flightsList = new ArrayList<>();

    public List<Flight> getFlightsList() {
        return flightsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightDB flightDB = (FlightDB) o;

        return flightsList.equals(flightDB.flightsList);
    }

    @Override
    public int hashCode() {
        return flightsList.hashCode();
    }

    @Override
    public String toString() {
        return "FlightDB{" +
                "flightsList=" + flightsList +
                '}';
    }
}

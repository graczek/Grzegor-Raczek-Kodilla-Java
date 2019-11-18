package com.kodilla.good.patterns.flights;

import java.util.Map;

public class FlightsDB {
    private final Map<String, String> flights;

    public Map<String, String> addFlight(Flight flight){
        flights.put(flight.getOrigin(), flight.getDestination());
        return flights;
    }

    public FlightsDB(Map<String, String> flights) {
        this.flights = flights;
    }

    public Map<String, String> getFlights() {
        return flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsDB flightsDB = (FlightsDB) o;

        return flights.equals(flightsDB.flights);
    }

    @Override
    public int hashCode() {
        return flights.hashCode();
    }

    @Override
    public String toString() {
        return "FlightsDB{" +
                "flights=" + flights +
                '}';
    }
}

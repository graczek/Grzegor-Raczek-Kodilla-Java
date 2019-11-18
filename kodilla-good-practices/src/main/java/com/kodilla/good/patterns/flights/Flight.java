package com.kodilla.good.patterns.flights;

public class Flight {
    private final String origin;
    private final String destination;

    public Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }



    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!origin.equals(flight.origin)) return false;
        return destination.equals(flight.destination);
    }

    @Override
    public int hashCode() {
        int result = origin.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}

package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlightsLogic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfFlights = new HashMap<>();

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        mapOfFlights.put("WRO", true);
        mapOfFlights.put("BCN", true);
        mapOfFlights.put("LHR", true);

        if((mapOfFlights.containsKey(departureAirport) && mapOfFlights.get(departureAirport).equals(true))
                || ((mapOfFlights.containsKey(arrivalAirport) && mapOfFlights.get(arrivalAirport).equals(true)))) {
            System.out.println("Flight is possible");

        } else {
            throw new RouteNotFoundException("Flight not possible.");
        }

    }
}

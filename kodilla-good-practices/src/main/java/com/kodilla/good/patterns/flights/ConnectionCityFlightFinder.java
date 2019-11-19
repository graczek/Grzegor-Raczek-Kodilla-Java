package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionCityFlightFinder {

    public void findFlight(String originCity, String destinationCity, List<Flight> flightsList) {

        List<Flight> allFlightsFromGivenOrigin = flightsList.stream()
                .filter(o -> o.getOrigin().equals(originCity))
                .collect(Collectors.toList());

        List<Flight> allFlightsToGivenDestination = flightsList.stream()
                .filter(c -> c.getDestination().equals(destinationCity))
                .collect(Collectors.toList());

        for (Flight flight1 : allFlightsFromGivenOrigin) {
            for(Flight flight2 : allFlightsToGivenDestination){
                if(flight1.getDestination().equals(flight2.getOrigin())) {
                    System.out.println("You can fly from: " + flight1.getOrigin() + " to "
                            + flight2.getDestination() + " via " + flight1.getDestination());
                }

            }

        }

    }
}

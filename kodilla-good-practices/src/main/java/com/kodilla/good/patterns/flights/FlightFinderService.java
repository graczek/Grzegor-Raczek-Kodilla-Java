package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFinderService {

    public List<Flight> findOriginFlights(String originCity, List<Flight> flightsList) {
        return flightsList.stream()
                .filter(c -> c.getOrigin().equals(originCity))
                .collect(Collectors.toList());

    }

    public List<Flight>  findDestinationFlights(String destinationCity, List<Flight> flightsList) {
        return flightsList.stream()
                .filter(c -> c.getDestination().equals(destinationCity))
                .collect(Collectors.toList());
    }

    List<Flight> findConnectionFlights(String originCity, String connectionCity, String destinationCity, List<Flight> flightsList){

        List<Flight> originFlights = findOriginFlights(originCity, flightsList);

        List<Flight> toConnectionFlights = originFlights.stream()
                .filter(f -> f.getDestination().equals(connectionCity))
                .collect(Collectors.toList());

        List<Flight> connectionToDestinationFlights = findOriginFlights(connectionCity, flightsList)
                .stream()
                .filter(f -> f.getDestination().equals(destinationCity))
                .collect(Collectors.toList());

        List<Flight> collectedFlights = Stream.of(toConnectionFlights, connectionToDestinationFlights)
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        return collectedFlights;
    }




}

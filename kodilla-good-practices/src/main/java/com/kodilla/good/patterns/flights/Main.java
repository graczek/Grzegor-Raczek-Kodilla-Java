package com.kodilla.good.patterns.flights;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("BCN", "WAW");
        Flight flight2 = new Flight("BCN", "WRO");
        Flight flight3 = new Flight("WAW", "HAV");
        Flight flight4 = new Flight("LHR", "BKK");
        Flight flight5 = new Flight("WAW", "LHR");
        Flight flight6 = new Flight("LHR", "LAX");
        Flight flight7 = new Flight("LAX", "DUB");
        Flight flight8 = new Flight("ATH", "WRO");
        Flight flight9 = new Flight("WRO", "BCN");

        FlightDB flightDB = new FlightDB();
        Map<Integer, Flight> flightsMap = flightDB.getFlightsMap();
        flightsMap.put(1, flight1);
        flightsMap.put(2, flight2);
        flightsMap.put(3, flight3);
        flightsMap.put(4, flight4);
        flightsMap.put(5, flight5);
        flightsMap.put(6, flight6);
        flightsMap.put(7, flight7);
        flightsMap.put(8, flight8);
        flightsMap.put(9, flight9);

        OriginCityFlightFinderService originCityFlightsFinder = new OriginCityFlightFinderService();
        originCityFlightsFinder.findFlight("WAW", flightsMap);

        DestinationCityFlightFinderService destinationCityFlightsFinder = new DestinationCityFlightFinderService();
        destinationCityFlightsFinder.findFlight("WRO", flightsMap);


    }
}

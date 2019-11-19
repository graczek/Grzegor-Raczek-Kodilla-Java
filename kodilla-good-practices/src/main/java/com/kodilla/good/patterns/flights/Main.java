package com.kodilla.good.patterns.flights;

import java.util.List;
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
        List<Flight> flightsList = flightDB.getFlightsList();
        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);
        flightsList.add(flight5);
        flightsList.add(flight6);
        flightsList.add(flight7);
        flightsList.add(flight8);
        flightsList.add(flight9);

        OriginCityFlightFinderService originCityFlightsFinder = new OriginCityFlightFinderService();
        originCityFlightsFinder.findFlight("WAW", flightsList);

        DestinationCityFlightFinderService destinationCityFlightsFinder = new DestinationCityFlightFinderService();
        destinationCityFlightsFinder.findFlight("WRO", flightsList);


    }
}

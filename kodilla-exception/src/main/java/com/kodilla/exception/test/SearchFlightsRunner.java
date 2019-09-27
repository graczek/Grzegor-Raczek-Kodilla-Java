package com.kodilla.exception.test;

public class SearchFlightsRunner {
    public static void main(String[] args) {

        Flight wroclawToBarcelona = new Flight("WRO", "BCN");
        Flight wroclawToHeathrow = new Flight("WRO", "LHR");
        Flight havanaToMoscow = new Flight("HAV", "SHV");

        SearchFlightsLogic logic = new SearchFlightsLogic();
        try {
            logic.findFlight(wroclawToBarcelona);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not available!");
        }

        try {
            logic.findFlight(havanaToMoscow);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not available!");
        }


    }
}

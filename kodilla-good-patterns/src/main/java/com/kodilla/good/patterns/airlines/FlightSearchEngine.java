package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private Flights flights;

    public FlightSearchEngine(Flights flights) {
        this.flights = flights;
    }

    public FlightSearchEngine() {
    }

    public List<String> getFligtsTo(String string){
        List<String> theResult = flights.getList().stream()
                .filter(f -> f.getArrivalAirport().equals(string))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());

        System.out.println("To " + string + " you can fly from " + theResult.size() + " cities:");
        theResult.stream()
                .forEach(System.out::println);

        return theResult;
    }

    public List<String> getFligtsFrom(String string){
        List<String> theResult = flights.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(string))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());

        System.out.println("From "+ string + " you can fly to " + theResult.size() + " cities:");
        theResult.stream()
                .forEach(System.out::println);

        return theResult;
    }

    public List<String> getFligtsWithTranfer(String from, String to) {
        List<Flight> theResultFrom = flights.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))


       }
}

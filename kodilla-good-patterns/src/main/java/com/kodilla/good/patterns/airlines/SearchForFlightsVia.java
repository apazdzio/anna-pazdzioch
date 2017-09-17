package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class SearchForFlightsVia implements SearchForFlights{

    private FlightList flightList;

    public SearchForFlightsVia(FlightList flightList) {
        this.flightList = flightList;
    }

    @Override
    public List<String> search(String string) {
        List<String> departures = flightList.getList().stream()
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());
        List<String> arrivals = flightList.getList().stream()
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());

        List<String> theResultTo = null;
        if (departures.contains(string) && arrivals.contains(string)) {
            List<String> theResultFrom = flightList.getList().stream()
                    .filter(f -> f.getArrivalAirport().equals(string))
                    .map(f -> f.getDepartureAirport())
                    .collect(Collectors.toList());
            theResultTo = flightList.getList().stream()
                    .filter(f -> f.getDepartureAirport().equals(string))
                    .map(f -> f.getArrivalAirport())
                    .collect(Collectors.toList());

            System.out.println("You can fly from " + show(theResultFrom) + " via " + string + " to: " + show(theResultTo));

        }else{
            System.out.println("There are no flights via " + string);
        }
        return theResultTo;
    }
}
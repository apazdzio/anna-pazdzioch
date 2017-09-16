package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class SearchForFlightsFrom implements SearchForFlights{

    private FlightList flightList;

    public SearchForFlightsFrom(FlightList flightList) {
        this.flightList = flightList;
    }

    @Override
    public List<String> search(String string) {
        List<String> theResult = flightList.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(string))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());

        System.out.println("From " + string + " you can fly to " + theResult.size() + " cities: " + show(theResult));

        return theResult;
    }
}

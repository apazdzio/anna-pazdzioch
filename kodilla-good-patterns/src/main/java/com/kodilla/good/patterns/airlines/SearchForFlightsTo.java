package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class SearchForFlightsTo implements SearchForFlights {

    private FlightList flightList;

    public SearchForFlightsTo(FlightList flightList) {
        this.flightList = flightList;
    }

    @Override
    public List<String> search(String string) {
        List<String> theResult = flightList.getList().stream()
                .filter(f -> f.getArrivalAirport().equals(string))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());

        System.out.println("To " + string + " you can fly from " + theResult.size() + " cities: " + show(theResult));

        return theResult;
    }
}
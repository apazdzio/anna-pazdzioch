package com.kodilla.exception.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class FlightSearcher {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Wroclaw", true);
        flightMap.put("Paris", true);
        flightMap.put("Vienna", true);
        flightMap.put("London", false);

        boolean isPossibleToFly = false;
        boolean isInMap = false;
        for (Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey())) {
                System.out.println("Can you fly to " + entry.getKey() + "? " + entry.getValue());
                isPossibleToFly = entry.getValue();
                isInMap = true;
            }
        };
        if(isInMap) {
            return isPossibleToFly;
        }
        throw new RouteNotFoundException("Direction not found");
    }
    public static void main(String[] args){
        Flight flight1 = new Flight("Warsaw", "Moscow");

        FlightSearcher flightSearcher = new FlightSearcher();
        try {
            flightSearcher.findFlight(flight1);

        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Date of last search: " + LocalDate.now());
        }
    }
}


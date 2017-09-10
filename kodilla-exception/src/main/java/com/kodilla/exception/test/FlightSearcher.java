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
        flightMap.put("Viena", true);
        flightMap.put("London", false);

        boolean isPossibleToFly = false;
        for (Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey())) {
                isPossibleToFly = entry.getValue();
            }
            throw new RouteNotFoundException("Direction not found");
        };
        return isPossibleToFly;

    }
    public static void main(String[] args){
        Flight flight1 = new Flight("Warsaw", "Paris");

        FlightSearcher flightSearcher = new FlightSearcher();
        try {
            flightSearcher.findFlight(flight1);

        } catch (RouteNotFoundException e) {
            System.out.println("Direction not found");
        } finally {
            System.out.println("Date of last search: " + LocalDate.now());
        }
    }
}


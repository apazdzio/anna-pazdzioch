package com.kodilla.exception.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
            flightMap.put("Wroclaw", true);
            flightMap.put("Paris", true);
            flightMap.put("Viena", true);
            flightMap.put("London", false);

            for (Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
                if (flight.getArrivalAirport().equals(entry.getKey())) {
                    System.out.println("Can I fly to " + entry.getKey() + "?  " + entry.getValue());
                }
                throw new RouteNotFoundException("Direction not found");
            }
    }
    public static void main(String[] args){
        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("Warsaw", "Moscow");
        FlightSearcher flightSearcher = new FlightSearcher();
        try {
            flightSearcher.findFlight(flight1);
            flightSearcher.findFlight(flight2);
            flightSearcher.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Direction not found");
        } finally {
            System.out.println("Date of last search: " + LocalDate.now());
        }
    }
}


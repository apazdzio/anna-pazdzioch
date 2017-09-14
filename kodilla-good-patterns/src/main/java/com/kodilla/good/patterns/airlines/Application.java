package com.kodilla.good.patterns.airlines;

public class Application {

    public static void main(String[] args){
        Flights flights = new Flights();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flights);
        flightSearchEngine.getFligtsTo("Wroclaw");
        flightSearchEngine.getFligtsFrom("Cracow");
    }
}

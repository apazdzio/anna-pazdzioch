package com.kodilla.good.patterns.airlines;

public class Application {

    public static void main(String[] args){
        FlightList flightList = new FlightList();
        FlightSearchEngine flightSearchEngineFrom = new FlightSearchEngine(new SearchForFlightsFrom(flightList));
        FlightSearchEngine flightSearchEngineTo = new FlightSearchEngine(new SearchForFlightsTo(flightList));
        FlightSearchEngine flightSearchEngineVia = new FlightSearchEngine(new SearchForFlightsVia(flightList));
        flightSearchEngineTo.find("Wroclaw");
        flightSearchEngineFrom.find("Cracow");
        flightSearchEngineVia.find("Cracow");
    }
}

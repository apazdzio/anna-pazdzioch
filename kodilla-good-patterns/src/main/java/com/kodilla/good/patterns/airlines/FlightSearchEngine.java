package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private SearchForFlights searchForFlights;

    public FlightSearchEngine(SearchForFlights searchForFlights) {
        this.searchForFlights = searchForFlights;
    }

    public List<String> find(String string){

        return searchForFlights.search(string);
    }
}

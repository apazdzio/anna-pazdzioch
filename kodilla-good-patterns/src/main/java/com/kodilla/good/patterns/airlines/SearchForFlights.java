package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public interface SearchForFlights {

    List<String> search(String string);

    default String show(List<String> theList){
        return theList.stream()
                .collect(Collectors.joining(","));
    }
}

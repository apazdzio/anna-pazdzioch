package com.kodilla.good.patterns.airlines;


import java.util.ArrayList;
import java.util.List;

public final class Flights {

    private final List<Flight> theList = new ArrayList<>();

    public Flights() {
        theList.add(new Flight("Warsaw", "Wroclaw"));
        theList.add(new Flight("Warsaw", "Gdansk"));
        theList.add(new Flight("Warsaw", "Cracow"));
        theList.add(new Flight("Warsaw", "Poznan"));
        theList.add(new Flight("Cracow", "Wroclaw"));
        theList.add(new Flight("Cracow", "Poznan"));
        theList.add(new Flight("Cracow", "Gdansk"));
        theList.add(new Flight("Cracow", "Warsaw"));
    }

    public List<Flight> getList() {
        return new ArrayList<Flight>(theList);
    }
  }

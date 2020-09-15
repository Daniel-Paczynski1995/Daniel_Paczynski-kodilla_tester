package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Moskwa", "London"));
        flights.add(new Flight("Barcelona", "Berlin"));
        flights.add(new Flight("Los Angeles", "Las Vegas"));
        return flights;
    }
}




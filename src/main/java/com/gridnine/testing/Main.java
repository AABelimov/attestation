package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        System.out.println("Все перелеты:");
        System.out.println(flights);
        System.out.println();

        System.out.println("Исключены перелеты с временем вылета меньше чем текущее:");
        System.out.println(FlightService.getUpcomingFlights(flights));
        System.out.println();

        System.out.println("Исключены перелеты, в которых есть сегмент с датой прилета раньше даты вылета:");
        System.out.println(FlightService.getFlightsWhereArrivalDateAfterDepartureDate(flights));
        System.out.println();

        System.out.println("Исключены перелеты, где общее время, проведённое на земле, превышает два часа:");
        System.out.println(FlightService.getFlightsWhereTheTimeSpentOnTheGroundNoMoreThanTwoHours(flights));
    }
}
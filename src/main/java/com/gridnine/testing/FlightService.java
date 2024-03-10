package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    // Исключить перелеты с временем вылета меньше чем текущее
    public static List<Flight> getUpcomingFlights(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now()))
                .collect(Collectors.toList());
    }

    // Исключить перелеты, в которых есть сегмент с датой прилета раньше даты вылета
    public static List<Flight> getFlightsWhereArrivalDateAfterDepartureDate(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }

    // Исключить перелеты, где общее время, проведённое на земле, превышает два часа
    public static List<Flight> getFlightsWhereTheTimeSpentOnTheGroundNoMoreThanTwoHours(List<Flight> flights) {
        List<Flight> copy = new ArrayList<>(flights);
        copy.removeIf(flight -> {
            List<Segment> segments = flight.getSegments();
            Duration duration = Duration.ZERO;

            for (int i = 0; i < segments.size() - 1; i++) {
                duration = duration.plus(Duration.between(segments.get(i).getArrivalDate(), segments.get(i + 1).getDepartureDate()));
            }

            return duration.toHours() > 2;
        });
        return copy;
    }
}

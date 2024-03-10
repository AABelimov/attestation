package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.gridnine.constants.Constants.*;

class FlightServiceTest {

    @Test
    void testGetUpcomingFlights() {
        List<Flight> actual = FlightService.getUpcomingFlights(INCOMING_DATA);

        assertIterableEquals(EXPECTED_UPCOMING_FLIGHTS, actual);
    }

    @Test
    void testGetFlightsWhereArrivalDateAfterDepartureDate() {
        List<Flight> actual = FlightService.getFlightsWhereArrivalDateAfterDepartureDate(INCOMING_DATA);

        assertIterableEquals(EXPECTED_FLIGHTS_WHERE_ARRIVAL_DATE_AFTER_DEPARTURE_DATE, actual);
    }

    @Test
    void testGetFlightsWhereTheTimeSpentOnTheGroundNoMoreThanTwoHours() {
        List<Flight> actual = FlightService.getFlightsWhereTheTimeSpentOnTheGroundNoMoreThanTwoHours(INCOMING_DATA);

        assertIterableEquals(EXPECTED_FLIGHTS_WHERE_THE_TIME_SPENT_ON_THE_GROUND_NO_MORE_THAN_TWO_HOURS, actual);
    }
}
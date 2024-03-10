package com.gridnine.constants;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.now().plusDays(3);
    public static final LocalDateTime LOCAL_DATE_TIME_1 = LOCAL_DATE_TIME;
    public static final LocalDateTime LOCAL_DATE_TIME_2 = LOCAL_DATE_TIME.plusHours(2);
    public static final LocalDateTime LOCAL_DATE_TIME_3 = LOCAL_DATE_TIME.plusHours(3);
    public static final LocalDateTime LOCAL_DATE_TIME_4 = LOCAL_DATE_TIME.plusHours(4);
    public static final LocalDateTime LOCAL_DATE_TIME_5 = LOCAL_DATE_TIME.plusHours(5);
    public static final LocalDateTime LOCAL_DATE_TIME_6 = LOCAL_DATE_TIME.plusHours(6);
    public static final LocalDateTime LOCAL_DATE_TIME_7 = LOCAL_DATE_TIME.minusHours(6);
    public static final LocalDateTime LOCAL_DATE_TIME_8 = LOCAL_DATE_TIME.plusHours(7);
    public static final LocalDateTime LOCAL_DATE_TIME_9 = LOCAL_DATE_TIME.minusDays(6);
    public static final Segment SEGMENT_1 = new Segment(LOCAL_DATE_TIME_1, LOCAL_DATE_TIME_2);
    public static final Segment SEGMENT_2 = new Segment(LOCAL_DATE_TIME_3, LOCAL_DATE_TIME_5);
    public static final Segment SEGMENT_3 = new Segment(LOCAL_DATE_TIME_9, LOCAL_DATE_TIME_1);
    public static final Segment SEGMENT_4 = new Segment(LOCAL_DATE_TIME_1, LOCAL_DATE_TIME_7);
    public static final Segment SEGMENT_5 = new Segment(LOCAL_DATE_TIME_5, LOCAL_DATE_TIME_6);
    public static final Segment SEGMENT_6 = new Segment(LOCAL_DATE_TIME_3, LOCAL_DATE_TIME_4);
    public static final Segment SEGMENT_7 = new Segment(LOCAL_DATE_TIME_6, LOCAL_DATE_TIME_8);
    public static final List<Segment> SEGMENTS_1 = new ArrayList<>(List.of(SEGMENT_1));
    public static final List<Segment> SEGMENTS_2 = new ArrayList<>(List.of(SEGMENT_1, SEGMENT_2));
    public static final List<Segment> SEGMENTS_3 = new ArrayList<>(List.of(SEGMENT_3));
    public static final List<Segment> SEGMENTS_4 = new ArrayList<>(List.of(SEGMENT_4));
    public static final List<Segment> SEGMENTS_5 = new ArrayList<>(List.of(SEGMENT_1, SEGMENT_5));
    public static final List<Segment> SEGMENTS_6 = new ArrayList<>(List.of(SEGMENT_1, SEGMENT_6, SEGMENT_7));
    public static final Flight FLIGHT_1 = new Flight(SEGMENTS_1);
    public static final Flight FLIGHT_2 = new Flight(SEGMENTS_2);
    public static final Flight FLIGHT_3 = new Flight(SEGMENTS_3);
    public static final Flight FLIGHT_4 = new Flight(SEGMENTS_4);
    public static final Flight FLIGHT_5 = new Flight(SEGMENTS_5);
    public static final Flight FLIGHT_6 = new Flight(SEGMENTS_6);
    public static final List<Flight> INCOMING_DATA = new ArrayList<>(List.of(
            FLIGHT_1,
            FLIGHT_2,
            FLIGHT_3,
            FLIGHT_4,
            FLIGHT_5,
            FLIGHT_6
    ));
    public static final List<Flight> EXPECTED_UPCOMING_FLIGHTS = new ArrayList<>(List.of(
            FLIGHT_1,
            FLIGHT_2,
            FLIGHT_4,
            FLIGHT_5,
            FLIGHT_6
    ));
    public static final List<Flight> EXPECTED_FLIGHTS_WHERE_ARRIVAL_DATE_AFTER_DEPARTURE_DATE = new ArrayList<>(List.of(
            FLIGHT_1,
            FLIGHT_2,
            FLIGHT_3,
            FLIGHT_5,
            FLIGHT_6
    ));
    public static final List<Flight> EXPECTED_FLIGHTS_WHERE_THE_TIME_SPENT_ON_THE_GROUND_NO_MORE_THAN_TWO_HOURS = new ArrayList<>(List.of(
            FLIGHT_1,
            FLIGHT_2,
            FLIGHT_3,
            FLIGHT_4
    ));
}

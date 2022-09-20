package daoPattern.service;

import daoPattern.dao.FlightCollection;
import daoPattern.model.Booking;

import java.io.IOException;
import java.util.Map;

public class BookingService {


    Booking bookModel = new Booking();
    public String destination;
    FlightCollection flightCollection = new FlightCollection();


    public void bookTicket() throws IOException {
        //  System.out.println(destination.toUpperCase());
        for (Map.Entry<Integer, String> entry : flightCollection.getFlightsFromDB().entrySet()) {
            Object key = entry.getKey();
            String value = entry.getValue();

            if (value.contains(destination.toUpperCase()) && !value.contains("KIEV")) {
                System.out.println(key + " " + "-" + " " + value);
            }
            }


        }
    }







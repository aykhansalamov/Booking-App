import daoPattern.controller.BookingController;
import daoPattern.dao.FlightCollection;
import daoPattern.service.BookingService;
import daoPattern.service.FlightService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Start start = new Start();
        BookingController bookingController = new BookingController();
        FlightService flightService = new FlightService();
        FlightCollection flightCollection = new FlightCollection();
        BookingService bookingService = new BookingService();
       // System.out.println(flightCollection.getFlightsFromDB());
       // bookingService.bookTicket();
      //  System.out.println(flightService.createAllFlights());
      //   flightCollection.putFlightsToDB();
        bookingController.bookFlight();
     // start.userInput();
      //  SignUp signUp = new SignUp ();
       // signUp.saveUser();
      //  System.out.println(flightCollection.getFlightsFromDB());
    }
}

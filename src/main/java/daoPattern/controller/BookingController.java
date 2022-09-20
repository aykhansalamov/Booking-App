package daoPattern.controller;

import daoPattern.model.Booking;
import daoPattern.service.BookingService;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class BookingController {
    BookingService bookingService = new BookingService();
    Booking bookModel = new Booking();


    public void bookFlight () throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter needed information below for booking the flight:");
        System.out.println("Destination:");
       bookModel.destination = sc.nextLine();
        bookingService.destination = valueOf(bookModel.destination.toUpperCase());
      // bookModel.destination.toUpperCase();
      //  System.out.println(bookModel.destination);
       bookingService.bookTicket();
//        System.out.println("Date (dd.MM.yyyy):");
//        this.date = sc.nextLine();
//        System.out.println("Number of people (tickets):");
//        this.amount = sc.nextInt();
    }

}

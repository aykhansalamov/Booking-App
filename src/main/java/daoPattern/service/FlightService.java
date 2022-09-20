package daoPattern.service;

import daoPattern.controller.FlightController;
import daoPattern.dao.FlightCollection;
import daoPattern.model.Flight;
import lombok.Data;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static jdk.nashorn.internal.objects.NativeString.valueOf;


@Data
public class FlightService {
    Flight flight = new Flight();
    FlightCollection flightCollection = new FlightCollection();
    static FlightController controller = new FlightController();
    static Map<Object, Object> citiesMap = new HashMap<Object, Object>();
    static Object startingCity = new Object();

    static Map<Object, Object> allFlights = new HashMap<Object, Object>();
    static List<Integer> freeSeats = new ArrayList<>();
    static Object singleFlight = new Object();
    HashMap<Integer, String> flighList;

//    {
//        try {
//            flighList = (HashMap<Integer, String>) FlightCollection.getFlightsFromDB();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public FlightService() {
    }

    //Generating random time into next 24 hours
    public static String randomTime() {
        Long secondsOfDay = Duration.ofDays(1).getSeconds();
        Long randomSeconds = ThreadLocalRandom.current().nextLong(secondsOfDay + 1);
        String format = "HH:mm - dd.MM.yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);

        return dateTimeFormatter.format(LocalDateTime.now().plusSeconds(randomSeconds));
    }

    //Printing headline for the flight list
    public void headline() {
        System.out.println("ID" + "     TIME & DATE     " + "       FROM     " + "        TO     " + "    FREE SEATS");
    }

    public void flightObject() {


    }

    // Creating list of all flights
    public static Map<Integer, Object> createAllFlights() {
        // Object of destination points
        citiesMap = (Map<Object, Object>) controller.city();
        // Object of start point - Kiev
        startingCity = controller.startCity();
        // Map of flight id and flight (time, start point, destination point) object
        Map<Integer, Object> flightsWithId = new HashMap<>();
        // Creating new objects (flights) with random time and adding flight id

        Integer id = 1;
        for (Map.Entry<Object, Object> entry : citiesMap.entrySet()) {

            Object key = entry.getKey();
            Object value = entry.getValue();
            freeSeats.add(180);
            singleFlight = valueOf(randomTime() + " " + "-" + " " + startingCity + " " + "-" + " " + key + "," + " " + value + " " + "-" + " " + freeSeats.get(freeSeats.size() - 1) + "\n");
            flightsWithId.put(id, singleFlight);
            id++;

        }

        return flightsWithId;

    }

    // Printing list of all flights
    public void printFlightList() throws IOException {
        for (Map.Entry<Integer, String> entry : flightCollection.getFlightsFromDB().entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " " + "-" + " " + value);

        }
    }

    public void searchFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter flight ID to see full information: ");
        int selectedFlightID = sc.nextInt();
        if (flighList.containsKey(selectedFlightID)) {
            System.out.println("    TIME & DATE  " + "         FROM     " + "         TO     " + "    FREE SEATS");
            System.out.println(flighList.get(selectedFlightID));
        }


    }
//    public void flightInfo() {
//
//        System.out.println("Please enter flight ID which you want to get information about:");
//        Scanner sc = new Scanner(System.in);
//        Integer enteredFlightId = sc.nextInt();
//       if(enteredFlightId == )
//
//      }
//    public void createMapOfSeats () {
//        for (int i = 0; i < 31; i++) {
//            flightsWithSeats.put()
//            flightCollection.getFlightsFromDB()
//            for (Map.Entry<Object, Object> entry : allFlights.entrySet()) {
//                Object key = entry.getKey();
//                Object value = entry.getValue();
//                System.out.println(key + " " + "-" + " " + value);
//
//            }
  //   }
    }
//}

package daoPattern.dao;

import daoPattern.service.FlightService;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightCollection implements FlightDao {

    static FlightService flightService = new FlightService();
    public static Map<Integer, String> flightsFromDB;

    public static void putFlightsToDB() throws IOException {

        String fileName = "flights.txt";
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(flightService.createAllFlights()));
        writer.close();
    }

    public static Map<Integer, String> getFlightsFromDB() throws IOException {
        flightsFromDB = new HashMap<>();
        String fileName = "flights.txt";
        File file = new File(fileName);
        ArrayList<String> fl = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String str;

            while ((line = br.readLine()) != null) {
                str = line.substring(1);
                fl.add(str);
            }

            fl.remove(31);
            String st = fl.get(0).substring(2);

            flightsFromDB.put(1, st);
            for (int i = 1; i < 9; i++) {
                String s = fl.get(i).substring(3);

                flightsFromDB.put(i + 1, s);
            }
            for (int i = 9; i < fl.toArray().length; i++) {
                String s1 = fl.get(i).substring(4);

                flightsFromDB.put(i + 1, s1);
            }
        }
       return flightsFromDB;
    }
}

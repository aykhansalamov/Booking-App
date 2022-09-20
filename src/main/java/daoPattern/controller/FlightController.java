package daoPattern.controller;

import enums.Airport;
import enums.City;
import enums.Country;

import java.util.HashMap;
import java.util.Map;

public class FlightController {


    //Cities of destination
    public static final Object city() {
        Map<City, Country> cities = new HashMap<>();

        cities.put(City.BAKU, Country.AZERBAIJAN);
        cities.put(City.VIENNA, Country.AUSTRIA);
        cities.put(City.BRUSSELS, Country.BELGIUM);
        cities.put(City.TORONTO, Country.CANADA);
        cities.put(City.PULA, Country.CROATIA);
        cities.put(City.SPLIT, Country.CROATIA);
        cities.put(City.LARNACA, Country.CYPRUS);
        cities.put(City.PRAGUE, Country.CZECHIA);
        cities.put(City.COPANHAGEN, Country.DENMARK);
        cities.put(City.CAIRO, Country.EGYPT);
        cities.put(City.PARIS, Country.FRANCE);
        cities.put(City.TBILISI, Country.GEORGIA);
        cities.put(City.DUSSELDORF, Country.GERMANY);
        cities.put(City.MUNICH, Country.GERMANY);
        cities.put(City.ATHENS, Country.GREECE);
        cities.put(City.BUDAPEST, Country.HUNGARY);
        cities.put(City.NEW_DELHI, Country.INDIA);
        cities.put(City.TEL_AVIV, Country.ISRAEL);
        cities.put(City.MILAN, Country.ITALY);
        cities.put(City.ROME, Country.ITALY);
        cities.put(City.TIVAT, Country.MONTENEGRO);
        cities.put(City.AMSTERDAM, Country.NETHERLAND);
        cities.put(City.OSLO, Country.NORWAY);
        cities.put(City.WARSAW, Country.POLAND);
        cities.put(City.BARCELONA, Country.SPAIN);
        cities.put(City.MADRID, Country.SPAIN);
        cities.put(City.STOCKOLM, Country.SWEDEN);
        cities.put(City.GENEVA, Country.SWITZERLAND);
        cities.put(City.ZURICH, Country.SWITZERLAND);
        cities.put(City.ISTANBUL, Country.TURKIYE);
        cities.put(City.LONDON, Country.UK);
        return cities;
    }

    //Airports' IATA codes
    public static final Object airport() {
        Map<Airport, City> airports = new HashMap<>();

        airports.put(Airport.GYD, City.BAKU);
        airports.put(Airport.VIE, City.VIENNA);
        airports.put(Airport.BRU, City.BRUSSELS);
        airports.put(Airport.YYZ, City.TORONTO);
        airports.put(Airport.PUY, City.PULA);
        airports.put(Airport.SPU, City.SPLIT);
        airports.put(Airport.LCA, City.LARNACA);
        airports.put(Airport.PRG, City.PRAGUE);
        airports.put(Airport.CPH, City.COPANHAGEN);
        airports.put(Airport.CAI, City.CAIRO);
        airports.put(Airport.CDG, City.PARIS);
        airports.put(Airport.TBS, City.TBILISI);
        airports.put(Airport.DUS, City.DUSSELDORF);
        airports.put(Airport.MUC, City.MUNICH);
        airports.put(Airport.ATH, City.ATHENS);
        airports.put(Airport.BUD, City.BUDAPEST);
        airports.put(Airport.DEL, City.NEW_DELHI);
        airports.put(Airport.TLV, City.TEL_AVIV);
        airports.put(Airport.MXP, City.MILAN);
        airports.put(Airport.FCO, City.ROME);
        airports.put(Airport.TIV, City.TIVAT);
        airports.put(Airport.AMS, City.AMSTERDAM);
        airports.put(Airport.OSL, City.OSLO);
        airports.put(Airport.WAW, City.WARSAW);
        airports.put(Airport.BCN, City.BARCELONA);
        airports.put(Airport.MAD, City.MADRID);
        airports.put(Airport.ARN, City.STOCKOLM);
        airports.put(Airport.GVA, City.GENEVA);
        airports.put(Airport.ZRH, City.ZURICH);
        airports.put(Airport.IST, City.ISTANBUL);
        airports.put(Airport.LHR, City.LONDON);
        return airports;
    }

    // Seat counts of each airplane
    public static final Object airplane() {
        Map<Airport, Integer> airplanes = new HashMap<>();
        airplanes.put(Airport.GYD, 180);
        airplanes.put(Airport.VIE, 180);
        airplanes.put(Airport.BRU, 180);
        airplanes.put(Airport.YYZ, 180);
        airplanes.put(Airport.PUY, 180);
        airplanes.put(Airport.SPU, 180);
        airplanes.put(Airport.LCA, 180);
        airplanes.put(Airport.PRG, 180);
        airplanes.put(Airport.CPH, 180);
        airplanes.put(Airport.CAI, 180);
        airplanes.put(Airport.CDG, 180);
        airplanes.put(Airport.TBS, 180);
        airplanes.put(Airport.DUS, 180);
        airplanes.put(Airport.MUC, 180);
        airplanes.put(Airport.ATH, 180);
        airplanes.put(Airport.BUD, 180);
        airplanes.put(Airport.DEL, 180);
        airplanes.put(Airport.TLV, 180);
        airplanes.put(Airport.MXP, 180);
        airplanes.put(Airport.FCO, 180);
        airplanes.put(Airport.TIV, 180);
        airplanes.put(Airport.AMS, 180);
        airplanes.put(Airport.OSL, 180);
        airplanes.put(Airport.WAW, 180);
        airplanes.put(Airport.BCN, 180);
        airplanes.put(Airport.MAD, 180);
        airplanes.put(Airport.ARN, 180);
        airplanes.put(Airport.GVA, 180);
        airplanes.put(Airport.ZRH, 180);
        airplanes.put(Airport.IST, 180);
        airplanes.put(Airport.LHR, 180);

        return airplanes;
    }

    //Start city - Kiev as an object
    public static final Object startCity () {
         Object startPoint = "KIEV, UKRAINE";
         return startPoint;
    }
}

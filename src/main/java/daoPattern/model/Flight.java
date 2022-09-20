package daoPattern.model;

import enums.Airport;
import enums.City;
import lombok.Data;

import java.util.Map;
@Data
public class Flight {
    private Object startPoint;
    private Map<Object, Object> citiesMap;
    private Map<Airport, City> airports;
    private Map<Airport, Integer> airplanes;
    private Object flights;

}


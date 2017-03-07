/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Håkon
 */
public class FlightRegister
{
    private HashMap<String, Flight> flights;
    
    public FlightRegister()
    {
        this.flights = new HashMap<>();
    }
    
    public void addFlight(String flightID, Flight flight)
    {
        this.flights.put(flightID, flight);
    }
    
    public void listAllFlights()
    {
        System.out.println(flights.keySet());
    }
    
    public Flight getFlightByID(String flightID)
    {
        //TODO: hent ut den aktuelle flighten
        return flights.get(flightID);
    }
    
    public String listFlightsByDestination(String destination)
    {
        String returnString = "";
        for (Flight flight : this.flights.values())
        {
            if (flight.getDestinationAirport().equals(destination))
            {
                returnString += " " + flight.getFlightID();
            }
        }
        return returnString;
    }

}

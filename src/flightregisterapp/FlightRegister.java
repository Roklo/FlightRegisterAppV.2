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

    public Set getAllFlights()
    {
        return flights.keySet();
    }

    public Flight getFlightByID(String flightID)
    {
        return flights.get(flightID);
    }

    public String getFlightsByDestination(String destination)
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

    public String getFlightsFromAirport(String airport)
    {
        String returnString = "";
        for (Flight flight : this.flights.values())
        {
            if (flight.getDestinationAirport().equals(airport))
            {
                returnString += " " + flight.getFlightID();
            }
        }
        return returnString;
    }

}

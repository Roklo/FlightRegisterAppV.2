/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Håkon
 */
public class FlightRegister
{

    private HashSet<Flight> flights;

    public FlightRegister()
    {
        this.flights = new HashSet<>();
    }

    public void addFlight(Flight flight)
    {
        this.flights.add(flight);
    }
    
    public void removeFlight(Flight flight)
    {
        this.flights.remove(flight);
    }

    public Iterator<Flight> getFlightRegIterator()
    {
        return flights.iterator();
    }
}
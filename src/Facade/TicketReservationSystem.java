/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import flightregisterapp.Flight;
import flightregisterapp.FlightRegister;
import flightregisterapp.Passenger;
import flightregisterapp.PassengerRegister;
import flightregisterapp.Seat;
import flightregisterapp.SeatRegister;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Håkon
 */
public class TicketReservationSystem
{

    private PassengerRegister passengers;
    private FlightRegister flights;
    private SeatRegister seats;

    public TicketReservationSystem()
    {
        passengers = new PassengerRegister();
        flights = new FlightRegister();
        seats = new SeatRegister();
    }

    public void addPassenger(Passenger pas)
    {
        this.passengers.addPassenger(pas);
    }
    
    public void addFlight(Flight flight)
    {
        this.flights.addFlight(flight);
    }
    
    public Passenger getPassengerByLastName(String lastName)
    {
        boolean searching = true;
        Passenger passenger = null;
        Iterator<Passenger> it = passengers.getPassengerRegIterator();
        while (it.hasNext() && searching)
        {
            passenger = it.next();
            if (passenger.getLastName().equals(lastName))
            {
                searching = false;
            }
        }
        return passenger;
    }

    public Flight getFlightByID(String flightID)
    {
        boolean searching = true;
        Flight flight = null;
        Iterator<Flight> it = this.flights.getFlightRegIterator();
        while (it.hasNext() && searching)
        {
            flight = it.next();
            if (flight.getFlightID().equals(flightID))
            {
                searching = false;
            }
        }
        return flight;
    }

    public Set getAllFlights()
    {
        Set flightsToReturn = null;
        Flight flight = null;
        Iterator<Flight> it = this.flights.getFlightRegIterator();
        while (it.hasNext())
        {
            flight = it.next();
            if (flight != null)
            {
                flightsToReturn.add(flight);
            }
        }
        return flightsToReturn;
    }

    public Set getAllFlightsByDestination(String destination)
    {
        Set flightsToReturn = null;
        Flight flight = null;
        Iterator<Flight> it = this.flights.getFlightRegIterator();
        while (it.hasNext())
        {
            flight = it.next();
            if (flight.getDestinationAirport().equals(destination))
            {
                flightsToReturn.add(flight);
            }
        }
        return flightsToReturn;
    }

    public Seat getSeatByID(Flight flight, String seatID)
    {
        boolean searching = true;
        Seat seat = null;
        Iterator<Seat> it = flight.getSeats().getSeatRegIterator();
        while (it.hasNext() && searching)
        {
            seat = it.next();
            if (seat.getSeatId().equals(seatID))
            {
                searching = false;
            }
        }
        return seat;
    }

    public Set getSeats(Flight flight)
    {
        Set seatsToReturn = null;
        Seat seat = null;
        Iterator<Seat> it = flight.getSeats().getSeatRegIterator();
        while (it.hasNext())
        {
            seat = it.next();
            if (seat != null)
            {
                seatsToReturn.add(seat);
            }
        }
        return seatsToReturn;
    }

    public void setSeatToUnavailable(Seat seat)
    {
        seat.setUnavailable();
    }
}

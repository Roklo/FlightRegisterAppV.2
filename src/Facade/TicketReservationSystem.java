package Facade;

import flightregisterapp.Flight;
import flightregisterapp.FlightRegister;
import flightregisterapp.Passenger;
import flightregisterapp.PassengerRegister;
import flightregisterapp.Seat;
import flightregisterapp.SeatRegister;
import flightregisterapp.Ticket;
import flightregisterapp.TicketRegister;
import java.util.Iterator;

/**
 * The TicketReservationSystem class represents the connection between the UI
 * (User Interface) and the entity classes. It handles most of the tasks needed
 * for the system to work, and deligates the tasks to the right places.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class TicketReservationSystem
{

    private PassengerRegister passengers;
    private FlightRegister flights;
    private TicketRegister tickets;

    /**
     * Constructor for objects of class TicketReservationSystem. Creates a
     * register for passengers and flights.
     *
     */
    public TicketReservationSystem()
    {
        this.passengers = new PassengerRegister();
        this.flights = new FlightRegister();
        this.tickets = new TicketRegister();
    }

    /**
     * Adds the given passenger to the passenger register.
     *
     * @param pas The passenger to be added.
     */
    public void addPassenger(Passenger pas)
    {
        this.passengers.addPassenger(pas);
    }

    /**
     * Adds the given flight to the flight register.
     *
     * @param flight The flight to be added.
     */
    public void addFlight(Flight flight)
    {
        this.flights.addFlight(flight);
    }

    /**
     * Adds the given ticket to the ticket register.
     *
     * @param ticket The ticket to be added.
     */
    public void addTicket(Ticket ticket)
    {
        this.tickets.addTicket(ticket);
    }

    /**
     * Returns a passenger by the given surname.
     *
     * @param lastName The surname of the passenger to be searched for.
     * @return The found passenger.
     */
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

    /**
     * Returns a flight by the given flight ID.
     *
     * @param flightID The flight ID of the flight to be searched for.
     * @return The found flight.
     */
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

    /**
     * Returns a string of all the flights in the flight register.
     *
     * @return All the flights in the flight register.
     */
    public String getAllFlights()
    {
        String flightsToReturn = "";
        Flight flight = null;
        Iterator<Flight> it = this.flights.getFlightRegIterator();
        while (it.hasNext())
        {
            flight = it.next();
            if (flight != null)
            {
                flightsToReturn += flight.getFlightID() + " ";
            }
        }
        return flightsToReturn;
    }

    /**
     * Returns a string of all the flights by a given destination.
     *
     * @param destination The given destination to be searched for.
     * @return All the flights by the given destination.
     */
    public String getAllFlightsByDestination(String destination)
    {
        String flightsToReturn = "";
        Flight flight = null;
        Iterator<Flight> it = this.flights.getFlightRegIterator();
        while (it.hasNext())
        {
            flight = it.next();
            if (flight.getDestinationAirport().equals(destination))
            {
                flightsToReturn += flight.getFlightID() + " ";
            }
        }
        return flightsToReturn;
    }

    /**
     * Returns a seat from the given flight and seat ID.
     *
     * @param flight The flight where the seat is located.
     * @param seatID The seat to be returned.
     * @return The given seat of the flight.
     */
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

    /**
     * Returns a string of all the seats in a given flight.
     *
     * @param flight The flight where the seats are located.
     * @return All the seats within the flight.
     */
    public String getSeats(Flight flight)
    {
        String seatsToReturn = "";
        Seat seat = null;
        Iterator<Seat> it = flight.getSeats().getSeatRegIterator();
        while (it.hasNext())
        {
            seat = it.next();
            if (seat != null)
            {
                seatsToReturn += seat.getSeatId() + " ";
            }
        }
        return seatsToReturn;
    }

    /**
     * Sets the given seat to be unavailable.
     *
     * @param seat The given seat.
     */
    public void setSeatToUnavailable(Seat seat)
    {
        seat.setUnavailable();
    }

    /**
     * Returns a string of all the passengers within the given flight.
     *
     * @param flight The given flight.
     * @return All the passengers within the flight.
     */
    public String getPassengersInFlight(Flight flight)
    {
        String passengersToReturn = "";
        Passenger pas = null;
        Iterator<Passenger> it = flight.getPassRegIterator();
        while (it.hasNext())
        {
            pas = it.next();
            if (pas != null)
            {
                passengersToReturn += pas.getFirstName() + " "
                        + pas.getLastName() + ", ";
            }
        }
        return passengersToReturn;
    }

}

package facade;

import entity.Flight;
import entity.FlightRegister;
import entity.Passenger;
import entity.Person;
import entity.PersonRegister;
import entity.Seat;
import entity.SeatRegister;
import entity.Ticket;
import entity.TicketRegister;
import entity.Pilot;
import entity.CabinCrew;

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

    private PersonRegister persons;
    private FlightRegister flights;
    private TicketRegister tickets;

    /**
     * Constructor for objects of class TicketReservationSystem. Creates a
     * register for persons and flights.
     *
     */
    public TicketReservationSystem()
    {
        this.persons = new PersonRegister();
        this.flights = new FlightRegister();
        this.tickets = new TicketRegister();
    }

    /**
     * Adds the given person to the person register.
     *
     * @param person The person to be added.
     */
    public void addPerson(Person person)
    {
        this.persons.addPerson(person);
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
        Person passenger = null;
        Person testPerson = null;
        Iterator<Person> it = persons.getPersonRegIterator();
        while (it.hasNext() && searching)
        {
            testPerson = it.next();
            if (testPerson instanceof Passenger
                    && testPerson.getLastName().equals(lastName))
            {
                passenger = testPerson;
                searching = false;
            }
        }
        return (Passenger) passenger;
    }

    /**
     * Returns a passenger by the given fore, and surname.
     *
     * @param firstName is the forename of the passenger to be searched for.
     * @param lastName The surname of the passenger to be searched for.
     * @return The found passenger.
     */
    public Passenger getPassengerByFullName(String firstName, String lastName)
    {
        boolean searching = true;
        Person passenger = null;
        Person testPerson;
        Iterator<Person> it = persons.getPersonRegIterator();
        while (it.hasNext() && searching)
        {
            testPerson = it.next();
            if (testPerson instanceof Passenger
                    && testPerson.getLastName().equals(lastName)
                    && testPerson.getFirstName().equals(firstName))
            {
                passenger = testPerson;
                searching = false;
            }
        }
        return (Passenger) passenger;
    }

    public int getNumberOfPassengersByLastName(String lastName)
    {
        int personCount = 0;
        Person passenger;
        Iterator<Person> it = persons.getPersonRegIterator();
        while (it.hasNext())
        {
            passenger = it.next();
            if (passenger instanceof Passenger
                    && passenger.getLastName().equals(lastName))
            {
                personCount++;
            }
        }
        return personCount;
    }

    /**
     * Gets a String list of people with a given last name
     *
     * @param lastName
     * @return a list of passengers lastname, firstname and email multiple
     * people are seperated by line
     *
     */
    public String getListOfPassengersByLastName(String lastName)
    {
        String returnString = "";
        Person passenger;
        Iterator<Person> it = persons.getPersonRegIterator();
        while (it.hasNext())
        {
            passenger = it.next();
            if ((passenger instanceof Passenger)
                    && (passenger.getLastName().equals(lastName)))
            {
                returnString += "\n    " + passenger.toString();
            }
        }
        return returnString;
    }

<<<<<<< HEAD
    
=======
    //test
    public Person getPersonByLastName(String lastName)
    {
        int counter = 0;
        Person person;
        Person personToReturn = null;
        Iterator<Person> it = persons.getPersonRegIterator();
        while (it.hasNext())
        {
            person = it.next();
            if (person.getLastName().equals(lastName))
            {
                personToReturn = person;
                counter++;
            }
        }
        return personToReturn;
    }
>>>>>>> a19113cf5133163c77672f736ead4febb59dcdbf

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

    public String getAllAvailablePilots()
    {
        String pilotsToReturn = "";
        Person person = null;
        Iterator<Person> it = this.persons.getPersonRegIterator();
        while (it.hasNext())
        {
            person = it.next();
            if (person instanceof Pilot)
            {
                pilotsToReturn += person.getLastName() + " "
                        + person.getFirstName() + "\n";
            }
        }
        return pilotsToReturn;
    }

    public String getAllAvailableCrew()
    {
        String crewToReturn = "";
        Person person = null;
        Iterator<Person> it = this.persons.getPersonRegIterator();
        while (it.hasNext())
        {
            person = it.next();
            if (person instanceof CabinCrew)
            {
                crewToReturn += person.getLastName() + " "
                        + person.getFirstName() + "\n";
            }
        }
        return crewToReturn;
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
        int counter = 0;
        String seatsToReturn = "";
        Seat seat = null;
        Iterator<Seat> it = flight.getSeats().getSeatRegIterator();
        while (it.hasNext())
        {
            counter++;
            seat = it.next();
            if (seat != null)
            {
                if (counter == flight.getNumberOfLetters())
                {
                    seatsToReturn += seat.getSeatId() + "\n";
                    counter = 0;
                }
                else
                {
                    seatsToReturn += seat.getSeatId() + " ";
                }
            }
        }
        return seatsToReturn;
    }

    /**
     * Returns a string of all the seats in a given flight.
     *
     * @param flight The flight where the seats are located.
     * @return All the seats within the flight.
     */
    public String getAvailableSeatsInFlight(Flight flight)
    {
        int counter = 0;
        String seatsToReturn = "";
        Seat seat = null;
        Iterator<Seat> it = flight.getSeats().getSeatRegIterator();
        while (it.hasNext())
        {
            counter++;
            seat = it.next();
            if (seat != null && seat.isAvailable())
            {
                if (counter == flight.getNumberOfLetters())
                {
                    seatsToReturn += seat.getSeatId() + "\n";
                    counter = 0;
                }
                else
                {
                    seatsToReturn += seat.getSeatId() + " ";
                }
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

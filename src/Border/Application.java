package Border;

import Facade.TicketReservationSystem;
import flightregisterapp.Flight;
import flightregisterapp.Passenger;
import flightregisterapp.FlightRegister;
import flightregisterapp.PassengerRegister;
import flightregisterapp.Seat;
import flightregisterapp.Ticket;
import flightregisterapp.TicketRegister;
import java.util.Scanner;

/**
 * This is just a DUMMY-class representing an Application. To be replaced with a
 * "proper" class.
 *
 * @author asty
 */
public class Application
{

    private final FlightRegister flights;
    private final TicketRegister tickets;
    private final PassengerRegister passengers;
    private TicketReservationSystem ticketSystem;

    public Application()
    {
        this.flights = new FlightRegister();
        this.tickets = new TicketRegister();
        this.passengers = new PassengerRegister();
        this.ticketSystem = new TicketReservationSystem();
    }

    public void init()
    {
        System.out.println("init() was called");
    }

    void doCreateFlight()
    {
        System.out.println("---- Create a Flight ----");
        System.out.println("Please enter the flight ID (e.g. SK4145):");
        Scanner reader = new Scanner(System.in);
        String flightID = reader.nextLine();

        System.out.println("\nPlease enter the destination airport (e.g. OSL):");
        String destinationAirport = reader.nextLine();

        System.out.println("\nPlease enter the departure airport (e.g. AES):");
        String departureAirport = reader.nextLine();

        System.out.println("\nPlease enter the departure hour (0-23):");
        int departureHour = reader.nextInt();

        System.out.println("\nPlease enter the departure minute (0-59):");
        int departureMinute = reader.nextInt();

        System.out.println("\nPlease enter the arrival hour (0-23):");
        int arrivalHour = reader.nextInt();

        System.out.println("\nPlease enter the arrival minute (0-59):");
        int arrivalMinute = reader.nextInt();

        System.out.println("\nPlease enter the departure day (1-31):");
        int departureDay = reader.nextInt();

        System.out.println("\nPlease enter the departure month (1-12):");
        int departureMonth = reader.nextInt();

        System.out.println("\nPlease enter the departure year:");
        int departureYear = reader.nextInt();

        System.out.println("\nPlease enter the arrival day (1-31):");
        int arrivalDay = reader.nextInt();

        System.out.println("\nPlease enter the arrival month (1-12):");
        int arrivalMonth = reader.nextInt();

        System.out.println("\nPlease enter the arrival year:");
        int arrivalYear = reader.nextInt();

        System.out.println("\nPlease enter the amount of rows of"
                + " seats in the plane:");
        int numberOfRows = reader.nextInt();

        System.out.println("\nPlease enter the amount of seats"
                + " within a row:");
        int numberOfLetters = reader.nextInt();

        Flight newFlight = new Flight(flightID, destinationAirport,
                departureAirport, departureHour, departureMinute,
                arrivalHour, arrivalMinute, departureDay,
                departureMonth, departureYear, arrivalDay,
                arrivalMonth, arrivalYear, numberOfRows, numberOfLetters);
        //this.flights.addFlight(newFlight);
        ticketSystem.addFlight(newFlight);
        System.out.println("\n\nThe following flight has been created:");
        System.out.println(newFlight.getFlightID() + ", "
                + newFlight.getDepartureAirport() + "->"
                + newFlight.getDestinationAirport() + ", "
                + (newFlight.getNumberOfRows() * newFlight.getNumberOfLetters())
                + " seats.");
        System.out.println("Departure: " + newFlight.getDepartureHour() + ":"
                + newFlight.getDepartureMinute() + ", "
                + newFlight.getDepartureDay() + "."
                + newFlight.getDepartureMonth() + "."
                + newFlight.getDepartureYear());
        System.out.println("Arrival: " + newFlight.getArrivalHour() + ":"
                + newFlight.getArrivalMinute() + ", "
                + newFlight.getArrivalDay() + "."
                + newFlight.getArrivalMonth() + "."
                + newFlight.getArrivalYear());

        //System.out.println(ticketSystem.getAllFlights());
    }

    void doRegisterPassenger()
    {
        System.out.println("\n---- Register a Passenger ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        Passenger newPassenger = new Passenger(firstName, lastName, eMail);
        //this.passengers.addPassenger(newPassenger);
        ticketSystem.addPassenger(newPassenger);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newPassenger.getFirstName() + " "
                + newPassenger.getLastName() + ", "
                + newPassenger.getEmail());
    }

    void doSellTicket()
    {
        System.out.println("\n---- Sell Ticket to Passenger ----");
        System.out.println("Please enter the last name of the passenger:");
        Scanner reader = new Scanner(System.in);
        Passenger passenger = ticketSystem.getPassengerByLastName(reader.nextLine());

        //TODO: Insert "Please choose the airport you are travelling from:"
        System.out.println("Please choose a destination (e.g. OSL):");
        String destination = reader.nextLine();

        System.out.println("Please choose a flight:");
        System.out.println(ticketSystem.getAllFlightsByDestination(destination));
        String flightID = reader.nextLine();
        Flight flight = ticketSystem.getFlightByID(flightID);

        System.out.println("Please choose a seat:");
        //flights.getSeats(flight).listAvailableSeats();
        System.out.println(ticketSystem.getSeats(flight));
        String seat = reader.nextLine();
        Seat selectedSeat = ticketSystem.getSeatByID(flight, seat);
        ticketSystem.setSeatToUnavailable(selectedSeat);

        System.out.println("Please enter a valid ticket ID (e.g. 1001):");
        int ticketID = reader.nextInt();

        System.out.println("Please enter the ticket price in NOK:");
        int price = reader.nextInt();

        Ticket newTicket = new Ticket(passenger, flight,
                selectedSeat, flightID, ticketID, price);
        tickets.addTicket(newTicket);
        flight.addPassenger(passenger);

        System.out.println("\n\nThe following ticket has been sold:");
        System.out.println(newTicket.getPassenger().getFirstName() + " "
                + newTicket.getPassenger().getLastName()
                + ", TicketNr: " + newTicket.getTicketID());
        System.out.println("Flight: " + newTicket.getFlightID() + " "
                + newTicket.getFlight().getDepartureAirport()
                + "->" + newTicket.getFlight().getDestinationAirport()
                + ", Seat " + newTicket.getSeat().getSeatId());
        System.out.println("Departure: " + flight.getDepartureHour() + ":"
                + flight.getDepartureMinute() + ", "
                + flight.getDepartureDay() + "."
                + flight.getDepartureMonth() + "."
                + flight.getDepartureYear());
        System.out.println("Arrival: " + flight.getArrivalHour() + ":"
                + flight.getArrivalMinute() + ", "
                + flight.getArrivalDay() + "."
                + flight.getArrivalMonth() + "."
                + flight.getArrivalYear());
        System.out.println("Price: " + newTicket.getPrice() + "\n");
    }

    void doListSeatsInFlight()
    {
        System.out.println("\n--- List Seats in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n" + ticketSystem.getSeats(flight));

    }

    void doListPassengersInFlight()
    {
        System.out.println("\n--- List Passengers in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n" + ticketSystem.getPassengersInFlight(flight));
    }

}

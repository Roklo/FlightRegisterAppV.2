package Border;

import Facade.TicketReservationSystem;
import flightregisterapp.Flight;
import flightregisterapp.Passenger;
import flightregisterapp.Seat;
import flightregisterapp.Ticket;
import java.util.Scanner;

/**
 * This is just a DUMMY-class representing an Application. To be replaced with a
 * "proper" class.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Application
{

    private final TicketReservationSystem ticketSystem;

    /**
     * Initializes the application.
     */
    public void init()
    {
        //System.out.println("Init was called");
    }

    /**
     * Constructor for application class
     */
    public Application()
    {
        this.ticketSystem = new TicketReservationSystem();
    }

    /**
     * Creates a new flight. Prompts user for flight information.
     */
    void doCreateFlight()
    {
        System.out.println("---- Create a Flight ----");
        System.out.println("Please enter the flight ID (e.g. SK4145):");
        Scanner reader = new Scanner(System.in);
        String flightID = reader.nextLine();

        System.out.println("\nPlease enter the destination"
                + "airport (e.g. OSL):");
        String destinationAirport = reader.nextLine();

        System.out.println("\nPlease enter the departure airport"
                + "(e.g. AES):");
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

    /**
     * Registers a new passenger. Prompts user for passenger information.
     */
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

        ticketSystem.addPassenger(newPassenger);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newPassenger.getFirstName() + " "
                + newPassenger.getLastName() + ", "
                + newPassenger.getEmail());
    }

    /**
     * Sells a ticket to a passenger. Prompts user for passenger and flight
     * info.
     */
    void doSellTicket()
    {
        System.out.println("\n-- Sell Ticket to Passenger --");
        System.out.println("Please enter the last name of the passenger:");
        Scanner reader = new Scanner(System.in);
        Passenger passenger
                = ticketSystem.getPassengerByLastName(reader.nextLine());

        //TODO: Insert 'Please choose the airport you are travelling from:'
        System.out.println("Please choose a destination (e.g. OSL):");
        String destination = reader.nextLine();

        System.out.println("Please choose a flight:");
        System.out.println(
                ticketSystem.getAllFlightsByDestination(destination));
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
        ticketSystem.addTicket(newTicket);
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

    /**
     * Lists all the seats in a given flight. Prompts user for flight id using
     * reader.
     */
    void doListSeatsInFlight()
    {
        System.out.println("\n--- List Seats in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n" + ticketSystem.getSeats(flight));
    }

    /**
     * Lists passengers in a flight. Prompts user for flight id using reader.
     */
    void doListPassengersInFlight()
    {
        System.out.println("\n--- List Passengers in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n" + ticketSystem.getPassengersInFlight(flight));
    }

    /**
     * Prompts for a int input between two values, will not return value before
     * requirements are met.
     *
     * @param minValue The minimum input value.
     * @param maxValue The maxiumum input value.
     * @param displayInfo The message to display to user.
     * @return The integer from reader.
     */
    private int getLimitedInt(int minValue, int maxValue, String displayInfo)
    {
        Scanner reader = new Scanner(System.in);
        int returnInt = maxValue + 1;
        System.out.println("\n" + displayInfo + " ("
                + minValue + "-" + maxValue + ")");
        while ((returnInt > maxValue) || (returnInt < minValue))
        {
            returnInt = reader.nextInt();
            if ((returnInt > maxValue) || (returnInt < minValue))
            {
                System.out.println("Error: number must be betweeen "
                        + minValue + " and " + maxValue);
            }
        }
        return returnInt;
    }
}

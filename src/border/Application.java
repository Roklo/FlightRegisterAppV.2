package border;

import entity.Crew;
import facade.TicketReservationSystem;
import entity.Flight;
import entity.Passenger;
import entity.Person;
import entity.Pilot;
import entity.Seat;
import entity.Ticket;
import java.util.Scanner;

import java.util.HashSet;

/**
 * This is just a DUMMY-class representing an Application. To be replaced with a
 * "proper" class.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Application {

    private final TicketReservationSystem ticketSystem;

    private HashSet<Person> crewList;

    /**
     * Initializes the application.
     */
    public void init() {
        //System.out.println("Init was called");
    }

    /**
     * Constructor for application class
     */
    public Application() {
        this.ticketSystem = new TicketReservationSystem();
        this.crewList = new HashSet<>();
    }

    /**
     * Creates a new flight. Prompts user for flight information.
     */
    void doCreateFlight() {
        System.out.println("---- Create a Flight ----");
        System.out.println("Please enter the flight ID (e.g. SK4145):");
        Scanner reader = new Scanner(System.in);
        String flightID = reader.nextLine();

        //Add pilot
        System.out.println("\nPlease enter the name of the Pilot" + "\n"
                + "Enter *list* to list all pilots" + "\n"
                + "Enter *done* when finish adding pilot");

        boolean doneAddPilot = false;
        while (!doneAddPilot) {
            System.out.print("Add: ");
            String pilot = reader.nextLine();
            if (pilot.equals("list")) {
                System.out.println("List of all availible pilots:\n"
                        + ticketSystem.getAllAvailablePilots());
            }

            if (pilot.equals("done")) {
                doneAddPilot = true;
            } else {
                //TODO: Add pilot to flight
            }
        }

        //Add crew
        System.out.println("\nPlease enter the name of the crew" + "\n"
                + "Enter *list* to list all crew" + "\n"
                + "Enter *done* when finish adding crew");

        boolean doneAddCrew = false;
        while (!doneAddCrew) {
            System.out.print("Add:");
            String crew = reader.nextLine();
            if (crew.equals("list")) {
                System.out.println("List of all availible crew:\n"
                        + ticketSystem.getAllAvailableCrew());
            }

            if (crew.equals("done")) {
                doneAddCrew = true;
            } else {
                //TODO: Add crew to flight
            }
        }

        //Add destination airport
        System.out.println("\nPlease enter the destination"
                + "airport (e.g. OSL):");
        String destinationAirport = reader.nextLine();
        //Add departure airport
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

    void doRegisterPilot() {
        System.out.println("\n---- Register a Pilot ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        Person newPilot = new Pilot(firstName, lastName, eMail);

        ticketSystem.addPerson(newPilot);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newPilot.getFirstName() + " "
                + newPilot.getLastName() + ", "
                + newPilot.getEmail());
    }

    void doRegisterCrew() {
        System.out.println("\n---- Register a Crew ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        Person newCrew = new Crew(firstName, lastName, eMail);

        ticketSystem.addPerson(newCrew);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newCrew.getFirstName() + " "
                + newCrew.getLastName() + ", "
                + newCrew.getEmail());
    }

    /**
     * Registers a new passenger. Prompts user for passenger information.
     */
    void doRegisterPassenger() {
        System.out.println("\n---- Register a Passenger ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        Person newPassenger = new Passenger(firstName, lastName, eMail);

        ticketSystem.addPerson(newPassenger);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newPassenger.getFirstName() + " "
                + newPassenger.getLastName() + ", "
                + newPassenger.getEmail());
    }

    private Passenger getPassenger() {
        Scanner reader = new Scanner(System.in);
        Passenger passenger = null;
        boolean searching = true;

        while (searching) {
            System.out.println("Please enter the last name of the passenger:");
            String lastName = reader.nextLine();
            int passengerCount
                    = ticketSystem.getNumberOfPassengersByLastName(lastName);

            if (passengerCount == 0) {
                System.out.println("No passengers with that name was found");
            }
            if (passengerCount == 1) {
                passenger = ticketSystem.getPassengerByLastName(lastName);
                System.out.println("Match found\n" + passenger.toString());
                searching = false;
            }
            if (passengerCount >= 1) {
                System.out.println(passengerCount + " passenger with that "
                        + "lastname was found, please enter firstname");
                if (passengerCount <= 6) {
                    System.out.println("List of Matches: \n" + ticketSystem
                            .getListOfPassengersByLastName(lastName));
                }
                System.out.println("Please enter the firstname of the "
                        + "passenger");
                String firstName = reader.nextLine();
                passenger = ticketSystem.getPassengerByFullName(lastName, 
                        firstName);
                if (passenger != null) {
                    searching = false;
                }
                        
            }
        }
        return passenger;
    }

    /**
     * Sells a ticket to a passenger. Prompts user for passenger and flight
     * info.
     */
    void doSellTicket() {
        System.out.println("\n-- Sell Ticket to Passenger --");
        Scanner reader = new Scanner(System.in);

        Passenger passenger = getPassenger();

        //TODO: Insert 'Please choose the airport you are travelling from:'
        System.out.println(
                "Please choose a destination (e.g. OSL):");
        String destination = reader.nextLine();

        System.out.println(
                "Please choose a flight:");
        System.out.println(
                ticketSystem.getAllFlightsByDestination(destination));
        String flightID = reader.nextLine();
        Flight flight = ticketSystem.getFlightByID(flightID);

        System.out.println(
                "Please choose a seat:");
        //flights.getSeats(flight).listAvailableSeats();
        System.out.println(ticketSystem.getAvailableSeatsInFlight(flight));
        String seat = reader.nextLine();
        Seat selectedSeat = ticketSystem.getSeatByID(flight, seat);

        ticketSystem.setSeatToUnavailable(selectedSeat);

        System.out.println(
                "Please enter a valid ticket ID (e.g. 1001):");
        int ticketID = reader.nextInt();

        System.out.println(
                "Please enter the ticket price in NOK:");
        int price = reader.nextInt();

        Ticket newTicket = new Ticket(passenger, flight,
                selectedSeat, flightID, ticketID, price);

        ticketSystem.addTicket(newTicket);

        flight.addPassenger(passenger);

        System.out.println(
                "\n\nThe following ticket has been sold:");
        System.out.println(newTicket.getPassenger().getFirstName() + " "
                + newTicket.getPassenger().getLastName()
                + ", TicketNr: " + newTicket.getTicketID());
        System.out.println(
                "Flight: " + newTicket.getFlightID() + " "
                + newTicket.getFlight().getDepartureAirport()
                + "->" + newTicket.getFlight().getDestinationAirport()
                + ", Seat " + newTicket.getSeat().getSeatId());
        System.out.println(
                "Departure: " + flight.getDepartureHour() + ":"
                + flight.getDepartureMinute() + ", "
                + flight.getDepartureDay() + "."
                + flight.getDepartureMonth() + "."
                + flight.getDepartureYear());
        System.out.println(
                "Arrival: " + flight.getArrivalHour() + ":"
                + flight.getArrivalMinute() + ", "
                + flight.getArrivalDay() + "."
                + flight.getArrivalMonth() + "."
                + flight.getArrivalYear());
        System.out.println(
                "Price: " + newTicket.getPrice() + "\n");
    }

    /**
     * Lists all the seats in a given flight. Prompts user for flight id using
     * reader.
     */
    void doListSeatsInFlight() {
        System.out.println("\n--- List Seats in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n" + ticketSystem.getSeats(flight));
    }

    /**
     * Lists all the available seats in a given flight. Prompts user for flight
     * id using reader.
     */
    void doListAvailableSeatsInFlight() {
        System.out.println("\n--- List Seats in a Flight ---");
        System.out.println("Please choose a flight ID:");
        System.out.println(ticketSystem.getAllFlights());
        Scanner reader = new Scanner(System.in);
        Flight flight = ticketSystem.getFlightByID(reader.nextLine());
        System.out.println("\n"
                + ticketSystem.getAvailableSeatsInFlight(flight));
    }

    /**
     * Lists passengers in a flight. Prompts user for flight id using reader.
     */
    void doListPassengersInFlight() {
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
    private int getLimitedInt(int minValue, int maxValue, String displayInfo) {
        Scanner reader = new Scanner(System.in);
        int returnInt = maxValue + 1;
        System.out.println("\n" + displayInfo + " ("
                + minValue + "-" + maxValue + ")");
        while ((returnInt > maxValue) || (returnInt < minValue)) {
            returnInt = reader.nextInt();
            if ((returnInt > maxValue) || (returnInt < minValue)) {
                System.out.println("Error: number must be betweeen "
                        + minValue + " and " + maxValue);
            }
        }
        return returnInt;
    }

    public TicketReservationSystem getTicketSystem() {
        return this.ticketSystem;
    }
}

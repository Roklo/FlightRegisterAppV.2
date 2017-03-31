package border;

import entity.CabinCrew;
import facade.TicketReservationSystem;
import entity.EmployeeInfomation;
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
public class Application
{

    private final TicketReservationSystem ticketSystem;

    private HashSet<Person> crewList;

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
        this.crewList = new HashSet<>();
        EmployeeInfomation employeeInformation = new EmployeeInfomation();
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

        //Add pilot
        System.out.println("\nPlease enter the name of the Pilot" + "\n"
                + "Enter *list* to list all pilots" + "\n"
                + "Enter *done* when finish adding pilot");

        boolean doneAddPilot = false;
        while (!doneAddPilot)
        {
            System.out.print("Add: ");
            String pilot = reader.nextLine();
            if (pilot.equals("list"))
            {
                System.out.println("List of all availible pilots:\n"
                        + ticketSystem.getAllAvailablePilots());
            }

            if (pilot.equals("done"))
            {
                doneAddPilot = true;
            }
            else
            {
                //TODO: Add pilot to flight
            }
        }

        //Add crew
        System.out.println("\nPlease enter the name of the crew" + "\n"
                + "Enter *list* to list all crew" + "\n"
                + "Enter *done* when finish adding crew");

        boolean doneAddCrew = false;
        while (!doneAddCrew)
        {
            System.out.print("Add: ");
            String crew = reader.nextLine();
            if (crew.equals("list"))
            {
                System.out.println("List of all availible crew:\n"
                        + ticketSystem.getAllAvailableCrew());
            }

            if (crew.equals("done"))
            {
                doneAddCrew = true;
            }
            else
            {
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

    void doRegisterPilot()
    {
        System.out.println("\n---- Register a Pilot ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");

        String eMail = reader.nextLine();

        System.out.println("Please enter the certificate number:");

        Boolean uniqueCertificateNumber = true;
        String certificateNumber = "";

        while (uniqueCertificateNumber)
        {
            certificateNumber = reader.nextLine();

            if (certificateNumber.length() != 7
                    || !certificateNumber.matches("[0-9]+"))
            {
                System.out.println("Please enter an 7-digit number");
            }

            if (certificateNumber.length() == 7
                    && certificateNumber.matches("[0-9]+"))
            {
                uniqueCertificateNumber = ticketSystem.getEmployeeInformation()
                        .addSertificate(firstName, lastName, certificateNumber);

                if (uniqueCertificateNumber)
                {                    
                    System.out.println("This sertificate number "
                        + "is already registered");
                    System.out.println("Please enter the certificate number");
                }
                
            }

        }

        //System.out.println("Please enter the employee ID:");
        //String employeeID = reader.nextLine();
        String employeeID = ticketSystem.getEmployeeInformation()
                .getNewEmployeeNumber(firstName, lastName);

        Person newPilot = new Pilot(firstName, lastName, eMail,
                certificateNumber, employeeID);

        ticketSystem.addPerson(newPilot);
        System.out.println("\n\nThe following pilot has been registered:");
        System.out.println(newPilot.getFirstName() + " "
                + newPilot.getLastName() + ", "
                + newPilot.getEmail() + ", "
                + newPilot.getEmployeeID() + ", "
                + newPilot.getCertificateNumber());
    }

    void doRegisterCrew()
    {
        System.out.println("\n---- Register a Crew ----");
        System.out.println("Please enter the forename:");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();

        System.out.println("Please enter the surname:");
        String lastName = reader.nextLine();

        System.out.println("Please enter the email address:");
        String eMail = reader.nextLine();

        System.out.println("Please enter the employee ID:");
        String employeeID = reader.nextLine();

        Person newCrew = new CabinCrew(firstName, lastName, eMail, employeeID);

        ticketSystem.addPerson(newCrew);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newCrew.getFirstName() + " "
                + newCrew.getLastName() + ", "
                + newCrew.getEmail() + ", "
                + newCrew.getEmployeeID());
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

        Person newPassenger = new Passenger(firstName, lastName, eMail);

        ticketSystem.addPerson(newPassenger);
        System.out.println("\n\nThe following passenger has been registered:");
        System.out.println(newPassenger.getFirstName() + " "
                + newPassenger.getLastName() + ", "
                + newPassenger.getEmail());
    }

    private Passenger getPassenger()
    {
        Scanner reader = new Scanner(System.in);
        Passenger passenger = null;
        boolean searching = true;
        String lastName;
        while (searching)
        {
            System.out.println("Please enter the last name of the passenger:");
            lastName = reader.nextLine();
            System.out.println(); //spacing
            int passengerCount
                    = ticketSystem.getNumberOfPassengersByLastName(lastName);
<<<<<<< HEAD
            if (passengerCount == 0)
            {
                System.out.println("\nNo passengers with that name was found");
            }
            else if (passengerCount == 1)
            {
                passenger = ticketSystem.getPassengerByLastName(lastName);
                searching = false;
            }
            else if (passengerCount > 1)
            {
                System.out.println("\n" + passengerCount + " passenger with that "
                        + "lastname was found, please enter firstname");
                if (passengerCount <= 5)
                {
                    System.out.println("\nList of Matches: " + ticketSystem
                            .getStringListOfPassengersByLastName(lastName)
                            + "\n");
                }
                System.out.println("\nPlease enter the firstname of the "
                        + "passenger");
                String firstName = reader.nextLine();
                passenger = ticketSystem.getPassengerByFullName(firstName,
                        lastName);
                if (passenger != null)
                {
=======
            int functionInt = Integer.min(6, passengerCount);

            switch (functionInt)
            {
                case 0:
                    System.out.println("No passengers with that name was found");
                    break;

                case 1:
                    passenger = ticketSystem.getPassengerByLastName(lastName);
>>>>>>> 694d82a3667d2aa6ffc7f822c25b13a58f10a6c2
                    searching = false;
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    String listOfMatches = ticketSystem
                            .getStringListOfPassengersByLastName(lastName);
                    System.out.println("Matches: " + listOfMatches);

                case 6:
                    System.out.println(passengerCount + " passenger with that "
                            + "lastname was found, please enter firstname");

                    System.out.println("Please enter the firstname of the "
                            + "passenger");
                    String firstName = reader.nextLine();
                    passenger = ticketSystem.getPassengerByFullName(firstName,
                            lastName);
                    if (passenger != null)
                    {
                        searching = false;
                    }
            }
        }
<<<<<<< HEAD
        System.out.println("\nSelected person: \n3" + passenger.toString());
=======
        System.out.println("Selected person: \n" + passenger.toString());
>>>>>>> 694d82a3667d2aa6ffc7f822c25b13a58f10a6c2
        return passenger;
    }

    /**
     * Sells a ticket to a passenger. Prompts user for passenger and flight
     * info.
     */
    void doSellTicket()
    {
        System.out.println("\n-- Sell Ticket to Passenger --");
        Scanner reader = new Scanner(System.in);

        Passenger passenger = getPassenger();

        //TODO: Insert 'Please choose the airport you are travelling from:'
        boolean searching = true;
        String destination = "";
        while (searching)
        {
            System.out.println(
                    "Please choose a destination (e.g. OSL):");
            destination = reader.nextLine();
            if (ticketSystem.getAllFlightsByDestination(destination).equals(""))
            {
                System.out.println("\nNo flights found by that destination.");
            }
            else
            {
                searching = false;
            }
        }

        Flight flight = null;
        String flightID = null;
        searching = true;
        while (searching)
        {
            System.out.println(
                    "\nPlease choose a flight:");
            System.out.println(
                    ticketSystem.getAllFlightsByDestination(destination));
            flightID = reader.nextLine();
            flight = ticketSystem.getFlightByID(flightID);
            if (flight != null)
            {
                searching = false;
            }
            else
            {
                System.out.println("Invalid flight ID!");
            }
        }
        String seat = "";
        Seat selectedSeat = null;
        searching = true;
        while (searching)
        {
            System.out.println(
                    "\nPlease choose a seat:");
            System.out.println(ticketSystem.getAvailableSeatsInFlight(flight));
            seat = reader.nextLine();
            selectedSeat = ticketSystem.getSeatByID(flight, seat);
            if (selectedSeat != null)
            {
                searching = false;
                ticketSystem.setSeatToUnavailable(selectedSeat);
            }
            else
            {
                System.out.println("Invalid seat ID!");
            }
        }

        System.out.println(
                "\nPlease enter a valid ticket ID (e.g. 1001):");
        int ticketID = reader.nextInt();

        System.out.println(
                "\nPlease enter the ticket price in NOK:");
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
    void doListSeatsInFlight()
    {
        System.out.println("\n--- List Seats in a Flight ---");
        String seatsInFlight
                = ticketSystem.getSeats(chooseAFlight());
        if (seatsInFlight.isEmpty())
        {
            System.out.println("\nThere are no registered"
                    + " seats in this flight!");
        }
        else
        {
            System.out.println("\n" + seatsInFlight);
        }
    }

    /**
     * Lists all the available seats in a given flight. Prompts user for flight
     * id using reader.
     */
    void doListAvailableSeatsInFlight()
    {
        System.out.println("\n--- List Available Seats in a Flight ---");
        String seatsInFlight
                = ticketSystem.getAvailableSeatsInFlight(chooseAFlight());
        if (seatsInFlight.isEmpty())
        {
            System.out.println("\nThere are no registered"
                    + " seats in this flight!");
        }
        else
        {
            System.out.println("\n" + seatsInFlight);
        }
    }

    /**
     * Lists passengers in a flight. Prompts user for flight id using reader.
     */
    void doListPassengersInFlight()
    {
        System.out.println("\n--- List Passengers in a Flight ---");
        String passengersInFlight
                = ticketSystem.getPassengersInFlight(chooseAFlight());
        if (passengersInFlight.isEmpty())
        {
            System.out.println("\nThere are no registered"
                    + " passengers in this flight!");
        }
        else
        {
            System.out.println("\n" + passengersInFlight);
        }
    }

    private Flight chooseAFlight()
    {
        Flight flightToReturn = null;
        if (0 == ticketSystem.getNumberOfFlights())
        {
            System.out.println("There are no flights registered!");
        }
        else
        {
            boolean done = false;
            while (!done)
            {
                System.out.println("\nPlease choose a flight ID:");
                System.out.println(ticketSystem.getAllFlights());
                Scanner reader = new Scanner(System.in);
                Flight flight = ticketSystem.getFlightByID(reader.nextLine());
                if (flight == null)
                {
                    System.out.println("There are no flights by that ID.");
                }
                else
                {
                    done = true;
                    flightToReturn = flight;
                }
            }
        }
        return flightToReturn;
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

    public TicketReservationSystem getTicketSystem()
    {
        return this.ticketSystem;
    }
}

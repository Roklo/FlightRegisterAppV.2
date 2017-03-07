package flightregisterapp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The SeatRegister class represents a seat register in a flight reservation
 * system. It creates a seat register with the given amount of rows and letters
 * (columns), and holds a list of all the seats within the flight where you have
 * the possibility to add, remove and search for seats, as well as getting the
 * number, or a list of the available/unavailable seats.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class SeatRegister
{

    private final ArrayList<Seat> seats;

    /**
     * Constructor for objects of class SeatRegister
     *
     * @param numberOfRows The number of rows to be created, max 25.
     * @param numberOfLetters The number of letters (columns) to be created, max
     * 25.
     */
    public SeatRegister(int numberOfRows, int numberOfLetters)
    {
        this.seats = new ArrayList<>();
        this.fillSeats(numberOfRows, numberOfLetters);
    }

    /**
     * Adds a seat to the seat register.
     *
     * @param seatRow The seat row number.
     * @param seatPos The seat position letter.
     */
    public void addSeat(int seatRow, String seatPos)
    {
        this.seats.add(new Seat(seatRow, seatPos));
    }

    /**
     * Removes the given seat from the seat collection.d
     *
     * @param seat The seat to be removed.
     */
    public void removeSeat(String seat)
    {
        Iterator<Seat> it = this.seats.iterator();
        boolean found = false;
        Seat s = null;
        while (it.hasNext())
        {
            s = it.next();
            if (s.getSeatId().equals(seat.toUpperCase()))
            {
                found = true;
                it.remove();
            }
        }
        if (found)
        {
            System.out.println("Removed seat " + seat + ".");
        }
        else
        {
            System.out.println("Invalid seat ID: No seat found!");
        }
    }

    /**
     * Prints the details of the given seat ID (The seat ID, and available
     * status).
     *
     * @param seatId The seat ID to be searched for.
     */
    public void searchSeat(String seatId)
    {
        Iterator<Seat> it = this.seats.iterator();
        Seat s = null;
        boolean found = false;
        while (it.hasNext() && !found)
        {
            s = it.next();
            if (s.getSeatId().equals(seatId.toUpperCase()))
            {
                found = true;
            }
        }
        if (found)
        {
            System.out.println("Seat " + s.getSeatId()
                    + ":\nAvailable: " + s.isAvailable());
        }
        else
        {
            System.out.println("Invalid seat ID: No seat found!");
        }

    }

    /**
     * Returns the seat object given by the seat ID input.
     *
     * @param seatId The seat ID of the seat object to be returned.
     * @return The seat object given by the seat ID input.
     */
    public Seat getSeatById(String seatId)
    {
        Iterator<Seat> it = this.seats.iterator();
        Seat foundSeat = null;
        boolean found = false;
        while (it.hasNext() && !found)
        {
            Seat currentSeat = it.next();
            if (currentSeat.getSeatId().equals(seatId.toUpperCase()))
            {
                foundSeat = currentSeat;
                found = true;
            }
        }
        return foundSeat;
    }

    /**
     * Lists all the seats in the flight.
     */
    public void listAllSeats()
    {
        for (Seat seat : this.seats)
        {
            System.out.println(seat.getSeatId());
        }
    }

    /**
     * Lists all the available seats in the flight.
     */
    public void listAvailableSeats()
    {
        System.out.println("Available seats:");
        Iterator<Seat> it = this.seats.iterator();
        Seat s = null;
        while (it.hasNext())
        {
            s = it.next();
            if (s.isAvailable())
            {
                System.out.println(s.getSeatId());
            }
        }
    }

    /**
     * Lists all the unavailable seats in the flight.
     */
    public void listUnavailableSeats()
    {
        System.out.println("Unavailable seats:");
        Iterator<Seat> it = this.seats.iterator();
        Seat s = null;
        while (it.hasNext())
        {
            s = it.next();
            if (!s.isAvailable())
            {
                System.out.println(s.getSeatId());
            }
        }
    }

    /**
     * Sets the given seat to be unavailable.
     *
     * @param seatId The seat to be set as unavailable.
     */
    public void setSeatToUnavailable(String seatId)
    {
        this.getSeatById(seatId).setUnavailable();
        System.out.println("Seat " + seatId.toUpperCase()
                + " set to unavailable.");
    }

    /**
     * Returns the total number of seats.
     *
     * @return The total number of seats in the flight.
     */
    public int getNumberOfSeats()
    {
        return this.seats.size();
    }

    /**
     * Returns the total number of available seats.
     *
     * @return The total number of available seats in the flight.
     */
    public int getNumberOfAvailableSeats()
    {
        int numberOfAvailableSeats = 0;
        for (Seat seat : seats)
        {
            if (seat.isAvailable())
            {
                numberOfAvailableSeats++;
            }
        }
        return numberOfAvailableSeats;
    }

    /**
     * Fills the flight with the right amount of seats by the number of rows and
     * letters from the given numbers.
     *
     * @param numberOfRows How many rows of seats to be created.
     * @param numberOfLetters How many letters (columns) of seats to be created.
     */
    private void fillSeats(int numberOfRows, int numberOfLetters)
    {
        for (int index = 1; index <= numberOfRows; index++)
        {
            for (int letter = 0; letter < numberOfLetters; letter++)
            {
                addSeat(index, getCharForNumber(letter));
            }
        }
    }

    /**
     * Returns the letter of the given input number.
     *
     * @return The letter of the input number.
     */
    private String getCharForNumber(int index)
    {
        CharSequence css = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (index > 25)
        {
            return null;
        }
        return css.charAt(index) + "";
    }
}

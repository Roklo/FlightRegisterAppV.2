/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

/**
 * Creates a ticket for the passenger with all information
 * regarding his/her flight.
 *
 */
public class Ticket
{

    private final Passenger passenger;
    private final Flight flight;
    private final Seat seat;
    private final String flightID;
    private final int ticketID;
    private int price;

    /**
     * Generates a ticket with information about passengers name, 
     * flight information, seat number and flightID
     * @param passenger
     * @param flight
     * @param seat
     * @param flightID
     * @param ticketID
     * @param price 
     */
    public Ticket(Passenger passenger, Flight flight, Seat seat, String flightID,
            int ticketID, int price)
    {
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.ticketID = ticketID;
        this.flightID = flightID;
        this.price = price;
    }
    
/**
 * Returns ticket ID
 * @return ticketID
 */
    public int getTicketID()
    {
        return ticketID;
    }
    
/**
 * Returns seat number
 * @return seat
 */
    public Seat getSeat()
    {
        return seat;
    }
    
/**
 * Returns passenger name and email.
 * @return passenger 
 */
    public Passenger getPassenger()
    {
        return passenger;
    }
    
/**
 * Returns flight class with flight information
 * @return flight
 */
    public Flight getFlight()
    {
        return flight;
    }
    
/**
 * Return the flightID of the flight
 * @return flightID
 */
    public String getFlightID()
    {
        return flightID;
    }
    
/**
 * Returns the price of the ticket
 * @return price 
 */
    public int getPrice()
    {
        return price;
    }
    
/**
 * Sets the price of the ticket
 * @param price 
 */
    public void setPrice(int price)
    {
        this.price = price;
    }
}

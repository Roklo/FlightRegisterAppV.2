/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

/**
 *
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

    public int getTicketID()
    {
        return ticketID;
    }

    public Seat getSeat()
    {
        return seat;
    }

    public Passenger getPassenger()
    {
        return passenger;
    }

    public Flight getFlight()
    {
        return flight;
    }

    public String getFlightID()
    {
        return flightID;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}

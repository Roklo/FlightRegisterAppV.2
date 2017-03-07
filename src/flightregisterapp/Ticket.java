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

    private final int ticketID;
    private final String seat;
    private final String passenger;
    private final String flight;
    private final String flightID;
    private int price;

    public Ticket(String passenger, String flight, String seat, String flightID,
            int ticketID, int price)
    {
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.ticketID = 0;
        this.flightID = "";
        this.price = 0;
    }

    public int getTicketID()
    {
        return ticketID;
    }

    public String getSeat()
    {
        return seat;
    }

    public String getPassenger()
    {
        return passenger;
    }

    public String getFlight()
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

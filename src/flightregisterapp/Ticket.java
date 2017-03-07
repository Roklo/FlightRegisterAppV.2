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

    private int ticketID;
    private String seat;
    private String passenger;
    private String flight;
    private String flightID;
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashMap;

/**
 *
 * @author Håkon
 */
public class TicketRegister
{

    private HashMap<String, Ticket> tickets;

    public TicketRegister()
    {
        this.tickets = new HashMap<>();
    }

    public void addTicket(String passenger, Ticket ticket)
    {
        this.tickets.put(passenger, ticket);
    }

    public void removeTicketOfPassenger(String name)
    {
        this.tickets.remove(name);
    }

    public Ticket getTicketByName(String name)
    {
        return tickets.get(name);
    }
}

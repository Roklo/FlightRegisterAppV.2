/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Håkon
 */
public class TicketRegister
{

    private HashSet<Ticket> tickets;

    public TicketRegister()
    {
        this.tickets = new HashSet<>();
    }

    public void addTicket(Ticket ticket)
    {
        this.tickets.add(ticket);
    }

    public Iterator<Ticket> getTicketRegIterator()
    {
        return this.tickets.iterator();
    }
}

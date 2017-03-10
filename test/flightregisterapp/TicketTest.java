/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rocio
 */
public class TicketTest
{

    Passenger instancePassenger = new Passenger("Chuck", "Finley",
            "chuck.finley@gmail.com");

    Flight instanceFlight = new Flight("#F242", "AES",
            "OSL", 13, 30, 14, 35, 1, 2, 2016, 3, 4, 2017, 5, 6);

    Seat instanceSeat = new Seat(5, "A");

    Ticket instance = new Ticket(instancePassenger, instanceFlight,
            instanceSeat, "#F242", 0001, 4500);

    /**
     * Test of getTicketID method, of class Ticket.
     */
    @Test
    public void testGetTicketID()
    {
        System.out.println("getTicketID");
        int expResult = 0001;
        int result = instance.getTicketID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeat method, of class Ticket.
     */
    @Test
    public void testGetSeat()
    {
        System.out.println("getSeat");

        String expResult = "5A";
        String result = instance.getSeat().getSeatId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassenger method, of class Ticket.
     */
    @Test
    public void testGetPassenger()
    {
        System.out.println("getPassenger");

        String expResult = "Chuck Finley";
        String result = instance.getPassenger().getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFlight method, of class Ticket.
     */
    @Test
    public void testGetFlight()
    {
        
        System.out.println("getFlight");

        String expResult = "#F242";
        String expResultDestination = "AES";
        String resultFlightID = instance.getFlight().getFlightID();
        String resultDestinationAirport = instance.getFlight().
                getDestinationAirport();
        
        assertEquals(expResult, resultFlightID);
        assertEquals(expResultDestination, resultDestinationAirport);
    }

    /**
     * Test of getFlightID method, of class Ticket.
     */
    @Test
    public void testGetFlightID()
    {
        System.out.println("getFlightID");
        String expResult = "#F242";
        String result = instance.getFlightID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Ticket.
     */
    @Test
    public void testGetPrice()
    {
        System.out.println("getPrice");
        int expResult = 4500;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Ticket.
     */
    @Test
    public void testSetPrice()
    {
            System.out.println("setPrice");
            instance.setPrice(5000);
            
        int expResult = 5000;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        
    }

}

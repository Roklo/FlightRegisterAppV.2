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
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class SeatTest
{

    Seat instance = new Seat(5, "A");
    
    /**
     * Test of getSeatId method, of class Seat.
     * Test for negative numbers 
     */
    @Test
    public void testSeatNumberForNegatives()
    {
        Seat instance = new Seat(-4, "B");
        System.out.println("getSeatId");
        boolean expResult = true;
        boolean result = instance.getSeatId().contains("-");
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getSeatId method, of class Seat.
     */
    @Test
    public void testGetSeatId()
    {
        System.out.println("getSeatId");
        String expResult = "5A";
        String result = instance.getSeatId();
        assertEquals(expResult, result);
    }

    /**
     * Test of isAvailable method, of class Seat.
     */
    @Test
    public void testIsAvailable()
    {
        System.out.println("isAvailable");
        boolean expResult = true;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnavailable method, of class Seat.
     */
    @Test
    public void testSetUnavailable()
    {
        System.out.println("setUnavailable");
        instance.setUnavailable();
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailable method, of class Seat.
     */
    @Test
    public void testSetAvailable()
    {
        System.out.println("setAvailable");
        instance.setAvailable();
        boolean expResult = true;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
    }

}

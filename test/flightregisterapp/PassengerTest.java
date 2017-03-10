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
public class PassengerTest
{

    Passenger instance = new Passenger("Chuck", "Finley",
            "chuck.finley@gmail.com");

    public PassengerTest()
    {
    }


    /**
     * Test of getEmail method, of class Passenger.
     * Sets expected result 
     * Gets eMail result compares expResult to result
     */
    @Test
    public void testGetEmail()
    {
        System.out.println("getEmail");
        
        String expResult = "chuck.finley@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    

}

package flightregisterapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This JUnit test will perform tests for all mutator and accessor methods in
 * the PassengerTest class.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class PassengerTest
{

    Passenger instance = new Passenger("Chuck", "Finley",
            "chuck.finley@gmail.com");

    /**
     * Test of getEmail method, of class Passenger. Sets expected result Gets
     * eMail result compares expResult to result
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

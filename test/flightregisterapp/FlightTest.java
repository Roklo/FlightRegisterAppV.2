package flightregisterapp;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This JUnit test will perform tests for all mutator and accessor methods 
 * in the FlightTest class.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.1 (14.02.2017)
 */
public class FlightTest
{
    Flight instance = new Flight("#F242", "AES",
            "OSL", 13, 30, 14, 35, 1, 2, 2016, 3, 4, 2017, 5, 6);

    /**
     * Test of getFlightID method, of class Flight. Gets the FlightID checks
     * expected result. compares expected result with result
     *
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
     * Test of getDestinationAirport method, of class Flight. Gets the
     * DestinationAirport checks expected result. compares expected result with
     * result
     */
    @Test
    public void testGetDestinationAirport()
    {

        System.out.println("getDestinationAirport");
        String expResult = "AES";
        String result = instance.getDestinationAirport();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureAirport method, of class Flight. Gets the
     * DepartureAirport checks expected result. compares expected result with
     * result
     */
    @Test
    public void testGetDepartureAirport()
    {
        System.out.println("getDepartureAirport");
        String expResult = "OSL";
        String result = instance.getDepartureAirport();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureHour method, of class Flight. Gets the DepartureHour
     * checks expected result compares expected result with result
     */
    @Test
    public void testGetDepartureHour()
    {
        System.out.println("getDepartureHour");
        int expResult = 13;
        int result = instance.getDepartureHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureHour method, of class Flight. Sets the DepartureHour
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetDepartureHour()
    {
        System.out.println("getDepartureHour");
        instance.setDepartureHour(10);
        int expResult = 10;
        int result = instance.getDepartureHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureMinute method, of class Flight. Gets the
     * DepartureMinute checks expected result. compares expected result with
     * result
     */
    @Test
    public void testGetDepartureMinute()
    {
        System.out.println("getDepartureMinute");
        int expResult = 30;
        int result = instance.getDepartureMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureMinute method, of class Flight. Sets the
     * DepartureMinute checks expected result. compares expected result with
     * result
     */
    @Test
    public void testSetDepartureMinute()
    {

        System.out.println("setDepartureMinute");
        instance.setDepartureMinute(9);
        int expResult = 9;
        int result = instance.getDepartureMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrivalMinute method, of class Flight. Gets the ArrivalMinute
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetArrivalMinute()
    {

        System.out.println("getArrivalMinute");

        int expResult = 35;
        int result = instance.getArrivalMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalMinute method, of class Flight. Sets the ArrivalMinute
     * checks expected result. compares expected result with result
     */
    @Test

    public void testSetArrivalMinute()
    {
        System.out.println("setArrivalMinute");
        instance.setArrivalMinute(8);
        int expResult = 8;
        int result = instance.getArrivalMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrivalHour method, of class Flight. Gets the ArrivalHour
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetArrivalHour()
    {
        System.out.println("getArrivalHour");
        int expResult = 13;
        int result = instance.getDepartureHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalHour method, of class Flight. Sets the ArrivalHour
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetArrivalHour()
    {
        System.out.println("setArrivalHour");
        instance.setArrivalHour(8);
        int expResult = 8;
        int result = instance.getArrivalHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureDay method, of class Flight. Gets the DepartureDay
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetDepartureDay()
    {
        System.out.println("getDepartureDay");
        int expResult = 1;
        int result = instance.getDepartureDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureDay method, of class Flight. Sets the DepartureDay
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetDepartureDay()
    {
        System.out.println("setDepartureDay");
        instance.setDepartureDay(6);
        int expResult = 6;
        int result = instance.getDepartureDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureMonth method, of class Flight. Gets the
     * DepartureMonth checks expected result. compares expected result with
     * result
     */
    @Test
    public void testGetDepartureMonth()
    {
        System.out.println("getDepartureMonth");
        int expResult = 2;
        int result = instance.getDepartureMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureMonth method, of class Flight. Sets the
     * DepartureMonth checks expected result. compares expected result with
     * result
     */
    @Test
    public void testSetDepartureMonth()
    {
        System.out.println("getDepartureMonth");

        instance.setDepartureMonth(5);
        int expResult = 5;
        int result = instance.getDepartureMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureYear method, of class Flight. Gets the DepartureYear
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetDepartureYear()
    {
        System.out.println("getDepartureHour");
        int expResult = 2016;
        int result = instance.getDepartureYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureYear method, of class Flight. Sets the DepartureYear
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetDepartureYear()
    {
        System.out.println("setDepartureYear");

        instance.setDepartureYear(2015);
        int expResult = 2015;
        int result = instance.getDepartureYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrivalDay method, of class Flight. Gets the ArrivalDay checks
     * expected result. compares expected result with result
     */
    @Test
    public void testGetArrivalDay()
    {
        System.out.println("getDepartureHour");
        int expResult = 3;
        int result = instance.getArrivalDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalDay method, of class Flight. Sets the ArrivalDay checks
     * expected result. compares expected result with result
     */
    @Test
    public void testSetArrivalDay()
    {
        System.out.println("setArrivalDay");
        instance.setArrivalDay(11);
        int expResult = 11;
        int result = instance.getArrivalDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrivalMonth method, of class Flight. Gets the ArrivalMonth
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetArrivalMonth()
    {
        System.out.println("getDepartureHour");
        int expResult = 4;
        int result = instance.getArrivalMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalMonth method, of class Flight. Sets the ArrivalMonth
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetArrivalMonth()
    {

        System.out.println("setDepartureMinute");
        instance.setArrivalMonth(12);
        int expResult = 12;
        int result = instance.getArrivalMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrivalYear method, of class Flight. Gets the ArrivalYear
     * checks expected result. compares expected result with result
     */
    @Test
    public void testGetArrivalYear()
    {
        System.out.println("getArrivalYear");
        int expResult = 2017;
        int result = instance.getArrivalYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArrivalYear method, of class Flight. Sets the ArrivalYear
     * checks expected result. compares expected result with result
     */
    @Test
    public void testSetArrivalYear()
    {
        System.out.println("setArrivalYear");

        instance.setArrivalYear(13);
        int expResult = 13;
        int result = instance.getArrivalYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFlightTime method, of class Flight. Gets the FlightTime checks
     * expected result. compares expected result with result
     */
    @Test
    public void testGetFlightTime()
    {
        System.out.println("getFlightTime");
        String expResult = "01:05";
        String result = instance.getFlightTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfRows method, of class Flight.
     */
    @Test
    public void testGetNumberOfRows()
    {
        System.out.println("getNumberofRows");
        int expResult = 5;
        int result = instance.getNumberOfRows();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfLetters method, of class Flight.
     */
    @Test
    public void testGetNumberOfLetters()
    {
        System.out.println("getNumberofLetters");
        int expResult = 6;
        int result = instance.getNumberOfLetters();
        assertEquals(expResult, result);
    }

    /**
     * Test of addSeats method, of class Flight.
     */
    @Test
    public void testAddSeats()
    {
        instance.addSeats(2, 3);
        
        SeatRegister result = instance.getSeats();
        String expResult = "10";
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSeats method, of class Flight.
     */
    @Test
    public void testGetSeats()
    {
        /*
        System.out.println("getSeats");
        String expResult = "10";
        String result = instance.getSeats();
        assertEquals(expResult, result);
        */
    }

    /**
     * Test of addPassenger method, of class Flight.
     */
    @Test
    public void testAddPassenger()
    {
        System.out.println("AddPassenger");
        
        Passenger passenger = new Passenger("Chuck", "Finley", 
                "chuck.finley@gmail.com");

        instance.addPassenger(passenger);     
               
        String expResult = "Finley";
        
        String result; 
        boolean searching = true;
        Passenger pasFound = null;
        Iterator<Passenger> it = instance.getPassRegIterator();
        while (it.hasNext() && searching)
        {
            Passenger pas = it.next();
            if ((pas != null) && pas.getLastName()
                    .equals(passenger.getLastName()))
            {
                pasFound = pas;
                searching = false;
            }
        }
        if (pasFound != null)
        { 
            result = pasFound.getLastName(); 
        }
        else
        {
            result = "Not found";
        }
        assertEquals(expResult, result);        
    }

    /**
     * Test of getPassRegIterator method, of class Flight.
     */
    @Test
    public void testGetPassRegIterator()
    {
        //This is tested in the testAddPassenger test.       
    }
}


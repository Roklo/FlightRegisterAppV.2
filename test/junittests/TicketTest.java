package junittests;


import entity.CabinCrew;
import entity.Seat;
import entity.Flight;
import entity.Passenger;
import entity.Person;
import entity.Pilot;
import entity.Ticket;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This JUnit test will perform tests for all mutator and accessor methods in
 * the TicketTest class.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class TicketTest
{

    Passenger instancePassenger = new Passenger("Chuck", "Finley",
            "chuck.finley@gmail.com");

    Flight instanceFlight = new Flight("#F242", getPilot(), getCopilot(),
            getCabinCrewList(), "AES", "OSL",
            13, 30, 14, 35, 1, 2, 2016, 3, 4, 2017, 5, 6);;

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
     * Test of getFlight method, of class Ticket. Creates an expected result and
     * desination Gets FlightID and destination airport checks if expected
     * result is equl to result and destination
     */
    @Test
    public void testGetFlight()
    {
        System.out.println("getFlight");
        String expResult = "#F242";
        String expResultDestination = "AES";
        String resultFlightID = instance.getFlight().getFlightID();
        String resultDestinationAirport = instance.getFlight()
                .getDestinationAirport();
        assertEquals(expResult, resultFlightID);
        assertEquals(expResultDestination, resultDestinationAirport);
    }

    /**
     * Test of getFlightID method, of class Ticket. Creates an expected result
     * Gets FlightID result checks if expected result is equal to result
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
     * Test of getPrice method, of class Ticket. Creates an expected value to
     * the price Gets result from getPrice method checks expected result with
     * result
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
     * Test of setPrice method, of class Ticket. Sets method setPrice to 5000
     * expected result 5000 checks if getPrice result is equal to expResult
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

    /**
     * Test of setPrice method, of class Ticket. Sets method setPrice to 90000
     * expected result 90000 checks if getPrice result is equal to expResult
     * This test will check if it is possible to buy expensive tickets over the
     * limit of int.
     *
     */
    @Test
    public void testSetExpensivePrice()
    {
        System.out.println("setPrice");
        instance.setPrice(3000000);
        int expResult = 3000000;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    private Person getPilot()
    {
        Person pilot = new Pilot("Peter", "Jackson",
                "peter@movie.com", "0100001", "09006");
        return pilot;
    }

    private Person getCopilot()
    {
        Person copilot = new Pilot("Jack", "Sparrow",
                "Jack@pirate.com", "0100003", "09008");
        return copilot;
    }

    private List<CabinCrew> getCabinCrewList()
    {
        Person crew1 = new CabinCrew("Chuck", "Finley",
                "chuck@yahoo.com", "09001");
        Person crew2 = new CabinCrew("Chuck", "Bartowski",
                "chuck@cia.gov.com", "09002");
        Person crew3 = new CabinCrew("Blue", "Jay",
                "Barnes@Pearson.uk", "09003");
        
        List<CabinCrew> cabinCrew = new ArrayList<>();
        cabinCrew.add((CabinCrew) crew1);
        cabinCrew.add((CabinCrew) crew2);
        cabinCrew.add((CabinCrew) crew3);
        return cabinCrew;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import entity.Person;
import entity.Passenger;
import entity.CabinCrew;
import entity.Pilot;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This JUnit test will perform test for all mutator and accessor methods in the
 * PersonTest class
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class PersonTest
{

    Person instance = new Passenger("Chuck", "Finley",
            "chuck.finley@gmail.com");

    Person instance1 = new CabinCrew("Robin", "Thorholm",
            "robin.flyvertinne@aeroflot.com", "04623");

    Person instance2 = new Pilot("Bjørnar", "Tennfjord",
            "bmtennfjord@gmail.com", "0533762", "03321");

    /**
     * Test og getEmail mothod, of Class Person. sets expected gets email
     * result, compares expResult to result
     */
    @Test
    public void testGetEmail()
    {
        System.out.println("getEmail");

        String expResult = "chuck.finley@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of email to controll if email has @ in it.
     */
    @Test
    public void testNegativeGetEmail()
    {
        System.out.println("negativeGetEmail");
        boolean expResult = false;
        String result = instance.getEmail();
        boolean emailWrongFormat = !result.contains("@");
        assertEquals(expResult, emailWrongFormat);
    }

    /**
     * Test of getEmployeeID method, sets expected result, gets employeeID
     * result, compares expResult to result.
     */
    @Test
    public void testGetEmployeeID()
    {
        System.out.println("getEmployeeID");

        String expResult = "04623";
        String result = instance1.getEmployeeID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCertificateNumber method, set expected result, gets
     * certificateNumber result, compares expResult to result.
     */
    @Test
    public void testgetCertificateNumber()
    {
        System.out.println("getCertificateNumber");

        String expResult = "0533762";
        String result = instance2.getCertificateNumber();
        assertEquals(expResult, result);
    }
}

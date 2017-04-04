/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import facade.TicketReservationSystem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bjørnar
 */
public class EmployeeInfomationTest
{

    private TicketReservationSystem ticketSystem;

    /**
     *
     */
    public EmployeeInfomationTest()
    {
        this.ticketSystem = new TicketReservationSystem();
    }

    /**
     * Test of getNewEmployeeNumber method, of class EmployeeInfomation.
     */
    @Test
    public void testGetNewEmployeeNumber()
    {
         String newEmployeeID = this.ticketSystem.getEmployeeInformation()
            .getNewEmployeeNumber("Robin", "Thorholm");
    
  //  Person instance = new CabinCrew("Robin", "Thorholm",
           // "robin.flyvertinne@aeroflot.rus", employeeID);

        
        
        System.out.println("getNewEmployeeNumber");
       // String firstName = "Robin";
       // String lastName = "Thorholm";
       // newEmployeeID = ticketSystem.getEmployeeInformation()
         //       .getNewEmployeeNumber(firstName, lastName);
        
        String expResult = "00001";
        String result = newEmployeeID;
        assertEquals(expResult, result);
       
       
    }

    /**
     * Test of addSertificate method, of class EmployeeInfomation.
     */
    @Test
    public void testAddSertificate()
    {
        System.out.println("testAddSertificate");
        boolean sertificateAdded = this.ticketSystem.getEmployeeInformation()
                .addSertificate("Robin", "Storholm", "0001337");
        
        boolean expResult = false;
        boolean result = sertificateAdded;
        assertEquals(expResult, result);
      
        
    }
  
    /**
     * Test of addSertificate method, of class EmployeeInfomation.
     * Test if Sertificate number is duplicated.
     */
    @Test
    public void testForDuplicateCertificate()
    {
        System.out.println("testForDuplicateCertificate");
        boolean sertificate1 = this.ticketSystem.getEmployeeInformation()
                .addSertificate("Robin", "Storholm", "0001337");
        boolean sertificate2 = this.ticketSystem.getEmployeeInformation()
                .addSertificate("Bjørnar", "Tennfjord", "0001337");
        boolean expResult = true;
        boolean result = sertificate2;
        assertEquals(expResult, result);
       
        
    }
}

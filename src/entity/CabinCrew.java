package entity;

/**
 * 
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class CabinCrew extends Person
{
    
    private int employeeID;
    
    /**
     * Creates a new cabin crew given by his or hers forename, lastname,
     * and an email address.
     * @param foreName
     * @param lastName
     * @param emailAddress
     * @param employeeID
     */
    public CabinCrew(String foreName, String lastName, String emailAddress,
            int employeeID)
    {
        super(foreName, lastName, emailAddress);
        this.employeeID = employeeID;
    }
    
    @Override
    public int getEmployeeID()
    {
        return this.employeeID;
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}

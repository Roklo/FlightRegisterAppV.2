package entity;

/**
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Pilot extends Person
{

    private String certificateNumber;
    private String employeeID;

    /**
     * Creates a new pilot given by his or hers forename, lastname, and an email
     * address.
     *
     * @param foreName
     * @param lastName
     * @param emailAddress
     * @param certificateNumber
     * @param employeeID
     */
    public Pilot(String foreName, String lastName, String emailAddress,
            String certificateNumber, String employeeID)
    {
        super(foreName, lastName, emailAddress);
        this.certificateNumber = certificateNumber;
        this.employeeID = employeeID;
    }

    @Override
    public String getEmployeeID()
    {
        return this.employeeID;
    }

    @Override
    public String getCertificateNumber()
    {
        return this.certificateNumber;
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}

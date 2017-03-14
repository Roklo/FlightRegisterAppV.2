package entity;

/**
 * The Passenger class represents a passenger in a flight reservation system. It
 * holds the passenger details relevant in our context.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Passenger
{

    private final String foreName;
    private final String lastName;
    private final String emailAddress;

    /**
     * Creates a new passanger given by his or hers forename, lastname, and an
     * email address.
     *
     * @param foreName The forename of the passenger
     * @param lastName The lastname of the passenger.
     * @param emailAddress The email address of the passenger.
     */
    public Passenger(String foreName, String lastName, String emailAddress)
    {
        this.foreName = foreName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the first name of the passenger.
     *
     * @return The first name of the passenger.
     */
    public String getFirstName()
    {
        return this.foreName;
    }

    /**
     * Returns the last name of the passenger.
     *
     * @return The last name of the passenger.
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Returns the email address of the passenger.
     *
     * @return The email address of the passenger.
     */
    public String getEmail()
    {
        return this.emailAddress;
    }

}

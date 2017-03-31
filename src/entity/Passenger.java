package entity;

/**
 * The Passenger class represents a passenger in a flight reservation system. It
 * holds the passenger details relevant in our context.
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Passenger extends Person
{

    /**
     * Creates a new passanger given by his or hers forename, lastname, and an
     * email address.
     */
    public Passenger(String foreName, String lastName, String emailAddress)
    {
        super(foreName, lastName, emailAddress);
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}

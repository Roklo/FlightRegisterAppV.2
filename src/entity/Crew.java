/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Håkon
 */
public class Crew extends Person
{
    /**
     * Creates a new crew given by his or hers forename, lastname, and an
     * email address.
     */
    public Crew(String foreName, String lastName, String emailAddress)
    {
        super(foreName, lastName, emailAddress);
    }

    public String toString()
    {
        return getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}

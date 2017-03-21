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
public class Pilot extends Person
{
    /**
     * Creates a new pilot given by his or hers forename, lastname, and an
     * email address.
     */
    public Pilot(String foreName, String lastName, String emailAddress)
    {
        super(foreName, lastName, emailAddress);
    }

    public String toString()
    {
        return getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}

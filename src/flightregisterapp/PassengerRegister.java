/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightregisterapp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Håkon
 */
public class PassengerRegister
{

    private HashSet<Passenger> passengers;

    public PassengerRegister()
    {
        this.passengers = new HashSet<>();
    }

    public void addPassenger(Passenger pas)
    {
        this.passengers.add(pas);
    }

    public void removePassenger(Passenger pas)
    {
        this.passengers.remove(pas);
    }

    public Iterator<Passenger> getPassengerRegIterator()
    {
        return this.passengers.iterator();
    }

}

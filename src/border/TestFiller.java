/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package border;

import border.ApplicationUI;
import entity.CabinCrew;
import entity.Passenger;

import entity.Person;
import entity.Person;
import entity.Pilot;

/**
 *
 * @author rocio
 */
public class TestFiller
{

    private final ApplicationUI appUI;
    private Person persons;

    public TestFiller()
    {

        appUI = new ApplicationUI();
    }

    public void startFillingRegister()
    {

        addSomePassengers();
        addSomeCrew();
        addSomePilot();
        appUI.start();
    }

    public void addSomePassengers()
    {
        Person person1 = new Passenger("Robin", "Thorholm",
                "rocio@gmail.com");
        Person person2 = new Passenger("Håkon", "Haram",
                "håkon.h@gmail.com");
        Person person3 = new Passenger("Bjørnar", "Tennfjord",
                "bjorn_puzzyDestroyer69@gmail.com");
        Person person4 = new Passenger("Erlend", "Knudsen",
                "erlender@gmail.com");
        Person person5 = new Passenger("Espen", "Vad",
                "xX_sexy_vaden_killer_Xx@gmail.com");

        appUI.getApp().getTicketSystem().addPerson(person1);
        appUI.getApp().getTicketSystem().addPerson(person2);
        appUI.getApp().getTicketSystem().addPerson(person3);
        appUI.getApp().getTicketSystem().addPerson(person4);
        appUI.getApp().getTicketSystem().addPerson(person5);

    }

    private void addSomeCrew()
    {
        Person crew1 = new CabinCrew("Chuck", "Finley",
                "chuck@yahoo.com", "09001");
        Person crew2 = new CabinCrew("Chuck", "Bartowski",
                "chuck@cia.gov.com", "09002");
        Person crew3 = new CabinCrew("Blue", "Jay",
                "Barnes@Pearson.uk", "09003");
        Person crew4 = new CabinCrew("Dell", "Computer",
                "computer@dell.no", "09004");
        Person crew5 = new CabinCrew("The", "Machine",
                "01100011@yahoo.com", "09005");
        appUI.getApp().getTicketSystem().addPerson(crew1);
        appUI.getApp().getTicketSystem().addPerson(crew2);
        appUI.getApp().getTicketSystem().addPerson(crew3);
        appUI.getApp().getTicketSystem().addPerson(crew4);
        appUI.getApp().getTicketSystem().addPerson(crew5);

    }

    private void addSomePilot()
    {
        Person pilot1 = new Pilot("Peter", "Jackson",
                "peter@movie.com", "0100001", "09006");
        Person pilot2 = new Pilot("Suez", "Canal",
                "pirate@somalia.com", "0100002", "09007");
        Person pilot3 = new Pilot("Jack", "Sparrow",
                "Jack@pirate.com", "0100003", "09008");

        appUI.getApp().getTicketSystem().addPerson(pilot1);
        appUI.getApp().getTicketSystem().addPerson(pilot2);
        appUI.getApp().getTicketSystem().addPerson(pilot3);
    }

}

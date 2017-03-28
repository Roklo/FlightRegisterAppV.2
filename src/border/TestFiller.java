/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package border;

import border.ApplicationUI;
import entity.Crew;
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
        Person crew1 = new Crew("Chuck", "Finley",
                "chuck@yahoo.com");
        Person crew2 = new Crew("Chuck", "Bartowski",
                "chuck@cia.gov.com");
        Person crew3 = new Crew("Blue", "Jay",
                "Barnes@Pearson.uk");
        Person crew4 = new Crew("Dell", "Computer",
                "computer@dell.no");
        Person crew5 = new Crew("The", "Machine",
                "01100011@yahoo.com");
        appUI.getApp().getTicketSystem().addPerson(crew1);
        appUI.getApp().getTicketSystem().addPerson(crew2);
        appUI.getApp().getTicketSystem().addPerson(crew3);
        appUI.getApp().getTicketSystem().addPerson(crew4);
        appUI.getApp().getTicketSystem().addPerson(crew5);

    }

    private void addSomePilot()
    {
        Person pilot1 = new Pilot("Peter", "Jackson",
                "peter@movie.com");
        Person pilot2 = new Pilot("Suez", "Canal",
                "pirate@somalia.com");
        Person pilot3 = new Pilot("Jack", "Sparrow",
                "Jack@pirate.com");

        appUI.getApp().getTicketSystem().addPerson(pilot1);
        appUI.getApp().getTicketSystem().addPerson(pilot2);
        appUI.getApp().getTicketSystem().addPerson(pilot3);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package border;

import border.ApplicationUI;
import entity.CabinCrew;
import entity.Flight;
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
        addSomeFlights();
        appUI.start();
    }

    public void addSomePassengers()
    {
        Person person1 = new Passenger("Robin", "Thorholm",
                "rocio@gmail.com");
        Person person2 = new Passenger("Haakon", "Haram",
                "haakon.h@gmail.com");
        Person person3 = new Passenger("Bjornar", "Tennfjord",
                "bjorn_puzzyDestroyer69@gmail.com");
        Person person4 = new Passenger("Erlend", "Knudsen",
                "erlend@gmail.com");
        Person person5 = new Passenger("Espen", "Vad",
                "espen_vad@hotmail.com");
        Person person6 = new Passenger("Espen1", "Vad",
                "vaden59@gmail.com");
        Person person7 = new Passenger("Espen", "Vad",
                "espenErBest@gmail.com");
        Person person8 = new Passenger("Espen1", "Vad",
                "ebbes@gmail.com");
        Person person9 = new Passenger("Espen2", "Vad",
                "espen@gmail.com");
        Person person10 = new Passenger("Espen3", "Vad",
                "vadPower@gmail.com");
        Person person11 = new Passenger("Espen", "Vad",
                "tinderEspen@gmail.com");
        Person person15 = new Passenger("Espen", "Vad",
                "tinderEspen2@gmail.com");
        Person person16 = new Passenger("Espen", "Vad",
                "tinderEspenxXX@gmail.com");
        Person person12 = new Passenger("Bjornar1", "Tennfjord",
                "bmtennfjord@gmail.com");
        Person person13 = new Passenger("Bjornar2", "Tennfjord",
                "tennfjord@gmail.com");
        Person person14 = new Passenger("Bjornar3", "Tennfjord",
                "ElPedro@gmail.com");

        appUI.getApp().getTicketSystem().addPerson(person1);
        appUI.getApp().getTicketSystem().addPerson(person2);
        appUI.getApp().getTicketSystem().addPerson(person3);
        appUI.getApp().getTicketSystem().addPerson(person4);
        appUI.getApp().getTicketSystem().addPerson(person5);
        appUI.getApp().getTicketSystem().addPerson(person6);
        appUI.getApp().getTicketSystem().addPerson(person7);
        appUI.getApp().getTicketSystem().addPerson(person8);
        appUI.getApp().getTicketSystem().addPerson(person9);
        appUI.getApp().getTicketSystem().addPerson(person10);
        appUI.getApp().getTicketSystem().addPerson(person11);
        appUI.getApp().getTicketSystem().addPerson(person12);
        appUI.getApp().getTicketSystem().addPerson(person13);
        appUI.getApp().getTicketSystem().addPerson(person14);
        appUI.getApp().getTicketSystem().addPerson(person15);
        appUI.getApp().getTicketSystem().addPerson(person16);

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

    private void addSomeFlights()
    {
        Flight flight1 = new Flight("SK1234", "OSL", "AES",
                10, 15, 11, 35, 4, 6, 2017, 4, 6, 2017, 14, 6);
        Flight flight2 = new Flight("SK5548", "OSL", "AES",
                11, 35, 12, 20, 4, 6, 2017, 4, 6, 2017, 14, 6);
        Flight flight3 = new Flight("WR3321", "BGO", "AES",
                12, 15, 13, 20, 4, 6, 2017, 4, 6, 2017, 8, 4);
        Flight flight4 = new Flight("NO4141", "BGO", "AES",
                11, 20, 12, 05, 4, 6, 2017, 4, 6, 2017, 14, 6);
        
        appUI.getApp().getTicketSystem().addFlight(flight1);
        appUI.getApp().getTicketSystem().addFlight(flight2);
        appUI.getApp().getTicketSystem().addFlight(flight3);
        appUI.getApp().getTicketSystem().addFlight(flight4);
    }

}

package flightregisterapp;

import java.util.Iterator;

/**
 * The flight class represents a flight in a flight reservation system. It holds
 * the details about the flight such as flightID, destinationAirport,
 * departureAirport, departureTime, departureDate, arrivalTime and arrivalDate
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tennfjord, Erlend Knudsen
 * @version 2.0 (07.03.2017)
 */
public class Flight
{

    private final String flightID;
    private final String destinationAirport;
    private final String departureAirport;

    private int departureHour;
    private int departureMinute;
    private int arrivalMinute;
    private int arrivalHour;

    private int departureDay;
    private int departureMonth;
    private int departureYear;
    private int arrivalDay;
    private int arrivalMonth;
    private int arrivalYear;
    
    private int numberOfRows;
    private int numberOfLetters;
    
    private SeatRegister seats;
    private PassengerRegister passengers;

    /**
     * The constructor of the Flight class
     *
     * @param flightID
     * @param destinationAirport
     * @param departureAirport
     * @param departureHour
     * @param departureMinute
     * @param arrivalHour
     * @param arrivalMinute
     * @param departureDay
     * @param departureMonth
     * @param departureYear
     * @param arrivalDay
     * @param arrivalMonth
     * @param arrivalYear
     * @param numberOfRows
     * @param numberOfLetters
     *
     * 
     */
    public Flight(String flightID, String destinationAirport,
            String departureAirport, int departureHour, int departureMinute,
            int arrivalHour, int arrivalMinute, int departureDay,
            int departureMonth, int departureYear, int arrivalDay,
            int arrivalMonth, int arrivalYear, int numberOfRows,
            int numberOfLetters)

    {
        this.flightID = flightID;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.arrivalDay = arrivalDay;
        this.arrivalMonth = arrivalMonth;
        this.arrivalYear = arrivalYear;
        this.numberOfRows = numberOfRows;
        this.numberOfLetters = numberOfLetters;
        seats = new SeatRegister();
        addSeats(numberOfRows, numberOfLetters);
        passengers = new PassengerRegister();

    }

    /**
     * Return the flightID of the flight
     *
     * @return Return the flightID of the flight
     */
    public String getFlightID()
    {
        return flightID;
    }

    /**
     * Return the IATA of the destination airport.
     *
     * @return Return the IATA of the destination airport.
     */
    public String getDestinationAirport()
    {
        return destinationAirport;
    }

    /**
     * Return the IATA of the departure airport
     *
     * @return Return the IATA of the departure airport
     */
    public String getDepartureAirport()
    {
        return departureAirport;
    }

    /**
     * Return the departure hour of the flight
     *
     * @return Return the departure hour of the flight
     */
    public int getDepartureHour()
    {
        return departureHour;
    }

    /**
     * Sets the departure hour of the flight
     *
     * @param departureHour Sets the departure hour of the flight
     */
    public void setDepartureHour(int departureHour)
    {
        this.departureHour = departureHour;
    }

    /**
     * Return the departure minute of the flight
     *
     * @return Return the departure minute of the flight
     */
    public int getDepartureMinute()
    {
        return departureMinute;
    }

    /**
     * Sets the departure minute of the flight
     *
     * @param departureMinute Sets the departure minute of the flight
     */
    public void setDepartureMinute(int departureMinute)
    {
        this.departureMinute = departureMinute;
    }

    /**
     * Return the arrival minute of the flight
     *
     * @return Return the arrival minute of the flight
     */
    public int getArrivalMinute()
    {
        return arrivalMinute;
    }

    /**
     * Sets the arrival minute of the flight
     *
     * @param arrivalMinute Sets the arrival minute of the flight
     */
    public void setArrivalMinute(int arrivalMinute)
    {
        this.arrivalMinute = arrivalMinute;
    }

    /**
     * Return the arrival hour of the flight
     *
     * @return Return the arrival hour of the flight
     */
    public int getArrivalHour()
    {
        return arrivalHour;
    }

    /**
     * Sets the arrival hour of the flight
     *
     * @param arrivalHour Sets the arrival hour of the flight
     */
    public void setArrivalHour(int arrivalHour)
    {
        this.arrivalHour = arrivalHour;
    }

    /**
     * Return the departure day of the flight
     *
     * @return Return the departure day of the flight
     */
    public int getDepartureDay()
    {
        return departureDay;
    }

    /**
     * Sets the departure day of the flight
     *
     * @param departureDay Sets the departure day of the flight
     */
    public void setDepartureDay(int departureDay)
    {
        this.departureDay = departureDay;
    }

    /**
     * Return the departure month of the flight
     *
     * @return Return the departure month of the flight
     */
    public int getDepartureMonth()
    {
        return departureMonth;
    }

    /**
     * Return the departure month of the flight
     *
     * @param departureMonth Return the departure month of the flight
     */
    public void setDepartureMonth(int departureMonth)
    {
        this.departureMonth = departureMonth;
    }

    /**
     * Return the departure year of the flight
     *
     * @return Return the departure year of the flight
     */
    public int getDepartureYear()
    {
        return departureYear;
    }

    /**
     * Sets the arrival year of the flight
     *
     * @param departureYear Sets the arrival year of the flight
     */
    public void setDepartureYear(int departureYear)
    {
        this.departureYear = departureYear;
    }

    /**
     * Return the arrival day of the flight
     *
     * @return Return the arrival day of the flight
     */
    public int getArrivalDay()
    {
        return arrivalDay;
    }

    /**
     * Sets the arrival day of the flight
     *
     * @param arrivalDay Sets the arrival day of the flight
     */
    public void setArrivalDay(int arrivalDay)
    {
        this.arrivalDay = arrivalDay;
    }

    /**
     * Return the arrival month of the flight
     *
     * @return Return the arrival month of the flight
     */
    public int getArrivalMonth()
    {
        return arrivalMonth;
    }

    /**
     * Sets the arrival month of the flight
     *
     * @param arrivalMonth Sets the arrival month of the flight
     */
    public void setArrivalMonth(int arrivalMonth)
    {
        this.arrivalMonth = arrivalMonth;
    }

    /**
     * Return the arrival year of the flight
     *
     * @return Return the arrival year of the flight
     */
    public int getArrivalYear()
    {
        return arrivalYear;
    }

    /**
     * Sets the arrival year of the flight
     *
     * @param arrivalYear Sets the arrival year of the flight
     */
    public void setArrivalYear(int arrivalYear)
    {
        this.arrivalYear = arrivalYear;
    }
    
    public int getNumberOfRows()
    {
        return this.numberOfRows;
    }
    
    public int getNumberOfLetters()
    {
        return this.numberOfLetters;
    }


    /**
     * A method for returning number of flight days Not nessesarry for Task3
     */
    /*
    
    public void getFlightDays()
    {
        int deltaDay = 0;
        int deltaMonth = 0;
        int deltaYear = 0;
                
                
        deltaDay = getDepartureDay() - getArrivalDay();  
        deltaMonth = getDepartureMonth() - getArrivalMonth();
        deltaYear = getDepartureYear() - getArrivalYear();
        
        if (deltaDay < 0)
        {
            
            
          deltaDayString = Integer.toString(deltaDay)  
                  
                   
        }
        
        
        System.out.println("Days: " + deltaDay + );
    }
     */
    /**
     * Calculates the total flight time of the flight n TODO: Add a return
     * TODO: Add a return Calculates the total flight time of the flight
     * statement so it will return the time as string
     *
     * @return Returns the total flighttime
     */
    public String getFlightTime()
    {
        String deltaMinuteString = null;
        String deltaHourString = null;

        int deltaMinute = getArrivalMinute() - getDepartureMinute();
        //System.out.println(deltaMinute);
        int deltaHour = getArrivalHour() - getDepartureHour();
        //System.out.println(deltaHour);

        //  If minutes result in a number lower than 0. Take one hour from
        // deltaHour to compensate and add 60 minutes to the negative number.
        if (deltaMinute < 0)
        {
            deltaHour = deltaHour - 1;
            deltaMinute = 60 + deltaMinute;
        }

        if (deltaHour < 0)

        {
            deltaHour = 24 + deltaHour;
        }

        // Create a 0 infront of any number lower than 10 to get a digital 
        // clock form of the number
        if (deltaMinute < 10)
        {
            deltaMinuteString = "0" + deltaMinute;
        }
        else
        {
            deltaMinuteString = Integer.toString(deltaMinute);
        }

        if (deltaHour < 10)
        {
            deltaHourString = "0" + deltaHour;
        }
        else
        {
            deltaHourString = Integer.toString(deltaHour);
        }
        
        

        return (deltaHourString + ":" + deltaMinuteString);

                /*
        /*
        System.out.println("Flight time: "
                + deltaHourString + ":" + deltaMinuteString + " Hours");
         */
    }

    /**
     * Adds seats to the flight
     *
     * @param numberOfRows
     * @param numberOfLetters
     *
     */
    public void addSeats(int numberOfRows, int numberOfLetters)
    {
        seats.addSeats(numberOfRows, numberOfLetters);
    }
    

    /**
     * Gets all seats for the flight
     *
     * @return Return all seats on the flight
     */
    public SeatRegister getSeats()
    {
        return seats;
    }
    
    public void addPassenger(Passenger pas)
    {
        passengers.addPassenger(pas);
    }
    
    public Iterator<Passenger> getPassRegIterator()
    {
        return passengers.getPassengerRegIterator();
    }

}

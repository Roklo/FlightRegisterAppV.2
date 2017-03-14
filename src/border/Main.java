/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package border;
import entity.Flight;
import entity.Seat;
import entity.SeatRegister;

/**
 *
 * @author Håkon Haram, Robin Thorholm, Bjørnar Tenfjord, Erlend Knudsen
 * @version 1.0 (14.02.2017)
 */
public class Main
{

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args)
    {
        /*
        System.out.println("test");
        SeatRegister seatReg = new SeatRegister(4, 4);
        Seat getSeat = seatReg.getSeatById("3B"); 
        
        Flight newflight = new  Flight("#F242", "ALE", 
                "OSL", 13, 30, 14, 30, 1, 1, 2017, 31, 1, 2017, 5, 6);
        newflight.getFlightTime();
*/
        ApplicationUI appUI = new ApplicationUI();
        appUI.start();
    }

}

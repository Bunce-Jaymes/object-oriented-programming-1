/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.exceptions.SandExceptions;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class sandWeightDoorControl {
    
    public static int calcWeight(int guessOunces, int pounds) throws SandExceptions{
   
        if (pounds < 1 || pounds > 60){
        throw new SandExceptions("Pounds cannot be less than 1 or greater than 40");
        }
           
        if (guessOunces < 0 ){
            throw new SandExceptions("Liters cannot be less than 0");
        }
            
        if(guessOunces > 960){
            throw new SandExceptions("Liters cannot be more than 15");
        }
        pounds = pounds + 20;    
        pounds = (pounds * 16);   
        if (pounds == guessOunces){
            return guessOunces;
        }
        else{
            throw new SandExceptions("The door clicks but does not open, looks like it didnt work.");
        }    
    }
    
   
}

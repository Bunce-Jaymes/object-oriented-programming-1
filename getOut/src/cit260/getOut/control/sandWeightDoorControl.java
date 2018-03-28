/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.geOut.exceptions.SandExceptions;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class sandWeightDoorControl {
    
    public static double calcWeight(double guessLiters, double pounds) throws SandExceptions{
   
        if (pounds < 1 || pounds > 40){
        throw new SandExceptions("Pounds cannot be less than 1 or greater than 40");
  
        //pounds = Math.random() * 40 + 1;
        
        }
           
        if (guessLiters < 0 ){
            throw new SandExceptions("Liters cannot be less than 0");
        }
            
        if(guessLiters > 15){
            throw new SandExceptions("Liters cannot be more than 15");
        }
            
        double guessWeight = (guessLiters * 2.2);
        guessWeight = Math.round(guessWeight * 1);    
        if (pounds == guessWeight){
            return guessWeight;
        }
        else{
            throw new SandExceptions("The door clicks but does not open, looks like it didnt work.");
        }    
    }
    
   
}

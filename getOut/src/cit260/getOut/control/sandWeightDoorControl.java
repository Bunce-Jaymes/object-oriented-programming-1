/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class sandWeightDoorControl {
    
    public static int calcWeight(double guessLiters, double pounds){
   
        if (pounds < 1 || pounds > 40){
           return -4;
  
        //pounds = Math.random() * 40 + 1;
        
        }
           
        if (guessLiters < 0 ){
            return -1;
        }
            
        if(guessLiters > 15){
            return -2;
        }
            
        double guessWeight = (guessLiters * 2.2);
        guessWeight = Math.round(guessWeight * 1);    
        if (pounds == guessWeight){
            return 1;
        }
        else{
            return -3;
        }    
    }
}

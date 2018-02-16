
package cit260.getOut.control;

import java.util.Random;


/**
 *
 * @author Samuel Prettyman and Jaymes Bunce
 */

public class doorControl {
    
    public static int calcWeight(double guessLiters, double pounds){
   
        if (pounds < 1 || pounds > 40){
           return -4;
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


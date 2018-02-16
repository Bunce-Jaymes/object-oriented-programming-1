
package cit260.getOut.control;


/**
 *packa
 * @author Samuel Prettyman
 */

public class doorControl {
    
    public static double calcWeight(double guessLiters, double pounds){
        
        //pounds = Math.random() * 40 + 1;
        
        if (pounds < 1.0 || pounds > 40.0){
            return -3.0;
        }
           
        if (guessLiters < 0 ){
            return -1;
        }
            
        if(guessLiters > 15){
            return -2;
        }
            
        double guessWeight = guessLiters * 2.2;
            
        if (pounds == guessWeight){
            return 1;
        }
        else{
            return -3;
        }    
    }
}


package cit260.getOut.control;

import cit260.getOut.exceptions.PinExceptions;

/**
 *
 * @author Jaymes Bunce
 */
public class pinCodeDoorControl {
    
    public static int calcCode(int hint, int guessCode)throws PinExceptions{
        if (hint < 0){
             throw new PinExceptions("Hint cannot be less than 1");
        }
        if (hint > 135){
             throw new PinExceptions("Hint cannot be greater than 135");
        }
        
        int x = (hint/2 +32);
        int code = (x*x);
        
        if (code == guessCode){
            return guessCode;
        }
        else{
             throw new PinExceptions("You punch in the code but the screen flashes:\n"
                        + "ERROR\n"
                        + "The screen then resets and is blinking for input" + "=======================================");
        }
    }
}

package cit260.getOut.control;

/**
 *
 * @author Jaymes Bunce
 */
public class pinCodeDoorControl {
    
    public static int calcCode(int hint, int guessCode){
        if (hint < 0){
            return -1;
        }
        if (hint > 135){
            return -2;
        }
        
        int x = (hint/2 +32);
        int code = (x*x);
        
        if (code == guessCode){
            return 1;
        }
        else{
             return -4;
        }
    }
}

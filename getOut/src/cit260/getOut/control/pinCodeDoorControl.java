package cit260.getOut.control;

/**
 *
 * @author Jaymes Bunce
 */
public class pinCodeDoorControl {
    
    public static int calcCode(int y, int guessCode){
        if (y < 0){
            return -1;
        }
        
        if (y > 134){
            return -2;
        }
        
        if (y % 2 != 0){
            return -4;
        }
        else{
            int x = (y/2 +32);
            int code = (x*x);
            if (code == guessCode){
                return 1;
            }
            else{
                return -4;
            }
        }
    }
}

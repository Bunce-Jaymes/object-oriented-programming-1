

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;
import cit260.getOut.control.doorControl;
/**
 *
 * @author Samuel Prettyman
 */
public class doorControlTest {
    
    public doorControlTest() {
    }

    /**
     * Test of calcWeight method, of class doorControl.
     */
    @Test
    public void testCalcWeight() {
        doorControl derp = new doorControl();
        System.out.println("calcWeight");
        double guessLiters = 0.0;
        double pounds = 0.0;
        double expResult = -3.0;
        double result = derp.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result, 0.5);
      
    }
    
}

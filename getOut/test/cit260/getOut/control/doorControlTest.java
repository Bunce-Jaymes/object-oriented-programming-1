/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jayme
 */
public class doorControlTest {
    
    public doorControlTest() {
    }

    /**
     * Test of calcWeight method, of class doorControl.
     */
    @Test
    public void testCalcWeight() {
        System.out.println("calcWeight");
        
        //Test Case 1
        System.out.println("\tTest Case 1");
        
        //define the input variables
        double guessLiters = 5.0;
        double pounds = 0.0;
        double expResult = 1;
        double result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

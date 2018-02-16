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
        System.out.println("calcWeight");
        double guessLiters = 0.0;
        double pounds = 0.0;
        double expResult = 0.0;
        double result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcForce method, of class doorControl.
     */
    @Test
    public void testCalcForce() {
        System.out.println("calcForce");
        double mass = 0.0;
        double acceleration = 0.0;
        double expResult = 0.0;
        double result = doorControl.calcForce(mass, acceleration);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

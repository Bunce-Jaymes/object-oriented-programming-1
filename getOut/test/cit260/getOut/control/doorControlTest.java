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
        doorControl derp = new doorControl();
        System.out.println("calcWeight");
        double guessLiters = 0.0;
        double pounds = 0.0;
        double expResult = -3.0;
        double result = derp.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result, 0.5);
       
    }

    /**
     * Test of calcForce method, of class doorControl.
     */
    @Test
    public void testCalcForce() {
        System.out.println("calcForce");
        double mass = 650.0;
        double acceleration = 1.0;
        double expResult = 650;
        double result = doorControl.calcForce(mass, acceleration);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcForceTwo method, of class doorControl.
     */
    @Test
    public void testCalcForceTwo() {
        System.out.println("calcForceTwo");
        double massTwo = 650.0;
        double acellerationTwo = 1.0;
        double expResult = 650.0;
        double result = doorControl.calcForceTwo(massTwo, acellerationTwo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

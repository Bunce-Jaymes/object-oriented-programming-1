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
public class forceLockDoorControlTest {
    
    public forceLockDoorControlTest() {
    }

    /**
     * Test of calcForce method, of class forceLockDoorControl.
     */
    @Test
    public void testCalcForce() {
        this.console.println("calcForce");
        double mass = 650.0;
        double acceleration = 1.0;
        double expResult = 650;
        double result = forceLockDoorControl.calcForce(mass, acceleration);
        assertEquals(expResult, result, 0.5);   
    }
     @Test
    public void testCalcForceTwo() {
        this.console.println("calcForceTwo");
        double massTwo = 650.0;
        double acellerationTwo = 1.0;
        double expResult = 650.0;
        double result = forceLockDoorControl.calcForce(massTwo, acellerationTwo);
        assertEquals(expResult, result, 0.0);
    }
}

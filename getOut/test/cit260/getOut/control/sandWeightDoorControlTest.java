/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.exceptions.SandExceptions;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaymes Bunce and Prettyman
 */
public class sandWeightDoorControlTest {
    
    public sandWeightDoorControlTest() {
    }
    
    @Test
    public void testCalcWeight() throws SandExceptions {
        this.console.println("\tSand Weight Case 1:");
        double guessLiters = 5;
        double pounds = 11;
        int expResult = 1;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
        
    @Test
    public void testCalcWeight2() throws SandExceptions {
        this.console.println("\tSand Weight Test Case 2:");
        double guessLiters = 3;
        double pounds = 23;
        int expResult = -3;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcWeight3() throws SandExceptions {
        this.console.println("\tSand Weight Test Case 3:");
        double guessLiters = -2;
        double pounds = 2;
        int expResult = -1;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcWeight4() throws SandExceptions {
        this.console.println("\tSand Weight Test Case 4:");
        double guessLiters = 2;
        double pounds = -3;
        int expResult = -4;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    
    public void testCalcWeight5() throws SandExceptions {
        this.console.println("\tcalcWeight Test Case 5:");
        double guessLiters = 2;
        double pounds = 80;
        int expResult = -4;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcWeight6() throws SandExceptions {
        this.console.println("calcWeight Test Case 6:");
        double guessLiters = 0.46;
        double pounds = 1;
        int expResult = 1;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcWeight7() throws SandExceptions {
        this.console.println("calcWeight Test Case 7:");
        double guessLiters = 15;
        double pounds = 33;
        int expResult = 1;
        int result = (int) sandWeightDoorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
}

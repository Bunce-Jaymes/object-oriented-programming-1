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
 * @author Jaymes Bunce and Sam Prettyman
 */
public class doorControlTest {
    
    public doorControlTest() {
    }

    /**
     * Test of calcWeight method, of class doorControl.
     */
    @Test
    public void testCalcWeight() {
        System.out.println("\tcalcWeight Case 1:");
        double guessLiters = 5;
        double pounds = 11;
        int expResult = 1;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight2() {
        System.out.println("\tcalcWeight Test Case 2:");
        double guessLiters = 3;
        double pounds = 23;
        int expResult = -3;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight3() {
        System.out.println("calcWeight Test Case 3:");
        double guessLiters = -2;
        double pounds = 2;
        int expResult = -1;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight4() {
        System.out.println("calcWeight Test Case 4:");
        double guessLiters = 2;
        double pounds = -3;
        int expResult = -4;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight5() {
        System.out.println("calcWeight Test Case 5:");
        double guessLiters = 2;
        double pounds = 80;
        int expResult = -4;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight6() {
        System.out.println("calcWeight Test Case 6:");
        double guessLiters = 0.46;
        double pounds = 1;
        int expResult = 1;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcWeight7() {
        System.out.println("calcWeight Test Case 7:");
        double guessLiters = 15;
        double pounds = 33;
        int expResult = 1;
        int result = doorControl.calcWeight(guessLiters, pounds);
        assertEquals(expResult, result);
    }
}  

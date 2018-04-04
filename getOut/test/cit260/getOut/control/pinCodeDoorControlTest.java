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
public class pinCodeDoorControlTest {
    
    public pinCodeDoorControlTest() {
    }

    /**
     * Test of calcCode method, of class pinCodeDoorControl.
     */
    @Test
    public void testCalcCode() {
        this.console.println("\tTest Case #1");
        int y = 48;
        int guessCode = 3136;
        int expResult = 1;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode2() {
        this.console.println("\tTest Case #2");
        int y = 56;
        int guessCode = 4000;
        int expResult = -4;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode3() {
        this.console.println("\tTest Case #3");
        int y = -6;
        int guessCode = 3600;
        int expResult = -1;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode4() {
        this.console.println("\tTest Case #4");
        int y = 178;
        int guessCode = 3600;
        int expResult = -2;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode5() {
        this.console.println("\tTest Case #5");
        int y = 5;
        int guessCode = 3600;
        int expResult = -4;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode6() {
        this.console.println("\tTest Case #6");
        int y = 0;
        int guessCode = 1024;
        int expResult = 1;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcCode7() {
        this.console.println("\tTest Case #7");
        int y = 134;
        int guessCode = 9801;
        int expResult = 1;
        int result = pinCodeDoorControl.calcCode(y, guessCode);
        assertEquals(expResult, result);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.geOut.exceptions;

/**
 *
 * @author jayme
 */
public class PinExceptions extends Exception {

    public PinExceptions() {
    }

    public PinExceptions(String string) {
        super(string);
    }

    public PinExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PinExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public PinExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

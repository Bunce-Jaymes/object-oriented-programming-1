package cit260.getOut.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayme
 */
public class ForceExceptions extends Exception{

    public ForceExceptions() {
    }

    public ForceExceptions(String string) {
        super(string);
    }

    public ForceExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ForceExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public ForceExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

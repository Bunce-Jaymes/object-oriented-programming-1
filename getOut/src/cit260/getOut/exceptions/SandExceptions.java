/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.exceptions;

/**
 *
 * @author jayme
 */
public class SandExceptions extends Exception{

    public SandExceptions() {
    }

    public SandExceptions(String string) {
        super(string);
    }

    public SandExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SandExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public SandExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
     
}

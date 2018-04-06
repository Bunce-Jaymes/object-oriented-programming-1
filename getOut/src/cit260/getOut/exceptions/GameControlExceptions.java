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
public class GameControlExceptions extends Exception {

    public GameControlExceptions() {
    }

    public GameControlExceptions(String string) {
        super(string);
    }

    public GameControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GameControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public GameControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}

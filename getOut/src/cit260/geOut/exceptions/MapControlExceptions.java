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
public class MapControlExceptions extends Exception {

    public MapControlExceptions() {
    }

    public MapControlExceptions(String string) {
        super(string);
    }

    public MapControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MapControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public MapControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

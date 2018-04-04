/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import getout.GetOut;
import java.io.PrintWriter;

/**
 *
 * @author jayme
 */
public class ErrorView {
    private static PrintWriter console = GetOut.getOutFile();
    private static PrintWriter log = GetOut.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println("\n---ERROR---------------------------------------------"
                + "\n" + errorMessage +
                "\n-----------------------------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}

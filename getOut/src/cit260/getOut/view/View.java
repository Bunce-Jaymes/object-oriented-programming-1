/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import getout.GetOut;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel Prettyman
 */
public abstract class View implements ViewInterface {

    private String message;
    protected final BufferedReader keyboard = GetOut.getInFile();
    protected final PrintWriter console = GetOut.getOutFile();

    public View() {

    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase().trim();

            if (value.equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String getInputs(String promptMessage) {
        String inputWithTrim = null;
        String input = null;
        String[] inputs = new String[1];
        boolean valid = false;
        try {
            while (valid == false) {
                this.console.println(promptMessage);
                input = this.keyboard.readLine();
                inputWithTrim = input.trim().toUpperCase();
                this.console.println("=======================================");

                if (inputWithTrim.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"You must enter a non-blank value");
                    ErrorView.display(this.getClass().getName(),"=======================================");
                    continue;

                } else {
                    inputs[0] = inputWithTrim;
                    return inputWithTrim;
                }
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),"Error reading input " + ex.getMessage());
        }
       
        return inputWithTrim;
    }

}

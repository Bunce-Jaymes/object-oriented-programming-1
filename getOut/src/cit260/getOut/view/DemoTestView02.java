/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.ForceExceptions;
import cit260.getOut.control.forceLockDoorControl;
import cit260.getOut.control.pinCodeDoorControl;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
class DemoTestView02 extends View {

    void displayDemoTestView02() throws ForceExceptions {

        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0];

            if (value.equals('Q') || inputs.length < 1) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];
        String acceleration = null;
        String mass = null;

        boolean valid = false;
        while (valid == false) {

            this.console.println("This door is locked and you need to break the lock,");
            this.console.println("\nYou need to configure the force by entering the mass of the hammer and speed of your swing ");

            this.console.println("=======================================");
            this.console.println("Enter an how fast you are swinging the hammer in meters/second: ");
            Scanner input;
            
            try {
                acceleration = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }

            acceleration = acceleration.trim();
            this.console.println("=======================================");

            this.console.println("=======================================");
            this.console.println("Enter how much mass the hammer has : ");
            
            try { 
                mass = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
            mass = mass.trim();
            this.console.println("=======================================");

            if (mass.length() < 1 || acceleration.length() < 1) {

                ErrorView.display(this.getClass().getName(),"YOU suck");
                continue;

            } else {
                inputs[0] = acceleration;
                inputs[1] = mass;
                valid = true;

            }

        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        boolean complete = false;

        try {
            
            double acceleration = Double.parseDouble(inputs[0]);
            double mass = Double.parseDouble(inputs[1]);
            try {
                double calcForce = forceLockDoorControl.calcForce(mass, acceleration);
            } catch (ForceExceptions ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
            this.console.println("The door is unlocked");
            complete = true;
            
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(),"Please enter a 4 digit number with no letters\n" + "=======================================");
        } 
        return complete;
    }
}

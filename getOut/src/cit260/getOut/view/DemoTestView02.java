/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.geOut.exceptions.ForceExceptions;
import cit260.getOut.control.forceLockDoorControl;
import cit260.getOut.control.pinCodeDoorControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 */
class DemoTestView02 {

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

    private String[] getInputs() {

        String[] inputs = new String[2];

        boolean valid = false;
        while (valid == false) {

            System.out.println("This door is locked and you need to break the lock,");
            System.out.println("\nYou need to configure the force by entering the mass of the hammer and speed of your swing ");

            System.out.println("=======================================");
            System.out.println("Enter an how fast you are swinging the hammer in meters/second: ");
            Scanner input;
            input = new Scanner(System.in);
            String acceleration = input.nextLine();

        acceleration = acceleration.trim();
            System.out.println("=======================================");

            System.out.println("=======================================");
            System.out.println("Enter how much mass the hammer has : ");
            Scanner input2;
            input2 = new Scanner(System.in);
            String mass = input2.nextLine();
            mass = mass.trim();
            System.out.println("=======================================");

            if (mass.length() < 1 || acceleration.length() < 1) {

                System.out.println("YOU suck");
                continue;

            } else {
                inputs[0] = acceleration;
                inputs[1] = mass;
                valid = true;

            }

        }
        return inputs;
    }

    private boolean doAction(String[] inputs) throws ForceExceptions {
        boolean complete = false;

        try {
            
            double acceleration = Double.parseDouble(inputs[0]);
            double mass = Double.parseDouble(inputs[1]);
            double calcForce = forceLockDoorControl.calcForce(mass, acceleration);
            System.out.println("The door is unlocked");
            complete = true;
            
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a 4 digit number with no letters\n" + "=======================================");
        }
        return complete;
    }
}

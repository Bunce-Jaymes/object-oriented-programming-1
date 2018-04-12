/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.pinCodeDoorControl;
import cit260.getOut.control.sandWeightDoorControl;
import cit260.getOut.exceptions.PinExceptions;
import cit260.getOut.exceptions.SandExceptions;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jayme
 */
public class DoorNumber2View extends View {

    void displayDemoTestView() throws PinExceptions {
        boolean endView = false;
        do {
            String[] inputs = getInputs();

            if (inputs.equals('Q')) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];

        Random rand = new Random();
        int pounds = rand.nextInt(39) + 1;
        
        int hint = pounds + 20;

        String poundsString = Integer.toString(pounds);

        boolean valid = false;
        while (valid == false) {
            this.console.println("You see a scale next to the door, meanwhile on the wall there is written:\n"
                    + "\n" + pounds + " lbs = ???? ounces - 20\n"
                    + "How many ounces of sand do you place in the bottle?"
                    + "\n(Round Down)");

            this.console.println("Or Q - To Quit\n"
                    + "=======================================");
            this.console.println("Enter Ounces: ");

            String input;

            try {
                input = this.keyboard.readLine();
                String guessOunces = input.trim();
                int guessLength = guessOunces.length();

                this.console.println("=======================================");

                if (guessLength < 1) {
                    ErrorView.display(this.getClass().getName(), "enter a non blank value"
                            + "\n=======================================");
                    continue;
                } else {
                    inputs[0] = guessOunces;
                    inputs[1] = poundsString;
                    valid = true;
                }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) throws NumberFormatException {

        boolean complete = false;
        int pounds;
        int guessOunces;

        try {
            guessOunces = Integer.parseInt(inputs[0]);
            pounds = Integer.parseInt(inputs[1]);

            try {
                int endWeight;
                endWeight = sandWeightDoorControl.calcWeight(guessOunces, pounds);
                this.console.println("You entered the weight correctly!\nThe lock clicks and the heavy door creaks open.");
                complete = true;
            } catch (SandExceptions ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            return complete;

        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "Please enter a number with no letters\n" + "=======================================");
        }

        return complete;

    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.geOut.exceptions.PinExceptions;
import cit260.getOut.control.pinCodeDoorControl;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jayme
 */
class DemoTestView extends View{

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
        int hint = rand.nextInt(133) + 1;

        if (hint % 2 != 0) {
            hint = hint + 1;
        }

        String hintString = Integer.toString(hint);

        boolean valid = false;
        while (valid == false) {
            System.out.println("You notice written all over the walls the number, " + hint);
            System.out.println("\nYou remember the note in your pocket and it reads,\n(X / 2 + 32)^24");

            System.out.println(
                    "        _ _ _ _\n\n"
                    + "|  1   |   2   |   3   |\n"
                    + "|  4   |   5   |   6   |\n"
                    + "|  7   |   8   |   9   |\n"
                    + "       |   0   |\n");

            System.out.println("=======================================");
            System.out.println("Enter code: ");

            String input;
            try {
                input = this.keyboard.readLine();
                 String guessCode = input.trim();
            int guessLength = guessCode.length();

            System.out.println("=======================================");

            if (guessLength < 4 || guessLength > 4) {
                System.out.println("You must enter a correct 4 digit, non-blank value");
                System.out.println("=======================================");
                continue;
            } else {
                inputs[0] = guessCode;
                inputs[1] = hintString;
                valid = true;
            }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
           
        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) throws NumberFormatException {

        boolean complete = false;
        int guessCode = 0;
        int hint = 0;

        try {
            guessCode = Integer.parseInt(inputs[0]);
            hint = Integer.parseInt(inputs[1]);

            try {
                int endCalc = pinCodeDoorControl.calcCode(hint, guessCode);
            } catch (PinExceptions ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("You entered the code correctly!\nThe lock clicks and the heavy door creaks open.");
            complete = true;
            return complete;
            
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a 4 digit number with no letters\n" + "=======================================");
        }
        
        return complete;

    }
}

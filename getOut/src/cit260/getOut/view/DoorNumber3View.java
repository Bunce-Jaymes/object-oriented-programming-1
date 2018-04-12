
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.PinExceptions;
import cit260.getOut.control.pinCodeDoorControl;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author jayme
 */
public class DoorNumber3View extends View{

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
            this.console.println("You notice written all over the walls the number, " + hint);
            this.console.println("\nYou remember the note in your pocket and it reads,\n(X / 2 + 32)^2");

            this.console.println(
                    "        _ _ _ _\n\n"
                    + "|  1   |   2   |   3   |\n"
                    + "|  4   |   5   |   6   |\n"
                    + "|  7   |   8   |   9   |\n"
                    + "       |   0   |\n");

            this.console.println("Or Q - To Quit\n"
                    + "=======================================");
            this.console.println("Enter code: ");

            String input;
            try {
                input = this.keyboard.readLine();
                 String guessCode = input.trim();
            int guessLength = guessCode.length();

            this.console.println("=======================================");

            if (guessLength < 4 || guessLength > 4) {
                ErrorView.display(this.getClass().getName(),"You must enter a correct 4 digit, non-blank value" + 
                        "\n=======================================");
                continue;
            } else {
                inputs[0] = guessCode;
                inputs[1] = hintString;
                valid = true;
            }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
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
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }

            this.console.println("You entered the code correctly!\nThe lock clicks and the heavy door creaks open.");
            complete = true;
            return complete;
            
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(),"Please enter a 4 digit number with no letters\n" + "=======================================");
        }
        
        return complete;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.model.Player;
import java.util.Scanner;

/**
 *
 * @author jayme
 */
public class MainMenuView {
    
    public void displayMainMenuView(){
      boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase();
            
            if (value.equals('Q') || inputs.length < 1 ){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }
       private String[] getInputs() {
        String[] inputs = new String[1];
        //Display the instructions
        //valid = false
        //WHILE valid == false (while input value is not valid)
        //Display the prompt message
        //Get the value entered from the keyboard
        //Trim off leading and trailing blanks from the value
        //IF length of the value < 1 then
        //Display "You must enter a value.”
        //Continue
        //ENDIF
        //Assign value to the next position in the inputs array
        //valid = true
        //ENDWHILE
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("Main menu doaction works");
        System.out.println("\tinputs = " + inputs[0]);
        return true;
    }
    
}

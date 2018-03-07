/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.pinCodeDoorControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jayme
 */
class DemoTestView {

    void displayDemoTestView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            
            if (inputs.equals('Q')){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[2];
        
        Random rand = new Random(); 
        int hint = rand.nextInt(133) + 1;
        
        if (hint % 2 != 0){
            hint = hint + 1;
        }
        
        String hintString = Integer.toString(hint);
                
        boolean valid = false;
        while (valid == false){
            System.out.println("You notice written all over the walls the number, " +  hint);
            System.out.println("\nYou remember the note in your pocket and it reads,\n(X / 2 + 32)^24");
        
            System.out.println(
            "        _ _ _ _\n\n" +
            "|  1   |   2   |   3   |\n" +
            "|  4   |   5   |   6   |\n" +
            "|  7   |   8   |   9   |\n" +
            "       |   0   |\n");
        
            System.out.println("=======================================");
            System.out.println("Enter code: ");
            
            Scanner input;
            input = new Scanner(System.in);
            String scannedInput = input.nextLine();
            String guessCode = scannedInput.trim();
            int guessLength = guessCode.length();
            
            System.out.println("=======================================");
           
            if (guessLength <4 || guessLength >4){
                System.out.println("You must enter a correct 4 digit, non-blank value");
                System.out.println("=======================================");
                continue;
            }
            else{
                inputs[0] = guessCode;  
                inputs[1] = hintString;
                valid = true;
                }
            }
            return inputs;
        } 

    private boolean doAction(String[] inputs) {

        int guessCode = Integer.parseInt(inputs[0]);
        int hint = Integer.parseInt(inputs[1]);
        
        int endCalc = pinCodeDoorControl.calcCode(hint,guessCode);
       
        if (endCalc == 1){
            System.out.println("You entered the code correctly!\nThe lock clicks and the heavy door creaks open.");
        }
        if (endCalc == -4){
            System.out.println("You punch in the code but the screen flashes:\n"
            + "ERROR\n"
            + "The screen then resets and is blinking for input");
            System.out.println("=======================================");
            return false;
        }
        return true;
    }
}

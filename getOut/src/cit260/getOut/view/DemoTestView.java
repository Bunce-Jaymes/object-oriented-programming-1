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
            boolean inputs = getInputs();
            if (inputs != true){
                return;
            }
            endView = doAction();
        } while (endView != true);
    }

    private boolean getInputs() {
                
        boolean valid = false;
        while (valid == false){
        Random rand = new Random(); 
        int hint = rand.nextInt(133) + 1;
        
        if (hint % 2 != 0){
            hint = hint + 1;
        }

        System.out.println("You notice written all over the walls the number," +  hint);
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
           int guessCode = input.nextInt();
           System.out.println("=======================================");
           
           int length = String.valueOf(guessCode).length();
           
         if (length != 4){
               System.out.println("You must enter a correct 4 digit, non-blank value");
               System.out.println("=======================================");
               continue;
           }
           else{
                int endCalc = pinCodeDoorControl.calcCode(hint,guessCode);
                if (endCalc == 1){
                    break;
                }
                if (endCalc == -4){
                    System.out.println("You punch in the code but the screen flashes:\n"
                            + "ERROR\n"
                            + "The screen then resets and is blinking for input\n");
                    System.out.println("=======================================");
                    continue;
                }
            }
        }
        return true;
        } 

    private boolean doAction() {
        System.out.println("You entered the code correctly!\nThe lock clicks and the heavy door creaks open.");
        return true;
    }
}

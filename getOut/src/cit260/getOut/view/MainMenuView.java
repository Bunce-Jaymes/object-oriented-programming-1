/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.GameControl;
import cit260.getOut.model.*;
import cit260.getOut.view.*;
import getout.GetOut;
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
        System.out.println("=======================================");
        System.out.println("N - Start new game \n" + "R - Load saved game\n" + "H - Get help on how to play the game\n" + "E - Exit ");
        System.out.println("=======================================");
        boolean valid = false;
        while (valid == false){
           System.out.println("Enter a key: ");
           Scanner input;
           input = new Scanner(System.in);
           String scannedInput = input.nextLine();
           String inputWithTrim = scannedInput.trim();
           System.out.println("=======================================");
           
           if (inputWithTrim.length() <1){
               System.out.println("You must enter a non-blank value");
               System.out.println("=======================================");
               continue;
           }
           else{
                inputs[0] = inputWithTrim;
                valid = true;
            }
        }
        return inputs;

        } 

    private boolean doAction(String[] inputs) {
       String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       switch (menuItem) {
           case "N": startNewGame();
           break;
           case "R": restartGame();
           break;
           case "H": getHelp();
           break;
           case "E": return true;
           
           default : System.out.println("=======================================");
                     System.out.println("Invalid menu item.");
                     System.out.println("=======================================");
       }
        return false;
    }

    private void startNewGame() {
        Game newGame = new Game();
        
        GameControl.createNewGame(GetOut.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuGame();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        helpMenuView helpMenuView = new helpMenuView();
        helpMenuView.displayhelpMenuView();
    }
}


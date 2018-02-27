/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.GameControl;
import static cit260.getOut.control.GameControl.savePlayer;
import cit260.getOut.control.MainMenuView;
import cit260.getOut.model.Player;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class StartProgramView implements Serializable {

    public StartProgramView() {
    }
    
    public void displayStartProgramView() {
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
        System.out.println("Welcome to GetOut the Game");

        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter your name: ");  
            
            Scanner nameInput;
            nameInput = new Scanner(System.in);
            String name = nameInput.nextLine();
            
            String nameWithTrim = name.trim();
            
            if (nameWithTrim.length() <1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            else{
                inputs[0] = nameWithTrim;
                valid = true;
            }
        }   
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        if (player == null){ 
           System.out.println("Could not create player. " + "Enter a different name.");
         return false;
        }
       
       System.out.println("=======================================");
       System.out.println("Welcome to the game, "  + playerName + "\nWe hope you have a lot of fun!");  
       System.out.println("=======================================");
    
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;
    }
    
}
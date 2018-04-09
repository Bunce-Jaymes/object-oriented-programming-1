/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.GameControlExceptions;
import cit260.getOut.control.GameControl;
import cit260.getOut.model.Game;
import getout.GetOut;
import java.io.IOException;

/**
 *
 * @author jayme
 */
public class SaveGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("Type the path, where you would like to save the game\n"
                + "Example: C:/Users/tmp/save.dat"
                + "\n or Q - To go back"
                + "\n=======================================\n"
                + "Enter the path with file name to save your current game (Remeber to add .dat at the end): ");

        inputs[0] = mainInput;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
//        boolean check = false;
        String filePath = inputs[0];
        Game game = GetOut.getCurrentGame();
        try {
            GameControl.saveGame(game,filePath);    
        } catch (GameControlExceptions | IOException gce) {
            ErrorView.display(this.getClass().getName(), gce.getMessage());
            return false;
        }
         this.console.println("File was succesfully saved to: " + filePath); 
         
        return true;
    }

}

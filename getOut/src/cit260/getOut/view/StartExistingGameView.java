/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.GameControlExceptions;
import cit260.getOut.control.GameControl;
import java.io.IOException;

/**
 *
 * @author jayme
 */
public class StartExistingGameView extends View {
    

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("Type the path of the game save that you would like to open"
                + "\nExample: C:/GameSave1.dat"
                + "\n or Q - To go back"
                + "\n=======================================\n"
                + "Enter the full file path for you save: ");
        inputs[0] = mainInput;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        try {
            GameControl.getGame(filePath);
        } catch (GameControlExceptions gce) {
            ErrorView.display(this.getClass().getName(), gce.getMessage());
            return false;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
   
        return true;
    }
}

                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.GameControlExceptions;
import cit260.getOut.control.GameControl;
import static cit260.getOut.control.GameControl.savePlayer;
import cit260.getOut.view.MainMenuView;
import cit260.getOut.model.Player;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class StartProgramView extends View {

    public StartProgramView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("Welcome to GetOut the Game");
        String playerName = this.getInputs("\nPlease enter your name: ");
        inputs[0] = playerName;
        
        return inputs;

    }
   
    @Override
    public boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = null;
        try {
            player = GameControl.savePlayer(playerName);
        } catch (GameControlExceptions ex) {
            ErrorView.display(this.getClass().getName(),"Could not save player name");
        }
        if (player == null) {
            ErrorView.display(this.getClass().getName(),"=======================================");
            ErrorView.display(this.getClass().getName(),"Could not create player. " + "Enter a different name.");
            ErrorView.display(this.getClass().getName(),"=======================================");
            return false;
        }

        this.console.println("=======================================");
        this.console.println("Welcome to the game, " + playerName + "\nWe hope you have a lot of fun!");
        this.console.println("=======================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }

}

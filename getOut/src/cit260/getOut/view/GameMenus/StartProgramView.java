                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.GameMenus;

import cit260.getOut.exceptions.GameControlExceptions;
import cit260.getOut.control.GameControl;
import cit260.getOut.view.GameMenus.MainMenuView;
import cit260.getOut.model.Player;
import cit260.getOut.view.ErrorView;
import cit260.getOut.view.View;

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

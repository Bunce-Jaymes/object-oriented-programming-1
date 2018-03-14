                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.GameControl;
import static cit260.getOut.control.GameControl.savePlayer;
import cit260.getOut.view.MainMenuView;
import cit260.getOut.model.Player;
import java.io.Serializable;
import java.util.Scanner;

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
        System.out.println("Welcome to GetOut the Game");
        String playerName = this.getInputs("\nPlease enter your name: ");
        inputs[0] = playerName;
        
        return inputs;

    }
   
    @Override
    public boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        if (player == null) {
            System.out.println("=======================================");
            System.out.println("Could not create player. " + "Enter a different name.");
            System.out.println("=======================================");
            return false;
        }

        System.out.println("=======================================");
        System.out.println("Welcome to the game, " + playerName + "\nWe hope you have a lot of fun!");
        System.out.println("=======================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }

}

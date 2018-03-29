/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.geOut.exceptions.MapControlExceptions;
import cit260.getOut.control.GameControl;
import cit260.getOut.model.*;
import cit260.getOut.view.*;
import getout.GetOut;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jayme
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("=======================================\n"
                + "N - Start new game \n"
                + "R - Load saved game\n"
                + "H - Get help on how to play the game\n"
                + "E - Exit\n"
                + "=======================================\n"
                + "Enter a key: ");
        inputs[0] = mainInput;

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "N": {
                try {
                    startNewGame();
                } catch (MapControlExceptions ex) {
                    System.out.println("Error in swtich statement");
                }
            }
            break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;

            default:
                System.out.println("=======================================");
                System.out.println("Invalid menu item.");
                System.out.println("=======================================");
        }
        return false;
    }

    private void startNewGame() throws MapControlExceptions {
        Game newGame = new Game();

        GameControl.createNewGame(GetOut.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        helpMenuView helpMenuView = new helpMenuView();
        helpMenuView.display();
    }

}

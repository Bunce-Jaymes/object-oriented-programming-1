/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.MapControlExceptions;
import cit260.getOut.control.GameControl;
import cit260.getOut.model.*;
import getout.GetOut;

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
                    ErrorView.display(this.getClass().getName(),"Error in swtich statement");
                }
            }
            break;
            case "R":
                loadGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;

            default:
                this.console.println("=======================================");
                this.console.println("Invalid menu item.");
                this.console.println("=======================================");
        }
        return false;
    }

    private void startNewGame() throws MapControlExceptions {
        Game newGame = new Game();

        GameControl.createNewGame(GetOut.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void loadGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private void getHelp() {
        helpMenuView helpMenuView = new helpMenuView();
        helpMenuView.display();
    }

}

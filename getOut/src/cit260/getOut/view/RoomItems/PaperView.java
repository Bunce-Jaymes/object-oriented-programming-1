/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.RoomItems;

import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import cit260.getOut.view.ErrorView;
import cit260.getOut.view.View;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class PaperView extends View {

    @Override
    public String[] getInputs() {
            String[] inputs = new String[1];

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        if (inventory[2] == "Paper") {
            this.console.println("You already searched this area");
            String mainInput = "q";
            inputs[0] = mainInput;
        } else {
            String mainInput = this.getInputs("You stumble accross an old trunk\n"
                    + "could be something old in there...\n"
                    + "T - Trunk\n"
                    + "X - Exit\n"
                    + "=======================================\n"
                    + "What item would you like to inspect?"
                    + "\nEnter a key: ");
            inputs[0] = mainInput;
        }

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "T":
                trunkSearch();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void trunkSearch() {
      this.console.println("There are several books inside the trunk and you begin to flip through them.\n"
                + "After a few books, you notice that a slip of paper falls out.\n"
                + "Written on the paper is the equation “(10 / 2 + 41)^2”\n"
                + "You continue to search the other books in the trunk but find nothing of note.\n"
                + "**PAPER has been added to your INVENTORY**\n"
                + "=======================================");
        
        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        inventory[2] = "Paper";
        actor.setItems(inventory);
    }
}

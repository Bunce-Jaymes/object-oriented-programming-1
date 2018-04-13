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
public class HammerView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        if (inventory[3] == "Hammer") {
            this.console.println("You already searched this area");
            String mainInput = "q";
            inputs[0] = mainInput;
        } else {
            String mainInput = this.getInputs("You stumble accross a pile of old wood\n"
                    + "could be something useful in there...\n"
                    + "W - Pile of wood\n"
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
            case "W":
                woodSearch();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void woodSearch() {
        this.console.println("There are several planks inside the pile and you begin to flip over them.\n"
                + "After a boards, you notice that a rusty hammer.\n"
                + "You continue to search through the pile but find nothing of note.\n"
                + "**HAMMER has been added to your INVENTORY**\n"
                + "=======================================");

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        inventory[3] = "Hammer";
        actor.setItems(inventory);
    }
}

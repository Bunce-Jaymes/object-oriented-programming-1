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
public class DriftPenView extends View {
@Override
    public String[] getInputs() {
            String[] inputs = new String[1];

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        if (inventory[4] == "Drift-Pen") {
            this.console.println("You already searched this area");
            String mainInput = "q";
            inputs[0] = mainInput;
        } else {
            String mainInput = this.getInputs("You stumble accross an old fridge\n"
                    + "could be something useful in there...\n"
                    + "F - Fridge\n"
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
            case "F":
                fridgeSearch();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void fridgeSearch() {
      this.console.println("There isn't much inside the fridge and you begin to move the expired food out of the way.\n"
                + "After a items, you notice a small sliver object.\n"
                + "Its a Drift Pen\n"
                + "You continue to search the rest of the fridge but find nothing of note.\n"
                + "**DRIFT-PEN has been added to your INVENTORY**\n"
                + "=======================================");
        
        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        inventory[4] = "Drift-Pen";
        actor.setItems(inventory);
    }
}

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
public class BottleView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        if (inventory[0] == "Bottle") {
            this.console.println("You already searched this area");
            String mainInput = "q";
            inputs[0] = mainInput;
        } else {
            String mainInput = this.getInputs("You stumble into a book shelf\n"
                    + "B - Inspect Bookshelf\n"
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
            case "B":
                inspectBookshelf();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void inspectBookshelf() {
        this.console.println("You have search under the bookshelf and inbetween the books.\n"
                + "Inside one of the books you find what looks like a two liter bottle, possibly crucial to your escape.\n"
                + "You continue to search the shelf but find nothing of note.\n"
                + "**BOTTLE was added to your INVENTORY**\n"
                + "=======================================");
        
        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        inventory[0] = "Bottle";
        actor.setItems(inventory);
    }
}

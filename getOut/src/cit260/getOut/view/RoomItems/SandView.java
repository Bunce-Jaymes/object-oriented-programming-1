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
public class SandView extends View {

    @Override
    public String[] getInputs() {
                String[] inputs = new String[1];

        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        if (inventory[1] == "Sand") {
            this.console.println("You already searched this area");
            String mainInput = "q";
            inputs[0] = mainInput;
        } else {
            String mainInput = this.getInputs("You stumble onto a pile of sandbags, there is sand all over the bags\n"
                    + "A couple look like they're in tact...\n"
                    + "S - Sand Bags\n"
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
            case "S":
                inspectSandBags();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void inspectSandBags() {
        this.console.println("You have search through the pile of sand bags.\n"
                + "Inside you find a few intact sand bags, possibly crucial to your escape.\n"
                + "You continue to search the pile but find nothing of note.\n"
                + "**SAND was added to your INVENTORY**\n"
                + "=======================================");
        
        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] inventory = actor.getItems();
        inventory[1] = "Sand";
        actor.setItems(inventory);
    }
}

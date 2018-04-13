/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class InventoryView extends View {

    @Override
    public String[] getInputs() {
        String[] input = new String[1];
        input[0] = "null";
        return input;
    }

    @Override
    public boolean doAction(String[] inputs) {
        Game game = GetOut.getCurrentGame();
        Actor actor = game.getActor();
        String[] currentItems = actor.getItems();

        this.console.println("Current items:");
        this.console.println("--------------");
        for (String item : currentItems) {

            this.console.print("- ");
            this.console.print(item);
            this.console.println();
        }
        return true;
    }

}

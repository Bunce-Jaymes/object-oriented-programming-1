/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class DoorNumber1View extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("You bump into the door, it creaks open a bit\n"
                + "Would you like to open it? (Type yes)\n"
                + "=======================================\n"
                + "Enter: ");
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase().trim();
            this.console.println("The door swings open and you can now pass through");
        return true;
    }
}

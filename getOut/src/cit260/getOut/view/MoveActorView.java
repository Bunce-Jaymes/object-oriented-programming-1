/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.exceptions.MapControlExceptions;
import cit260.getOut.model.Actor;
import java.lang.String;
import cit260.getOut.control.MapControl;
import cit260.getOut.model.Game;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class MoveActorView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("Enter L for Left, Enter R for Right,"
                + "\nEnter U for Up, Enter D for down\n"
                + "*(Help: You will only move one space)*\n"
                + "or Q - Quit\n"
                + "=======================================\n"
                + "Enter a key:");

        inputs[0] = mainInput;
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        boolean complete = false;

        String direction = inputs[0];
        Game game = GetOut.getCurrentGame();
        Actor Raphael = game.getActor();

        if ("U".equals(direction) || "L".equals(direction) || "D".equals(direction) || "R".equals(direction)) {
            try {
                MapControl.moveActor(Raphael, direction);
                complete = true;
                return complete;
            } catch (MapControlExceptions ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
                complete = true;
                return complete;
            }

        } 
        return false;
    }
}

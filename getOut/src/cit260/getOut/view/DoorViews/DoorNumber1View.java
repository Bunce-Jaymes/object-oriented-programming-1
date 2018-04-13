/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.DoorViews;

import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.view.View;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class DoorNumber1View extends View {

    @Override
    public String[] getInputs() { 
        String[] inputs = new String[1];
        String mainInput = "w";
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase().trim();
        this.console.println("You bump into the door, it creaks open a bit\n" + "The door swings open and you can now pass through");
        Game game = GetOut.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        Actor actor = game.getActor();

        int currentRow = actor.getX();
        int currentColumn = actor.getY();

        locations[1][2].setVisited(true);
        locations[1][3].setActor(actor);
        locations[1][3].setVisited(true);
        actor.setX(currentRow);
        actor.setY(currentColumn + 1);
        return true;
    }
}

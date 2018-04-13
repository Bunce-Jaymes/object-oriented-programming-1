/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.DoorViews;

import cit260.getOut.exceptions.ForceExceptions;
import cit260.getOut.control.forceLockDoorControl;
import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.view.ErrorView;
import cit260.getOut.view.View;
import getout.GetOut;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class DoorNumber4View extends View {

    void displayDemoTestView02() throws ForceExceptions {

        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0];

            if (value.equals('Q') || inputs.length < 1) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];
        String acceleration = null;
        String mass = null;

        boolean valid = false;
        while (valid == false) {

            this.console.println("This door is locked and you need to break the lock,");
            this.console.print("\nYou need to configure the force by entering the mass of the hammer and speed of your swing"
                    + "\n or Q - Quit");
            this.console.println("=======================================");
            this.console.println("Enter an how fast you are swinging the hammer in meters/second: ");
            Scanner input;

            try {
                acceleration = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }

            acceleration = acceleration.trim();
            this.console.println("=======================================");

            this.console.println("=======================================");
            this.console.println("Enter how much mass the hammer has : ");

            try {
                mass = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            mass = mass.trim();
            this.console.println("=======================================");

            if (mass.length() < 1 || acceleration.length() < 1) {

                ErrorView.display(this.getClass().getName(), "YOU suck");
                continue;

            } else {
                inputs[0] = acceleration;
                inputs[1] = mass;
                valid = true;

            }

        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        boolean complete = false;

        try {

            double acceleration = Double.parseDouble(inputs[0]);
            double mass = Double.parseDouble(inputs[1]);
            try {
                double calcForce = forceLockDoorControl.calcForce(mass, acceleration);
            } catch (ForceExceptions ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            this.console.println("The door is unlocked");
            Game game = GetOut.getCurrentGame();
            Map map = game.getMap();
            Location[][] locations = map.getLocations();
            Actor actor = game.getActor();

            int currentRow = actor.getX();
            int currentColumn = actor.getY();

            locations[6][4].setVisited(true);
            locations[6][3].setActor(actor);
            locations[6][3].setVisited(true);
            actor.setX(currentRow);
            actor.setY(currentColumn - 1);
            
            this.console.println("You open the door and find a key laying on the floor.\n"
                        + "It shimmers and glows in your hand. Might be handy later.\n"
                        + "**GREEN KEY is added to your INVENTORY**\n"
                + "=======================================");

                String[] inventory = actor.getItems();
                inventory[7] = "Green-Key";
                actor.setItems(inventory);
            complete = true;

        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "Please enter a 4 digit number with no letters\n" + "=======================================");
        }
        return complete;
    }
}

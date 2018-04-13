/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.GameMenus;

import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.view.ErrorView;
import cit260.getOut.view.InventoryView;
import cit260.getOut.view.MoveActorView;
import cit260.getOut.view.ToolListView;
import cit260.getOut.view.View;
import getout.GetOut;

/**
 *
 * @author jayme
 */
class GameMenuView extends View {

    public GameMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("V - View Map\n"
                + "M - Move player\n"
                + "I - View inventory\n"
                + "T - View list of tools\n"
                + "S - Save game\n"
                + "H - Help\n"
                + "X - Exit game menu\n"
                + "=======================================\n"
                + "Enter a key:");
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "V":
                viewMap();
                break;
            case "M":
                movePlayer();
                break;
            case "I":
                viewInventory();
                break;
            case "T":
                viewToolList();
                break;
            case "S":
                saveGame();
                break;
            case "H":
                helpMenu();
                break;
            case "X":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item.");
        }
        return false;
    }

    private void viewMap() {
        Game game = GetOut.getCurrentGame();

        Location[][] location = GetOut.getCurrentGame().getMap().getLocations();
        this.console.println("Get Out Map");
        this.console.println("     0     1     2     3     4     5     6     7     8     9");

        for (int i = 0; i < location.length; i++) {
            int num = i + 1 - 1;
            this.console.print("----------------------------------------------------------------\n" + num);

            for (int c = 0; c < location[0].length; c++) {
                this.console.print(" | ");

                Location loc = location[i][c];
                if (loc.isVisited()) {
                    String symbol = loc.getScene().getSymbol();
                    this.console.print(symbol);
                } else {
                    this.console.print("???");
                }
            }
            this.console.print(" |\n");
        }
        this.console.print("----------------------------------------------------------------\n");
        this.console.println("You are currently located at: " + GetOut.getCurrentGame().getActor().getX() + "," + GetOut.getCurrentGame().getActor().getY());
        this.console.println();
    }

    private void movePlayer() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
        this.console.println("=======================================");
    }

    private void viewInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
        this.console.println("=======================================");
    }

    private void viewToolList() {
        ToolListView toolListView = new ToolListView();
        toolListView.displayoolListView();
        this.console.println("=======================================");
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
        this.console.println("=======================================");
    }

    private void helpMenu() {
        helpMenuView helpMenuView = new helpMenuView();
        helpMenuView.display();
        this.console.println("=======================================");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.geOut.exceptions.PinExceptions;
import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import getout.GetOut;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "E - Explore location\n"
                + "S - Save game\n"
                + "H - Help\n"
                + "X - Exit game menu\n"
                + "D - To demo pinCodeDoorControl View\n"
                + "F - To demo forceLockDoorControl View\n"
                + "A - To demo roomTwo View\n"
                + "Z - To demo DoorNum3\n"
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
            case "E":
                exploreLocation();
                break;
            case "S":
                saveGame();
                break;
            case "H":
                helpMenu();
                break;
            case "X":
                return true;
            case "D":
        {
            try {
                demoTestView();
            } catch (PinExceptions ex) {
                System.out.println(ex.getMessage());
            }
        }   
                break;
            case "F":
                demoTestView02();
                break;
            case "A":
                roomTwoView();
                break;
            case "Z":
                doorNum3();
                break;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    private void viewMap() {
        Game game = GetOut.getCurrentGame();

        Location[][] location = GetOut.getCurrentGame().getMap().getLocations();
        System.out.println("Get Out Map");
        System.out.println("     0     1     2     3     4     5     6     7     8     9");

        for (int i = 0; i < location.length; i++) {
            int num = i + 1 - 1;
            System.out.print("----------------------------------------------------------------\n" + num);

            for (int c = 0; c < location[0].length; c++) {
                System.out.print(" | ");

                Location loc = location[i][c];
                if (loc.isVisited()) {
                    String symbol = loc.getScene().getSymbol();
                    System.out.print(symbol);
                } else {
                    System.out.print("???");
                }
            }
            System.out.print(" |\n");
        }
          System.out.print("----------------------------------------------------------------\n");
          System.out.println("You are currently located at: " + GetOut.getCurrentGame().getActor().getX() +"," + GetOut.getCurrentGame().getActor().getY());
          System.out.println();
    }

    private void movePlayer() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
        System.out.println("=======================================");
    }

    private void viewInventory() {
        System.out.println("***viewInventory Called***");
        System.out.println("=======================================");
    }

    private void viewToolList() {
        ToolListView toolListView = new ToolListView();
        toolListView.displayoolListView();
        System.out.println("=======================================");
    }

    private void exploreLocation() {
        System.out.println("***exploreLocation Called***");
        System.out.println("=======================================");
    }

    private void saveGame() {
        System.out.println("***saveGame Called***");
        System.out.println("=======================================");
    }

    private void helpMenu() {
        helpMenuView helpMenuView = new helpMenuView();
        helpMenuView.display();
        System.out.println("=======================================");
    }

    private void demoTestView() throws PinExceptions {
        DemoTestView demoTestView = new DemoTestView();
        demoTestView.displayDemoTestView();
        System.out.println("=======================================");
    }

    private void demoTestView02() {
        DemoTestView02 demoTestView2 = new DemoTestView02();
        demoTestView2.displayDemoTestView02();
        System.out.println("=======================================");
    }

    private void doorNum3() {
        DemoDoorNum3 demodoorNum3 = new DemoDoorNum3();
        demodoorNum3.display();
        System.out.println("=======================================");
    }

    private void roomTwoView() {
        RoomTwo roomTwoView = new RoomTwo();
        roomTwoView.display();
        System.out.println("=======================================");
    }
}

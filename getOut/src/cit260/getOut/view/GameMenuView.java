/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import java.util.Scanner;

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
        String mainInput = this.getInputs("V - View Map\n"+ 
                "M - Move player\n"
                + "I - View inventory\n"
                + "T - View list of tools\n"
                + "E - Explore location\n"
                + "S - Save game\n"
                + "H - Help\n"
                + "X - Exit game menu\n"
                + "D - To demo pinCodeDoorControl View\n"
                + "F - To demo forceLockDoorControl View\n"
                + "A - To demo roomTwo View\n"
                + "=======================================\n"
                + "nter a key: ");
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
                demoTestView();
                break;
            case "F":
                demoTestView02();
                break;
            case "A":
                roomTwoView();
                break;

            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    private void viewMap() {
        System.out.println("***viewMap Called***");
        System.out.println("=======================================");
    }

    private void movePlayer() {
        System.out.println("***movePlayer Called***");
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

    private void demoTestView() {
        DemoTestView demoTestView = new DemoTestView();
        demoTestView.displayDemoTestView();
        System.out.println("=======================================");
    }

    private void demoTestView02() {
        DemoTestView02 demoTestView2 = new DemoTestView02();
        demoTestView2.displayDemoTestView02();
        System.out.println("=======================================");
    }

    private void roomTwoView() {
        RoomTwo roomTwoView = new RoomTwo();
        roomTwoView.display();
        System.out.println("=======================================");
    }
}

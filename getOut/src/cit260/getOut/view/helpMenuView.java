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
class helpMenuView extends View{

    public helpMenuView() {
    }
   
 @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
           this.console.println("=======================================");
        this.console.println("G - What is the goal of the game?\n" + "M - How to move\n" + "D - Doors open \n" + "T - Tools\n" + "P - To print the helpmenu report\n" + "Q - Quit ");
        this.console.println("=======================================");
        String mainInput = this.getInputs("\n Enter a key: ");
        inputs[0] = mainInput;

        return inputs;

    }

@Override
    public boolean doAction(String[] inputs) {
       String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       switch (menuItem) {
           case "G": goalOfTheGame();
           break;
           case "M": howToMove();
           break;
           case "D": howDoorsOpen();
           break;
           case "T": howTools();
           break;
           case "P": printList();
           break;
           case "Q": return true;
           
           default : ErrorView.display(this.getClass().getName(),"Invalid menu item.");
       }
        return false;
    }

    private void goalOfTheGame() {
        this.console.println("\nThis adventure takes place in an abandoned warehouse in the middle of Central America.\nYou wake up in a dark room, dazed, confused, and unaware how you got there.\nThe objective is to search the area and find a way to GET OUT.  You will need to locate objects in order to escape.\nEach victim has strengths and weaknesses that will be needed to overcome specific challenges.\n" +
        "Along the way there will be a variety of obstacles including locked doors, puzzles.\n");
    }

    private void howToMove() {
       this.console.println("\nEnter in coordinates based on where you want to move the character.\nEnter coordinates in this manner:  (A, 1).\nYou can only go to locations that have been opened on the map\n");
    }

    private void howDoorsOpen() {
        this.console.println("\nThere are seven doors that you must unlock using a series of equations,\nitems or keys that are found throughout the building in order to escape the building.\nEach door you visit will prompt you to ask would you like to open the door.\nIt will either say it is unlocked or tell you the door is locked. \nIf it is locked it will display what you need to do to unlock.\nExample please find a key, or enter the pin, etc.\n");
    }
    private void howTools() {
        this.console.println("\nOpen the game menu press T to view tools.\nYou can see all the tools that you have found so far.");
}

    private void printList() {
        FilePrintHelpView filePrintHelpView = new FilePrintHelpView();
        filePrintHelpView.display();
        this.console.println("=======================================");
    }
 }

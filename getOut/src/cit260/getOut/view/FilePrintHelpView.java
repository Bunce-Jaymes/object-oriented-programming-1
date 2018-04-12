/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.model.Item;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Samuel Prettyman
 */
public class FilePrintHelpView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("Type the path, where you would like to save the list of items\n"
                + "Example: C:/Users/tmp/items.dat"
                + "\n or Q - To go back"
                + "\n=======================================\n"
                + "Enter the path with file name to save your current game (Remeber to add .dat at the end): ");

        inputs[0] = mainInput;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        String[] helpArray = new String[4];
        helpArray[0] = "Goal of the game    This adventure takes place in an abandoned warehouse in the middle of Central America.\nYou wake up in a dark room, dazed, confused, and unaware how you got there.\nThe objective is to search the area and find a way to GET OUT.  You will need to locate objects in order to escape.\nEach victim has strengths and weaknesses that will be needed to overcome specific challenges.\n"
                + "Along the way there will be a variety of obstacles including locked doors, puzzles.\n";
        helpArray[1] = "How to move         Enter in coordinates based on where you want to move the character.\nEnter coordinates in this manner:  (A, 1).\nYou can only go to locations that have been opened on the map\n";
        helpArray[2] = "How doors open      There are seven doors that you must unlock using a series of equations,\\nitems or keys that are found throughout the building in order to escape the building.\\nEach door you visit will prompt you to ask would you like to open the door.\\nIt will either say it is unlocked or tell you the door is locked. \\nIf it is locked it will display what you need to do to unlock.\\nExample please find a key, or enter the pin, etc.\\n\");\n"
                + "";
        helpArray[3] = "How to view tools    Open the game menu press T to view tools.\nYou can see all the tools that you have found so far. ";

        String filePath = inputs[0];
        if (filePath == null) {
            ErrorView.display(this.getClass().getName(), "File path cannot be empty");
        }
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println("\n\n             Help Menu            ");
            out.printf("%n%1s%20s", "Help Object", "Description");
            out.printf("%n%1s%20s", "-----------", "-------------------");
            out.println();
            for (String help : helpArray) {
                out.println(help);
                out.println();
            }
            this.console.println("Report was printed succesfully saved to: " + filePath);
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        return true;
    }

}

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
 * @author jayme
 */
public class FilePrintItemsView extends View {

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
        ArrayList<Item> allItems = new ArrayList();
        allItems.add(Item.DriftPin);
        allItems.add(Item.Hammer);
        allItems.add(Item.Paper);
        allItems.add(Item.Sand);
        allItems.add(Item.TwoLiterBottle);

        String filePath = inputs[0];
        if (filePath == null) {
            ErrorView.display(this.getClass().getName(), "File path cannot be empty");
        }
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println("\n\n             Cunrrent Inventory              ");
            out.printf("%n%1s%20s", "Item", "Description");
            out.printf("%n%1s%20s", "----", "-----------");
            out.println();
            for (Item item : allItems) {
                out.println(item.getItemType() + "    " + item.getDescription());
                out.println();
            }
            this.console.println("Report was printed succesfully saved to: " + filePath);
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        return true;
    }

}

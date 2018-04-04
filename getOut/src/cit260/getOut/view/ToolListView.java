/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import static cit260.getOut.control.ItemSort.sortList;
import cit260.getOut.model.Item;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jayme
 */
public class ToolListView extends View {

    public void displayoolListView() {

        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase();

            if (value.equals('Q') || inputs.length < 1) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String[] getInputs() {
        String[] itemPrint = sortList();
        String input = null;

        for (String item : itemPrint) {
            this.console.println(item);

        }
        this.console.println("E - Exit");

        String[] inputs = new String[1];
        this.console.println("=======================================");

        boolean valid = false;
        try {
            while (valid == false) {
                this.console.println("Enter a key to see more information about a item: ");
                input = this.keyboard.readLine();
                String inputWithTrim = input.trim();
                this.console.println("=======================================");

                if (inputWithTrim.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"You must enter a correct, non-blank value");
                    continue;
                } else {
                    inputs[0] = inputWithTrim;
                    valid = true;
                }
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "H":
                hammer();
                break;
            case "D":
                driftPin();
                break;
            case "P":
                paper();
                break;
            case "T":
                twoLiterBottle();
                break;
            case "S":
                sand();
                break;
            case "E":
                return true;

            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
        }
        return false;
    }

    private void hammer() {
        this.console.println(Item.Hammer.getDescription());
        this.console.println("=======================================");
    }

    private void driftPin() {
        this.console.println(Item.DriftPin.getDescription());
        this.console.println("=======================================");
    }

    private void paper() {
        this.console.println(Item.Paper.getDescription());
        this.console.println("=======================================");
    }

    private void twoLiterBottle() {
        this.console.println(Item.TwoLiterBottle.getDescription());
        this.console.println("=======================================");
    }

    private void sand() {
        this.console.println(Item.Sand.getDescription());
        this.console.println("=======================================");
    }

}

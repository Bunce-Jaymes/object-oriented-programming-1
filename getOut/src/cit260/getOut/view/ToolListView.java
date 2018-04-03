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
            System.out.println(item);

        }
        System.out.println("E - Exit");

        String[] inputs = new String[1];
        System.out.println("=======================================");

        boolean valid = false;
        try {
            while (valid == false) {
                System.out.println("Enter a key to see more information about a item: ");
                input = this.keyboard.readLine();
                String inputWithTrim = input.trim();
                System.out.println("=======================================");

                if (inputWithTrim.length() < 1) {
                    System.out.println("You must enter a correct, non-blank value");
                    continue;
                } else {
                    inputs[0] = inputWithTrim;
                    valid = true;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    private void hammer() {
        System.out.println(Item.Hammer.getDescription());
        System.out.println("=======================================");
    }

    private void driftPin() {
        System.out.println(Item.DriftPin.getDescription());
        System.out.println("=======================================");
    }

    private void paper() {
        System.out.println(Item.Paper.getDescription());
        System.out.println("=======================================");
    }

    private void twoLiterBottle() {
        System.out.println(Item.TwoLiterBottle.getDescription());
        System.out.println("=======================================");
    }

    private void sand() {
        System.out.println(Item.Sand.getDescription());
        System.out.println("=======================================");
    }

}

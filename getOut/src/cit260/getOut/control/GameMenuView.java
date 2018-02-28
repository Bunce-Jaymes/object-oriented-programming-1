/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.view.ToolListView;
import java.util.Scanner;

/**
 *
 * @author jayme
 */
class GameMenuView {
    public void displayGameMenuGame(){
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase();
            
            if (value.equals('Q') || inputs.length < 1 ){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
       String[] inputs = new String[1];
        System.out.println("V - View Map\n" +
        "M - Move player\n" +
        "I - View inventory\n" +
        "T - View list of tools\n" +
        "E - Explore location\n" +
        "S - Save game\n" +
        "H - Help\n" +
        "X - Exit game menu\n" +
        "Q - Quit");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Enter a key: ");
           Scanner input;
           input = new Scanner(System.in);
           String scannedInput = input.nextLine();
           String inputWithTrim = scannedInput.trim();
           
           if (inputWithTrim.length() <1){
               System.out.println("You must enter a correct, non-blank value");
               continue;
           }
           else{
                inputs[0] = inputWithTrim;
                valid = true;
            }
        }
        return inputs;

        } 

    private boolean doAction(String[] inputs) {
      String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       switch (menuItem) {
           case "V": viewMap();
           break;
           case "M": movePlayer();
           break;
           case "I": viewInventory();
           break;
           case "T": viewToolList();
           break;
           case "E": exploreLocation();
           break;
           case "S": saveGame();
           break;
           case "H": helpMenu();
           break;
           case "X": return true;
           case "Q": quit();
           break;
           
           default : System.out.println("Invalid menu item.");
       }
        return false;
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void movePlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewToolList() {
        ToolListView toolListView = new ToolListView();
        toolListView.displayoolListView();
    }

    private void exploreLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

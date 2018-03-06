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
        "D - To demo pinCodeDoorControl View\n" +
        "F - To demo forceLockDoorControl View");
        System.out.println("=======================================");
                
        boolean valid = false;
        while (valid == false){
           System.out.println("Enter a key: ");
           Scanner input;
           input = new Scanner(System.in);
           String scannedInput = input.nextLine();
           String inputWithTrim = scannedInput.trim();
           System.out.println("=======================================");
           
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
           case "D": demoTestView();
           break;
           case "F": demoTestView02();
           break;
         
           
           default : System.out.println("Invalid menu item.");
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
        helpMenuView.displayhelpMenuView();
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
       

   
}


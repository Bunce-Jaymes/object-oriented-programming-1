/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import java.util.Scanner;

/**
 *
 * @author jayme
 */
class helpMenuView {
    public void displayhelpMenuView(){
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
        System.out.println("G - What is the goal of the game?\n" + "M - How to move\n" + "D -  Doors open \n" + "T - Tools\n" + "Q - Quit ");
        boolean valid = false;
        while (valid == false){
           System.out.println("Enter a key: ");
           Scanner input;
           input = new Scanner(System.in);
           String scannedInput = input.nextLine();
           String inputWithTrim = scannedInput.trim();
           
           if (inputWithTrim.length() <1){
               System.out.println("You must enter a non-blank value");
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
           case "G": goalOfTheGame();
           break;
           case "M": howToMove();
           break;
           case "D": howDoorsOpen();
           break;
           case "T": howTools();
           break;
           case "Q": return true;
           
           default : System.out.println("Invalid menu item.");
       }
        return false;
    }
}

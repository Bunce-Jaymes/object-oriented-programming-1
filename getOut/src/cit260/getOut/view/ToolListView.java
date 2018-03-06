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
public class ToolListView {

    public void displayoolListView() {
        
    
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
        System.out.println("H - Hammer\n" +
        "P - Drift Pin\n" +
        "L - Lock Pick\n" +
        "T - Two Liter Bottle\n" +
        "S - Sand\n" +
        "E - Exit");
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
           case "H": hammer();
           break;
           case "P": driftPin();
           break;
           case "L": lockPick();
           break;
           case "T": twoLiterBottle();
           break;
           case "S": sand();
           break;
           case "X": return true;
            case "D": demoTestView();
           break;
           
           
           default : System.out.println("Invalid menu item.");
       }
        return false;
    }

    private void hammer() {
        System.out.println("***Hammer Called***");
        System.out.println("=======================================");
    }

    private void driftPin() {
        System.out.println("***Drift Pin Called***");
        System.out.println("=======================================");
    }

    private void lockPick() {
        System.out.println("***Lock Pick Called***");
        System.out.println("=======================================");
    }

    private void twoLiterBottle() {
      
        System.out.println("***Two liter Bottle Called");
        System.out.println("=======================================");
    }

    private void sand() {
        System.out.println("***Sand Called***");
        System.out.println("=======================================");
        }

    private void demoTestView() {
        DemoTestView demoTestView = new DemoTestView();
        demoTestView.displayDemoTestView();
        System.out.println("=======================================");
    }
        
    }
    


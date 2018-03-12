/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import java.util.Scanner;

/**
 *
 * @author Samuel Prettyman
 */
public abstract class View implements ViewInterface {

    public View() {
        
    }
    
    @Override 
    public void display(){
           boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase();
            
            if (value.equals("Q")){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }
    @Override
       public String getInputs(String promptMessage) {
           
            String[] inputs = new String[1];
            boolean valid = false;
        while (valid == false){
          System.out.println(promptMessage); 
           Scanner input;
           input = new Scanner(System.in);
           String scannedInput = input.nextLine();
           String inputWithTrim = scannedInput.trim().toUpperCase();
           System.out.println("=======================================");
           
           if (inputWithTrim.length() <1){
               System.out.println("You must enter a non-blank value");
               System.out.println("=======================================");
               continue;
           }
           else{
                inputs[0] = inputWithTrim;
                return inputWithTrim;
            }
        }
        return null;
    }
    

}

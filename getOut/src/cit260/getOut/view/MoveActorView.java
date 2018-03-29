/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

/**
 *
 * @author jayme
 */
public class MoveActorView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        String mainInput = this.getInputs("Enter L for Left, Enter R for Right,"
                + "\nEnter U for Up, Enter D for down\n"
                + "=======================================\n"
                + "Enter a key:");
        
        inputs[0] = mainInput;
        
        String mainInput2 = this.getInputs("How many spaces would you like to move?"
                + "=======================================\n"
                + "Enter a number:");
        
        inputs[1] = mainInput2;
        
        return inputs;
        
    }

    @Override
    public boolean doAction(String[] inputs) {
        return false;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view.DoorViews;

import cit260.getOut.view.View;

/**
 *
 * @author jayme
 */
public class FinalDoorView extends View {

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
        String mainInput = "w";
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        this.console.println("There are three tumblers placed on the door\n"
                + "you insert the green, red, and blue key\n"
                + "the locks turn and the heavy door sings open");
        return true;  
    }
    
}

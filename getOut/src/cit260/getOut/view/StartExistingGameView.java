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
public class StartExistingGameView extends View {
    

    @Override
    public String[] getInputs() {
       this.console.println("This displayStartExistingGameView getInputs works");
        
        String[] inputs = new String[1];
        inputs[0] = "displayStartExistingGameView selected";
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        this.console.println("This displayStartExistingGameView doaction works");
        this.console.println("\tinputs = "+ inputs[0]);
        
        return true;
    }
}

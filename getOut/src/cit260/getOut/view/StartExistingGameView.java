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
public class StartExistingGameView {
    public void displayStartExistingGameView(){
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
       System.out.println("This displayStartExistingGameView getInputs works");
        
        String[] inputs = new String[1];
        inputs[0] = "displayStartExistingGameView selected";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("This displayStartExistingGameView doaction works");
        System.out.println("\tinputs = "+ inputs[0]);
        
        return true;
    }
}

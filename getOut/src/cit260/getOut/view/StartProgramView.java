/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

/**
 *
 * @author Jaymes Bunce and Sam Prettyman
 */
public class StartProgramView {
    
    public void displayStartProgramView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            String value = inputs[0].toUpperCase();
            
            if (value.equals('Q') || value.length() <= 1 ){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        System.out.println("*** getInputs() called ***");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("*** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
        
    }
}

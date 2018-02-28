/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

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
        System.out.println("This getInputs works");
        
        String[] inputs = new String[1];
        inputs[0] = "gameMenuSelected";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("This doaction works");
        System.out.println("\tinputs = "+ inputs[0]);
        
        return true;
    }
}
